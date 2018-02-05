import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Rectangle;
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
	private ShapePanel shapeArea = new ShapePanel();
	
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
	
	class ShapePanel extends JPanel implements MouseListener
	{
		public ShapePanel()
		{
			
			this.setBackground(Color.gray);
			this.addMouseListener(this);
			this.setPreferredSize(new Dimension(350,300));
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
	
	class CanvasPanel extends JPanel implements MouseListener
	{
		public int x,y;
		private int height,width;
		private Color color = Color.BLUE;
		private Rectangle r = new Rectangle(0,0);
		
		public CanvasPanel()
		{
			
			this.setBackground(Color.gray);
			this.addMouseListener(this);
			this.setPreferredSize(new Dimension(350,300));
		}
		
		
		public void paint(Graphics g)
		{
			super.paint(g);
			
			g.setColor(Color.gray);
			g.drawRect(x,y,height,width);
			r =  new Rectangle(x,y,height,width);
			int check = (int)(Math.random()*100);
			if(check>0 && check <=50)
			{
				g.setColor(color);
				g.fillOval(x,y,height,width);
			}
			else if(check>50 && check <=100)
			{
				g.setColor(color);
				g.fillRect(x, y, height, width);
			}
		}
		
		public void changeColor() {
	        if (color == Color.BLUE) 
	        {
	            color = Color.RED;
	        } 
	        else 
	        {
	            color = color.BLUE;
	        }
	        repaint();
	    }
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			if (r.contains(e.getX(),e.getY()))
			{
                changeColor();
            }
			else
			{
				this.height = (int)(Math.random()*100);
				this.width = (int)(Math.random()*100);
				this.x = e.getX()-20;
				this.y = e.getY()-20;
				repaint();
			}
			
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
