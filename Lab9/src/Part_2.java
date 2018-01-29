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
		public int x,y;
		public CanvasPanel()
		{
			
			this.setBackground(Color.gray);
			this.addMouseListener(this);
			this.setPreferredSize(new Dimension(350,300));
		}
		
		
		public void paint(Graphics g)
		{
			super.paint(g);
			int height = (int)(Math.random()*101);
			int width = (int)(Math.random()*101);
			g.fillOval(x,y,height,width);
					
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			this.x = e.getX()-20;
			this.y = e.getY()-20;
			
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
		
	}
	public static void main(String [] args)
	{
		new Part_2().init();
	}

	
}
