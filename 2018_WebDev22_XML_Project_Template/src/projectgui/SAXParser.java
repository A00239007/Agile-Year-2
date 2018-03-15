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
    Parse parse = new Parse();
    
    public void startElement(String uri, String localName, String qName,
			Attributes attribute) throws SAXException {
		if (qName.equalsIgnoreCase("student")) {
			String title = attribute.getValue("title");
			parse.mainTextArea.append("Title: " + title);
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
                        parse.mainTextArea.append("First Name: " + new String(c, start, length));
			inName = false;
		} else if (inAge) {
			parse.mainTextArea.append("Age: " + new String(c, start, length));
			inAge = false;
		} else if (inSchool) {
			parse.mainTextArea.append("School: " + new String(c, start, length));
			inSchool = false;
		} else if (inCollege) {
			parse.mainTextArea.append("College: " + new String(c, start, length)+"\n");
			inCollege = false;
		}
	}
    
    public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (qName.equalsIgnoreCase("student")) {
			parse.mainTextArea.append("End Element: " + qName);
		}
	}

    public void parser() throws Exception
    {
        File inputFile = new File("C:\\Users\\A00239007\\Documents\\Repo\\agile-year-2\\2018_WebDev22_XML_Project_Template\\xmlfiles\\Students.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        javax.xml.parsers.SAXParser saxParser = factory.newSAXParser();
        SAXParser handler = new SAXParser();
        saxParser.parse(inputFile, handler);
    }
}
