import java.awt.*;

import java.awt.event.MouseEvent;

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
		
		private Rectangle r = new Rectangle(0,0);
		private boolean mouseDown = false;
		
		
		
		public CanvasPanel()
		{
			addMouseListener(this);
			addMouseMotionListener(this);
			this.setPreferredSize(new Dimension(500,500));
			this.setBackground(Color.gray);
		}
		
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			g.fillRect((int)r.getX(),(int) r.getY(), (int) r.getHeight(),(int)  r.getWidth());
		}
		

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			r = new Rectangle(e.getX() - 10, e.getY() -10, 20, 20);
			
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if(r.contains(e.getX(), e.getY()))
			{
				mouseDown = true;
			}
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			mouseDown = false;
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
				r = new Rectangle(e.getX()- 50, e.getY() -50, 100,100);
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
