import java.io.ByteArrayInputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;


public class MyFirstSAXParser {
	public static void main(String [] args)throws SAXException, Exception
	{
		String xml = "<?xml version='1.0'?><class><student></student></class>";
		ByteArrayInputStream input = new ByteArrayInputStream(xml.getBytes("UTF-8"));
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		SAXParserEventHandler eventHandler = new SAXParserEventHandler();
		saxParser.parse(input, eventHandler);
	}
}
