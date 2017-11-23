import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BuildingGenerator extends JFrame implements ActionListener{

	private Container contentPane = this.getContentPane();
	private JLabel title = new JLabel("Building Generator");
	private JLabel wallWidth = new JLabel("Wall Width");
	private JLabel wallLength = new JLabel("Wall Length");
	private JLabel roofHeight = new JLabel("Roof Height");
	private JLabel roofWidth = new JLabel("Roof Width");
	private JLabel roofLength = new JLabel("Roof Length");
	private JLabel extra = new JLabel();
	private JTextField wallL = new JTextField();
	private JTextField wallW = new JTextField();
	private JTextField roofL = new JTextField();
	private JTextField roofW = new JTextField();
	private JTextField roofH = new JTextField();
	private JTextField Extra = new JTextField();
	private JButton show = new JButton("Show");
	private String info = new String();
	private JLabel text = new JLabel(info);
	private String[] options = { "House", "Apart", "Office" };
	private JComboBox<String> selection = new JComboBox<String>(options);
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
		c.ipadx = 0;
		c.ipady = 20;
		
		title.setFont(new Font("Serif", Font.BOLD, 20));
		
		contentPane.add(title,c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.ipadx = 0;
		c.ipady = 5;
		
		contentPane.add(selection,c);
		selection.setSelectedIndex(0);
		
		c.gridx = 0;
		c.gridy = 2;
		c.ipadx = 5;
		c.ipady = 5;
		
		contentPane.add(wallLength,c);
		
		c.gridx = 1;
		c.gridy = 2;
		c.ipadx = 0;
		c.ipady = 5;
		
		contentPane.add(wallL,c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.ipadx = 5;
		c.ipady = 5;
		
		contentPane.add(wallWidth,c);
		
		c.gridx = 1;
		c.gridy = 3;
		c.ipadx = 0;
		c.ipady = 5;
		
		contentPane.add(wallW,c);
		
		c.gridx = 0;
		c.gridy = 4;
		c.ipadx = 5;
		c.ipady = 5;
		
		contentPane.add(roofLength,c);
		
		c.gridx = 1;
		c.gridy = 4;
		c.ipadx = 0;
		c.ipady = 5;
		
		contentPane.add(roofL,c);
		
		c.gridx = 0;
		c.gridy = 5;
		c.ipadx = 5;
		c.ipady = 5;
		
		contentPane.add(roofWidth,c);
		
		c.gridx = 1;
		c.gridy = 5;
		c.ipadx = 0;
		c.ipady = 5;
		
		contentPane.add(roofW,c);
		
		c.gridx = 0;
		c.gridy = 6;
		c.ipadx = 5;
		c.ipady = 5;
		
		contentPane.add(roofHeight,c);
		
		c.gridx = 1;
		c.gridy = 6;
		c.ipadx = 0;
		c.ipady = 5;
		
		contentPane.add(roofH,c);
		
		c.gridx = 0;
		c.gridy = 7;
		c.ipadx = 5;
		c.ipady = 5;
		
		contentPane.add(extra,c);
		
		c.gridx = 1;
		c.gridy = 7;
		c.ipadx = 0;
		c.ipady = 5;
		
		contentPane.add(Extra,c);
		
		c.gridx = 0;
		c.gridy = 8;
		c.ipadx = 5;
		c.ipady = 5;
		
		contentPane.add(show,c);
		show.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(selection.getSelectedIndex()==0)
				{
					House h = new House(4,10,10,10,10,10);
					int wall_W = h.getWWidth();
					int wall_L = h.getWLength();
					int roof_H = h.getHeight();
					int roof_L = h.getLength();
					int roof_W = h.getWidth();
					int rooms = h.getRoom();
					wallW.setText(""+wall_W);
					wallL.setText(""+wall_L);
					roofH.setText(""+roof_H);
					roofL.setText(""+roof_L);
					roofW.setText(""+roof_W);
					Extra.setText(""+rooms);
					extra.setText("Rooms: ");
				}
				else if(selection.getSelectedIndex()==1)
				{
					ApartmentBlock a = new ApartmentBlock(42,102,110,140,510,110);
					int wall_W = a.getWWidth();
					int wall_L = a.getWLength();
					int roof_H = a.getHeight();
					int roof_L = a.getLength();
					int roof_W = a.getWidth();
					int rooms = a.getUnits();
					wallW.setText(""+wall_W);
					wallL.setText(""+wall_L);
					roofH.setText(""+roof_H);
					roofL.setText(""+roof_L);
					roofW.setText(""+roof_W);
					Extra.setText(""+rooms);
					extra.setText("Units: ");
				}
				else
				{
					OfficeBlock o = new OfficeBlock(4,20,40,20,14,112);
					int wall_W = o.getWWidth();
					int wall_L = o.getWLength();
					int roof_H = o.getHeight();
					int roof_L = o.getLength();
					int roof_W = o.getWidth();
					int rooms = o.getCubicles();
					wallW.setText(""+wall_W);
					wallL.setText(""+wall_L);
					roofH.setText(""+roof_H);
					roofL.setText(""+roof_L);
					roofW.setText(""+roof_W);
					Extra.setText(""+rooms);
					extra.setText("Cubicles: ");
				}
			}
		});
		setVisible(true);
	}
	
	
	public static void main(String [] args)
	{
		new BuildingGenerator().init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


