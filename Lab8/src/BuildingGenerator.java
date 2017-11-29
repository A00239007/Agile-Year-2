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
	private JLabel title = new JLabel("Currency Converter");
	private JLabel info = new JLabel("Enter a Base Currency of Euro");
	private JTextField input = new JTextField();
	private JButton calculate = new JButton("Calculate");
	private JLabel output = new JLabel();
	private String[] options = { "Euro", "USD", "YUAN", "GBP" };
	private JComboBox<String> selection = new JComboBox<String>(options);
	private GridBagConstraints c = new GridBagConstraints();

	public BuildingGenerator()
	{
		setTitle("Currency Converter");
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
		c.ipadx = 10;
		c.ipady = 20;
		
		contentPane.add(info,c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.ipadx = 15;
		c.ipady = 5;
		
		contentPane.add(input,c);
		
		c.gridx = 0;
		c.gridy = 4;
		c.ipadx = 5;
		c.ipady = 5;
		
		contentPane.add(calculate,c);
		
		c.gridx = 0;
		c.gridy = 5;
		c.ipadx = 10;
		c.ipady = 5;
		
		contentPane.add(output,c);
		
		calculate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(selection.getSelectedIndex()==0)
				{
					CurrencyConverter test = new CurrencyConverter(Double.parseDouble(input.getText()), 1);
					output.setText(test.toString());
				}
				else if(selection.getSelectedIndex()==1)
				{
					CurrencyConverter test = new CurrencyConverter(Double.parseDouble(input.getText()), 1.19);
					output.setText(test.toString());
				}
				else if(selection.getSelectedIndex()==2)
				{
					CurrencyConverter test = new CurrencyConverter(Double.parseDouble(input.getText()), 7.82);
					output.setText(test.toString());
				}
				else
				{
					CurrencyConverter test = new CurrencyConverter(Double.parseDouble(input.getText()), .88);
					output.setText(test.toString());
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


