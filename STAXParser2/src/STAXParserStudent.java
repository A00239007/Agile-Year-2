import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import org.xml.sax.Attributes;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;



public class STAXParserStudent {
	
	public static void main(String [] args) throws Exception
	{
		boolean bFirstName = false;
		boolean bLastName = false;
		boolean bNickName = false;
		boolean bMarks = false;
		File fileInput = new File("C:\\Users\\Simon Harper\\Documents\\Repo\\agile-year-2\\2018_WebDev22_XML_Project_Template\\xmlfiles\\Students.xml");
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
						System.out.println("Start Element: "+qName);
						Iterator<Attributes> attribute = startElement.getAttributes();
						String rollNo = "";
						if(attribute.hasNext())
						{
						     rollNo = attribute.next().getValue("title");
						}
						System.out.println("Roll No: "+rollNo);
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
					else if(qName.equalsIgnoreCase("school"))
					{
						bMarks = true;
					}
					break;
				case XMLStreamConstants.CHARACTERS:
					Characters characters = event.asCharacters();
					if(bFirstName)
					{
						System.out.println("First Name: "+characters.getData());
						bFirstName = false;
					}
					else if(bLastName)
					{
						System.out.println("LastName: "+characters.getData());
						bLastName = false;
					}
					else if(bNickName)
					{
						System.out.println("Nick Name: "+characters.getData());
						bNickName = false;
					}
					else if(bMarks)
					{
						System.out.println("Marks Name: "+characters.getData());
						bMarks = false;
					}
					break;
				case XMLStreamConstants.END_ELEMENT:
					EndElement endElement = event.asEndElement();
					if(endElement.getName().getLocalPart().equalsIgnoreCase("student"))
					{
						System.out.println("End Element: student");
						System.out.println();
					}
					break;
			}
		}
	}
}
