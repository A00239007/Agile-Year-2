package projectgui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
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
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

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
                    File inputFile = new File("C:\\Users\\A00239007\\Documents\\Repo\\agile-year-2\\2018_WebDev22_XML_Project_Template\\xmlfiles\\Students.xml");
                    SAXParserFactory factory = SAXParserFactory.newInstance();
                    javax.xml.parsers.SAXParser saxParser = factory.newSAXParser();
                    DefaultHandler handler = new DefaultHandler(){
                        boolean inName = false;
                        boolean inAge = false;
                        boolean inCollege = false;
                        boolean inSchool = false ;
                        boolean title = false;

                        public void startElement(String uri, String localName, String qName,
                                            Attributes attribute) throws SAXException {
                                    if (qName.equalsIgnoreCase("student")) {
                                            String title = attribute.getValue("title");
                                            mainTextArea.append("\nTitle: "+title);
                                    } else if (qName.equalsIgnoreCase("name")) {
                                            inName = true;
                                    } else if (qName.equalsIgnoreCase("age")) {
                                            inAge = true;
                                    } else if (qName.equalsIgnoreCase("college")) {
                                            inCollege = true;
                                    } else if (qName.equalsIgnoreCase("school")) {
                                            inSchool = true;
                                    }
                            }

                        public void characters(char[] c, int start, int length) throws SAXException {
                                    if (inName) {
                                            mainTextArea.append("\nName: " + new String(c, start, length));
                                            inName = false;
                                    } else if (inAge) {
                                            mainTextArea.append("\nAge: " + new String(c, start, length));
                                            inAge = false;
                                    } else if (inCollege) {
                                            mainTextArea.append("\nCollege: " + new String(c, start, length));
                                            inCollege = false;
                                    } else if (inSchool) {
                                            mainTextArea.append("\nSchool: " + new String(c, start, length));
                                            inSchool = false;
                                    }
                            }

                        public void endElement(String uri, String localName, String qName)
                                            throws SAXException {
                                    if (qName.equalsIgnoreCase("student")) {
                                            mainTextArea.append("\n");
                                    }
                            }
                    };
                    saxParser.parse(inputFile, handler);
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
                try {
                    mainTextArea.append("XML parsed using StAX\n");
                    boolean bFirstName = false;
                    boolean bLastName = false;
                    boolean bNickName = false;
                    boolean bMarks = false;
                    File fileInput = new File("C:\\Users\\A00239007\\Documents\\Repo\\agile-year-2\\2018_WebDev22_XML_Project_Template\\xmlfiles\\Students.xml");
                    XMLInputFactory factory = XMLInputFactory.newInstance();
                    XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(fileInput));
                    
                    while(eventReader.hasNext())
                    {
                        XMLEvent event = eventReader.nextEvent();
                        switch(event.getEventType())
                        {
                            case XMLStreamConstants.START_ELEMENT:
                                StartElement startElement = event.asStartElement();
                                String qName = startElement.getName().getLocalPart();
                                if(qName.equalsIgnoreCase("student"))
                                {
                                    
                                    Iterator<Attributes> attribute = startElement.getAttributes();
                                    String title = "";
                                    if(attribute.hasNext())
                                    {
                                        title = attribute.next().getValue("title");
                                    }
                                    mainTextArea.append("\nTitle: "+title);
                                }
                                else if(qName.equalsIgnoreCase("name"))
                                {
                                    bFirstName = true;
                                }
                                else if(qName.equalsIgnoreCase("age"))
                                {
                                    bLastName = true;
                                }
                                else if(qName.equalsIgnoreCase("college"))
                                {
                                    bNickName = true;
                                }
                                else if(qName.equalsIgnoreCase("age"))
                                {
                                    bMarks = true;
                                }
                                break;
                            case XMLStreamConstants.CHARACTERS:
                                Characters characters = event.asCharacters();
                                if(bFirstName)
                                {
                                    mainTextArea.append("\nName: "+characters.getData());
                                    bFirstName = false;
                                }
                                else if(bLastName)
                                {
                                    mainTextArea.append("\nAge: "+characters.getData());
                                    bLastName = false;
                                }
                                else if(bNickName)
                                {
                                    mainTextArea.append("\nCollege: "+characters.getData());
                                    bNickName = false;
                                }
                                else if(bMarks)
                                {
                                    mainTextArea.append("\nSchool: "+characters.getData());
                                    bMarks = false;
                                }
                                break;
                            case XMLStreamConstants.END_ELEMENT:
                                EndElement endElement = event.asEndElement();
                                if(endElement.getName().getLocalPart().equalsIgnoreCase("student"))
                                {
                                    mainTextArea.append("\n");
                                }
                                break;
                        }
                    }
                    mainTextArea.setCaretPosition(0);
                } catch (Exception ex) {
                    
                }
            }
        } else if(e.getSource() == clearButton) {
            // When the Clear Button is pressed...
            mainTextArea.setText(null);
        }
    }    
}
