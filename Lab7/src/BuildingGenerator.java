import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class BuildingGenerator extends JFrame {
	
	private Container contentPane = this.getContentPane();
	private JLabel title = new JLabel("Building Generator");
	private String info = new String();
	private JLabel text = new JLabel(info);
	private String[]  options = {"House", "Apart", "Office"};
	private JComboBox<String> Building = new JComboBox<String>(options);
	private GridBagConstraints c = new GridBagConstraints();
	
	public BuildingGenerator()
	{
		setTitle("Building Generator");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
	}
	
	public void init()
	{
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.ipadx = 20;
		
		title.setFont(new Font("Serif", Font.BOLD, 20));
		
		contentPane.add(title,c);
		
		c.ipadx = 0;
		c.gridx = 0;
		c.gridy = 1;
		
		contentPane.add(Building,c);
		
		
		setVisible(true);
	}
	
	 public void actionPerformed(ActionEvent e)
	  {
	    // display/center the jdialog when the button is pressed
	    if(e.getSource() == options[0])
	    {
	    	House h = new House(5,10,10,10,10,10);
	    	String information = h.toString();
	    	info = information;
	    	text.setText(info);
	    }
	    	
	  }
	
	public static void main(String [] args)
	{
		new BuildingGenerator().init();
	}
}
