/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

import java.io.FileReader;
import java.util.Iterator;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import org.xml.sax.Attributes;
import static projectgui.Parse.mainTextArea;

/**
 *
 * @author Simon Harper
 */
public class STAXParser {
    public static void main(String [] args)
    {
        boolean bName = false;
        boolean bCollege = false;
        boolean bSchool = false;
        boolean bAge = false;

        try {
           XMLInputFactory factory = XMLInputFactory.newInstance();
           XMLEventReader eventReader =
           factory.createXMLEventReader(new FileReader("C:\\Users\\Simon Harper\\Documents\\Repo\\agile-year-2\\2018_WebDev22_XML_Project_Template\\xmlfiles\\Students.xml"));

           while(eventReader.hasNext()) {
              XMLEvent event = eventReader.nextEvent();

              switch(event.getEventType()) {

                 case XMLStreamConstants.START_ELEMENT:
                    StartElement startElement = event.asStartElement();
                    String qName = startElement.getName().getLocalPart();

                 if (qName.equalsIgnoreCase("student")) {
                    System.out.println("Start Element : student");
                    Iterator<Attributes> attributes = startElement.getAttributes();
                    String title = attributes.next().getValue("title");
                    System.out.println("Title : " + title);
                 } else if (qName.equalsIgnoreCase("name")) {
                    bName = true;
                 } else if (qName.equalsIgnoreCase("age")) {
                    bAge = true;
                 } else if (qName.equalsIgnoreCase("college")) {
                    bCollege = true;
                 }
                 else if (qName.equalsIgnoreCase("school")) {
                    bSchool = true;
                 }
                 break;

                 case XMLStreamConstants.CHARACTERS:
                    Characters characters = event.asCharacters();
                 if(bName) {
                    System.out.println("\nName: " + characters.getData());
                    bName = false;
                 }
                 if(bAge) {
                    System.out.println("\nAge: " + characters.getData());
                    bAge = false;
                 }
                 if(bCollege) {
                    System.out.println("\nCollege: " + characters.getData());
                    bCollege = false;
                 }
                 if(bSchool) {
                    System.out.println("\nSchool: " + characters.getData());
                    bSchool = false;
                 }
                 break;

                 case XMLStreamConstants.END_ELEMENT:
                     EndElement endElement = event.asEndElement();

                 if(endElement.getName().getLocalPart().equalsIgnoreCase("student")) {
                    System.out.println("End Element : student");
                    System.out.println();
                 }
                 break;
              } 
           }
        } catch(Exception e1)
        {
            System.out.println("\nError");
        }
    }
            
}
