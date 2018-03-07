import java.io.ByteArrayInputStream;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;


public class STAXParser {
	public static void main(String [] args) throws Exception
	{
		String xml = "<?xml version='1.0'?><class><student></student></class>";
		ByteArrayInputStream input = new ByteArrayInputStream(xml.getBytes("UTF-8"));
		
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLEventReader eventReader = factory.createXMLEventReader(input);
		
		while(eventReader.hasNext())
		{
			XMLEvent event = eventReader.nextEvent();
			if(event.getEventType() == XMLStreamConstants.START_ELEMENT)
			{
				StartElement startElement = event.asStartElement();
				String qName = startElement.getName().getLocalPart();
				System.out.println("Start of element: "+qName);
			}
			
			if(event.getEventType() == XMLStreamConstants.END_ELEMENT)
			{
				EndElement endElement = event.asEndElement();
				String qName = endElement.getName().getLocalPart();
				System.out.println("End of element: "+qName);
			}
		}
	}
}
