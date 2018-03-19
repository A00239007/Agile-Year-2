package projectgui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 * SetUp Class for the GUI and also looks after the Action Listener as well
 */
public class Insert extends JPanel implements ActionListener{
        // Declareing the buttons, textfields etc...
        
        JMenuItem fileExitItem;
        ButtonGroup radioButtonGroup;
        JPanel mainPanel;
        static JRadioButton domRadioButton, staxRadioButton;
        JLabel nameLabel, titleLabel, collegeLabel, courseLabel, marksLabel;
        static JTextField nameTextArea, titleTextArea, collegeTextArea, courseTextArea, marksTextArea;
        JButton insertButton,clearButton;
        
        int labelX1 = 110;
        int labelY1 = 53;
        int labelX2 = labelX1 + 350;
        int labelY2 = labelY1 + 20;
        
        int inputX1 = 160;
        int inputY1 = 80;
        int inputX2 = 210;
        int inputY2 = 20;
    
        public Insert(){
            
            // initialisation of all the Buttons as diffrent objeccts
            radioButtonGroup    = new ButtonGroup();
            mainPanel           = new JPanel();
            domRadioButton      = new JRadioButton();
            staxRadioButton     = new JRadioButton();
            nameLabel           = new JLabel("Name:");
            titleLabel          = new JLabel("Title:");
            collegeLabel        = new JLabel("College:");
            courseLabel         = new JLabel("School:");
            marksLabel          = new JLabel("Age:");
            nameTextArea        = new JTextField();
            titleTextArea       = new JTextField();
            collegeTextArea     = new JTextField();
            courseTextArea      = new JTextField();
            marksTextArea       = new JTextField();
            insertButton        = new JButton();
            clearButton         = new JButton();
            
            // setting up each of the GUI components
            // Main Panel that will hold all the components
            mainPanel.setLayout(null);
            mainPanel.setBounds(0,0,530,400);
            mainPanel.setBackground(new Color(226, 224, 213));
            mainPanel.setVisible(true);
            add(mainPanel);

            // DOM Radio Button
            radioButtonGroup.add(domRadioButton);
            domRadioButton.setText("DOM");
            domRadioButton.setBounds(190,34, 70, 17);
            domRadioButton.setBackground(new Color(240, 230,140));
            domRadioButton.addActionListener(Insert.this);
            domRadioButton.setSelected(true); // make the sax button selected
            mainPanel.add(domRadioButton);

            // StAX Radio Button
            radioButtonGroup.add(staxRadioButton);
            staxRadioButton.setText("StAX");
            staxRadioButton.setBounds(270,34, 90, 17);
            staxRadioButton.setBackground(new Color(240, 230,140));
            staxRadioButton.addActionListener(Insert.this);
            mainPanel.add(staxRadioButton);
            
            // Info Label
            nameLabel.setBounds(labelX1,labelY1, labelX2,labelY2);
            mainPanel.add(nameLabel);
            // Main Text Output Area
            nameTextArea.setBounds(inputX1, inputY1, inputX2, inputY2);
            mainPanel.add(nameTextArea);
            
            // Info Label
            titleLabel.setBounds(labelX1,labelY1+20, labelX2,labelY2+20);
            mainPanel.add(titleLabel);
            // Main Text Output Area
            titleTextArea.setBounds(inputX1, inputY1+30, inputX2, inputY2);
            mainPanel.add(titleTextArea);
            
            // Info Label
            collegeLabel.setBounds(labelX1,labelY1+40, labelX2, labelY2+40);
            mainPanel.add(collegeLabel);
            // Main Text Output Area
            collegeTextArea.setBounds(inputX1, inputY1+60, inputX2, inputY2);
            mainPanel.add(collegeTextArea);
            
            // Info Label
            courseLabel.setBounds(labelX1,labelY1+60, labelX2, labelY2+60);
            mainPanel.add(courseLabel);
            // Main Text Output Area
            courseTextArea.setBounds(inputX1, inputY1+90, inputX2, inputY2);
            mainPanel.add(courseTextArea);
            
            // Info Label
            marksLabel.setBounds(labelX1,labelY1+80, labelX2, labelY2+80);
            mainPanel.add(marksLabel);
            // Main Text Output Area
            marksTextArea.setBounds(inputX1, inputY1+120, inputX2, inputY2);
            mainPanel.add(marksTextArea);
           

            // Insert Button
            insertButton.setText("Insert");
            insertButton.setBounds(210,240,90,23);
            insertButton.addActionListener(Insert.this);
            mainPanel.add(insertButton);
            
            // Clear Button
            clearButton.setText("Clear All");
            clearButton.setBounds(210,270,90,23);
            clearButton.addActionListener(Insert.this);
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
        if (e.getSource() == insertButton){
            String title = titleTextArea.getText();
            String name = nameTextArea.getText();
            String college = collegeTextArea.getText();
            String school = courseTextArea.getText();
            String age = marksTextArea.getText();
            
            if(domRadioButton.isSelected()){
                try {
                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder = factory.newDocumentBuilder();
                    File inputFile = new File("C:\\Users\\Simon Harper\\Documents\\Repo\\agile-year-2\\2018_WebDev22_XML_Project_Template\\xmlfiles\\Students.xml");
                    
                    Document dom = builder.parse(inputFile);
                    dom.getDocumentElement().normalize();
                    Element root = dom.getDocumentElement();
                    
                    Element student = dom.createElement("student");
                    student.setAttribute("title", title);
                    
                    Element nme = dom.createElement("name");
                    Text nameText = dom.createTextNode(name);
                    nme.appendChild(nameText);
                    student.appendChild(nme);
                    
                    Element ag = dom.createElement("age");
                    Text ageText = dom.createTextNode(age);
                    ag.appendChild(ageText);
                    student.appendChild(ag);
                    
                    Element colleg = dom.createElement("college");
                    Text collegeText = dom.createTextNode(college);
                    colleg.appendChild(collegeText);
                    student.appendChild(colleg);
                    
                    Element schol = dom.createElement("school");
                    Text schoolText = dom.createTextNode(school);
                    schol.appendChild(schoolText);
                    student.appendChild(schol);
                    
                    root.appendChild(student);
                    
                    TransformerFactory transFactory = TransformerFactory.newInstance();
                    Transformer transformer = transFactory.newTransformer();
                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                    DOMSource source = new DOMSource(dom);
                    StreamResult result = new StreamResult(inputFile);
                    transformer.transform(source, result);
                    
                    JOptionPane.showMessageDialog(mainPanel, "New element added using DOM!", "Success!", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception ex) {
                    Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(staxRadioButton.isSelected()){
                try {
                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder = factory.newDocumentBuilder();
                    File inputFile = new File("C:\\Users\\Simon Harper\\Documents\\Repo\\agile-year-2\\2018_WebDev22_XML_Project_Template\\xmlfiles\\Students.xml");
                    
                    Document dom = builder.parse(inputFile);
                    dom.getDocumentElement().normalize();
                    
                    
                    JOptionPane.showMessageDialog(mainPanel, "New element added using StAX!", "Success!", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception ex) {
                    Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (e.getSource() == clearButton) {
            // When the Clear Button is pressed...
            nameTextArea.setText("");
            titleTextArea.setText("");
            collegeTextArea.setText("");
            courseTextArea.setText("");
            marksTextArea.setText("");
        }
    }    
}
