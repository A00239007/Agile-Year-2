/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.SAXParserFactory;
/**
 *
 * @author A00239007
 */

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author A00239007
 */
public class SAXParser extends DefaultHandler {
    boolean inName;
    boolean inAge;
    boolean inCollege;
    boolean inSchool;
    
    public void startElement(String uri, String localName, String qName,
			Attributes attribute) throws SAXException {
		if (qName.equalsIgnoreCase("student")) {
			String title = attribute.getValue("title");
			System.out.println("Title: " + title);
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
			System.out.println("First Name: " + new String(c, start, length));
			inName = false;
		} else if (inAge) {
			System.out.println("Last Name: " + new String(c, start, length));
			inAge = false;
		} else if (inSchool) {
			System.out.println("Nick Name: " + new String(c, start, length));
			inSchool = false;
		} else if (inCollege) {
			System.out.println("Marks: " + new String(c, start, length)+"\n");
			inCollege = false;
		}
	}
    
    public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (qName.equalsIgnoreCase("student")) {
			System.out.println("End Element: " + qName);
		}
	}

    public String parser() throws Exception
    {
        File inputFile = new File("C:\\Users\\A00239007\\Documents\\Repo\\agile-year-2\\2018_WebDev22_XML_Project_Template\\xmlfiles\\Students.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        javax.xml.parsers.SAXParser saxParser = factory.newSAXParser();
        SAXParser handler = new SAXParser();
        return saxParser.parse(inputFile, handler);
    }
}
