import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Part_2 extends JFrame implements ActionListener {
	
	private CanvasPanel drawingArea = new CanvasPanel();
	
	public Part_2()
	{
		this.setTitle("Marks gay");
		this.setSize(400, 400);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
	}
	
	public void init()
	{
		this.add(drawingArea);
		this.setVisible(true);
	}
	
	class CanvasPanel extends JPanel implements MouseListener
	{
		
		public CanvasPanel()
		{
			this.setBackground(Color.gray);
			this.addMouseListener(this);
			this.setPreferredSize(new Dimension(350,300));
		}
		
		public void drawLines()
		{
			repaint();
		}
		
		public void paint(Graphics g)
		{
			super.paint(g);
			double check = Math.random()*100;
			if(check>0 && check < 50)
			{
				g.setColor(Color.red);
			    g.fillOval((int)(Math.random()*(20+1)),(int)(Math.random()*(50+1)),(int)(Math.random()*(100+1)),(int)(Math.random()*(100+1)));
			    
			}
			else
			{
				
			    g.setColor(Color.blue);
			    g.fillRect(100, 100, 100, 200);
			}
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		drawingArea.drawLines();
	}
	public static void main(String [] args)
	{
		new Part_2().init();
	}

	
}
