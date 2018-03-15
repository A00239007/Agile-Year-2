package projectgui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuItem;

/**
 * SetUp Class for the GUI and also looks after the Action Listener as well
 */
public class Parse extends JPanel implements ActionListener{
        // Declareing the buttons, textfields etc...
        
        JMenuItem fileExitItem;
        ButtonGroup radioButtonGroup;
        JPanel mainPanel;
        static JRadioButton saxRadioButton, domRadioButton, staxRadioButton;
        JLabel infoLabel;
        JScrollPane jScrollPane;
        static JTextArea mainTextArea;
        JButton parseButton,clearButton;
    
        public Parse(){
            // initialisation of all the Buttons as diffrent objeccts
            radioButtonGroup    = new ButtonGroup();
            mainPanel           = new JPanel();
            saxRadioButton      = new JRadioButton();
            domRadioButton      = new JRadioButton();
            staxRadioButton     = new JRadioButton();
            infoLabel           = new JLabel();
            jScrollPane         = new JScrollPane();
            mainTextArea        = new JTextArea();
            parseButton         = new JButton();
            clearButton         = new JButton();
            
            // setting up each of the GUI components
            // Main Panel that will hold all the components
            mainPanel.setLayout(null);
            mainPanel.setBounds(0,0,530,400);
            mainPanel.setBackground(new Color(226, 224, 213));
            mainPanel.setVisible(true);
            add(mainPanel);
            
            // SAX Radio Buttons
            radioButtonGroup.add(saxRadioButton);
            saxRadioButton.setText("SAX");
            saxRadioButton.setBounds(160,34,70,17);
            saxRadioButton.setBackground(new Color(240, 230,140));
            saxRadioButton.addActionListener(Parse.this); // set up the actio listener
            saxRadioButton.setSelected(true); // make the sax button selected
            mainPanel.add(saxRadioButton);

            // DOM Radio Button
            radioButtonGroup.add(domRadioButton);
            domRadioButton.setText("DOM");
            domRadioButton.setBounds(230,34, 70, 17);
            domRadioButton.setBackground(new Color(240, 230,140));
            domRadioButton.addActionListener(Parse.this);
            mainPanel.add(domRadioButton);

            // StAX Radio Button
            radioButtonGroup.add(staxRadioButton);
            staxRadioButton.setText("StAX");
            staxRadioButton.setBounds(300,34, 90, 17);
            staxRadioButton.setBackground(new Color(240, 230,140));
            staxRadioButton.addActionListener(Parse.this);
            mainPanel.add(staxRadioButton);
            
            // Info Label
            infoLabel.setText("Info:");
            infoLabel.setBounds(20,130, 35, 13);
            mainPanel.add(infoLabel);

            // Main Text Output Area
            mainTextArea.setText("");
            mainTextArea.setEditable(false);
            jScrollPane.setViewportView(mainTextArea);
            jScrollPane.setBounds(20, 150, 490, 200);
           
            mainPanel.add(jScrollPane);

            // Parse Button
            parseButton.setText("Parse");
            parseButton.setBounds(180,70,70,23);
            parseButton.addActionListener(Parse.this);
            mainPanel.add(parseButton);
            
            // Clear Button
            clearButton.setText("Clear All");
            clearButton.setBounds(260,70,90,23);
            clearButton.addActionListener(Parse.this);
            mainPanel.add(clearButton);
    }
   
    /**
     * The following function is an overriding function for the Action listener
     * because the SetUp class implements the ActionListener
     * 
     * @param e - Action Event
     */
    
    @Override
    public void actionPerformed(ActionEvent e){
        //Handle open button action.
        if (e.getSource() == parseButton){
            if(saxRadioButton.isSelected()){
                try {
                    mainTextArea.append("XML parsed using SAX\n");
                    SAXParser saxParser = new SAXParser();
                    saxParser.parser();
                } catch (Exception exception) {
                    
                }
                
            }
            else if(domRadioButton.isSelected()){
                try {
                    DOMParser domParser = new DOMParser();
                    ArrayList<Student> domParse = new ArrayList(domParser.parser());
                    mainTextArea.append("XML parsed using DOM\n");
                    for (int i = 0; i < domParse.size(); i++) {
                        mainTextArea.append(domParse.get(i).toString()+"\n");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Parse.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(staxRadioButton.isSelected()){
                // do StAX stuff
                /*
                *
                * This is where your StAX parsing logic should go.
                *
                */
                mainTextArea.append("XML parsed using StAX\n");
            }
            mainTextArea.setCaretPosition(0);
        } else if (e.getSource() == clearButton) {
            // When the Clear Button is pressed...
            mainTextArea.setText(null);
        }
    }    
}
