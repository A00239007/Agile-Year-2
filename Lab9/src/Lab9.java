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



public class Lab9 extends JFrame implements ActionListener {
	
	private CanvasPanel drawingArea = new CanvasPanel();
	private JButton drawButton = new JButton("Draw");
	private ArrayList<Points> points = new ArrayList<Points>();
	private boolean draw = false;
	
	public Lab9()
	{
		this.setTitle("Points GUI");
		this.setSize(400, 400);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
	}
	
	public void init()
	{
		drawButton.addActionListener(this);
		this.add(drawButton);
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
			for(int i = 0; i< points.size(); i++)
			{
				g.fillOval(points.get(i).getX()-2, points.get(i).getY()-2, 4, 4);
			}
			if(draw)
			{
				super.paintComponents(g);
				for(int i = 0; i<points.size()-1; i++)
				{
					g.drawLine(points.get(i).getX(), points.get(i).getY(), points.get(i+1).getX(), points.get(i+1).getY());
				}
				g.drawLine(points.get(points.size()-1).getX(), points.get(points.size()-1).getY(), points.get(0).getX(), points.get(0).getY());
				draw = false;
				points = new ArrayList<Points>();
			}
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			points.add(new Points(e.getX(),e.getY()));
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
		draw = true;
		drawingArea.drawLines();
	}
	public static void main(String [] args)
	{
		new Lab9().init();
	}

	
}
