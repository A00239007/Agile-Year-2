import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserStudents extends DefaultHandler {
	boolean inFirstName = false;
	boolean inLastName = false;
	boolean inNickName = false;
	boolean inMarks = false;

	public void startElement(String uri, String localName, String qName,
			Attributes attribute) throws SAXException {
		if (qName.equalsIgnoreCase("student")) {
			String rollNo = attribute.getValue("rollno");
			System.out.println("Roll No:" + rollNo);
		} else if (qName.equalsIgnoreCase("firstname")) {
			inFirstName = true;
		} else if (qName.equalsIgnoreCase("lastname")) {
			inLastName = true;
		} else if (qName.equalsIgnoreCase("nickname")) {
			inNickName = true;
		} else if (qName.equalsIgnoreCase("marks")) {
			inMarks = true;
		}
	}

	public void characters(char[] c, int start, int length) throws SAXException {
		if (inFirstName) {
			System.out.println("First Name: " + new String(c, start, length));
			inFirstName = false;
		} else if (inLastName) {
			System.out.println("Last Name: " + new String(c, start, length));
			inLastName = false;
		} else if (inNickName) {
			System.out.println("Nick Name: " + new String(c, start, length));
			inNickName = false;
		} else if (inMarks) {
			System.out.println("Marks: " + new String(c, start, length)+"\n");
			inMarks = false;
		}
	}

	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (qName.equalsIgnoreCase("student")) {
			System.out.println("End Element: " + qName);
		}
	}

	public static void main(String[] args) {

		try {
			File inputFile = new File("C:\\Notepad++\\class.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			SAXParserStudents myFirstSaxParser = new SAXParserStudents();
			System.out.println("myfirstsaxparser.MyFirstSaxParser.main()\n");
			saxParser.parse(inputFile, myFirstSaxParser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
