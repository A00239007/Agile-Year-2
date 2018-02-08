import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;


public class Part_3 extends JFrame{
	
	private CanvasPanel drawingArea = new CanvasPanel();
	
	public Part_3()
	{
		setTitle("Part_3");
		setSize(750,750);
	}
	
	public void init()
	{
		add(drawingArea);
		setVisible(true);
		
	}
	
	public class CanvasPanel extends JPanel implements MouseInputListener
	{
		private ArrayList<Ellipse2D> circle = new ArrayList<Ellipse2D>();
		private String[] options = {"Rectangle","Circle"};
		private JComboBox<String> selection = new JComboBox<String>(options);
		private JButton draw = new JButton("Draw");
		private ArrayList<Rectangle2D> rectangle = new ArrayList<Rectangle2D>();
		private int choice;
		private boolean mouseDown = false;
		private boolean mouseDown2 = false;
		private int circleElement;
		private int rectangleElement;
		
		
		
		public CanvasPanel()
		{
			add(draw);
			add(selection);
			addMouseListener(this);
			addMouseMotionListener(this);
			this.setPreferredSize(new Dimension(500,500));
			this.setBackground(Color.gray);
			draw.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(selection.getSelectedIndex()==0)
					{
						rectangle.add(new Rectangle2D.Double(0,0, 100, 100));
						repaint();
					}
					else if(selection.getSelectedIndex()==1)
					{
						circle.add(new Ellipse2D.Double(0,0, 100, 100));
						repaint();
					}
				}
			});
		}
		
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			for(Rectangle2D r : rectangle)
			{
				drawRect(g,r);
			}
		
			for(Ellipse2D c : circle)
			{
				drawCircle(g,c);
			}
		
		}
		
		public void drawRect(Graphics g,Rectangle2D r)
		{
			g.fillRect((int)r.getX(),(int)r.getY(),(int)r.getWidth(),(int)r.getHeight());
		}
		
		public void drawCircle(Graphics g,Ellipse2D c)
		{
			g.fillOval((int)c.getX(),(int)c.getY(),(int)c.getWidth(),(int)c.getHeight());
		}
		

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
//			r = new Rectangle(e.getX() - 10, e.getY() -10, 20, 20);
//			
//			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			int x = e.getX();
			int y = e.getY();
			
			for(int i = 0; i<rectangle.size(); i++)
			{
				if(rectangle.get(i).contains(x,y))
				{
					rectangleElement = i;
					
					mouseDown = true;
				}
			}
			for(int i = 0; i<circle.size(); i++)
			{
				if(circle.get(i).contains(x,y))
				{
					circleElement = i;
					
					mouseDown2 = true;
				}
			}
			
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			mouseDown = false;
			mouseDown2 = false;
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			if(mouseDown)
			{
				rectangle.set(rectangleElement,new Rectangle2D.Double(e.getX()-50,e.getY()-50,100,100));
				repaint();
			}
			else if(mouseDown2)
			{
				circle.set(circleElement,new Ellipse2D.Double((int)e.getX()-50,(int)e.getY()-50, 100, 100));
				repaint();
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main (String [] args)
	{
		new Part_3().init();
	}

}
