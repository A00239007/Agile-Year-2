import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
public class MyFirstDomParser {
	public static void main(String [] args) throws Exception
	{
		File file = new File("C:\\Notepad++\\class.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		String xml = "<?xml version='1.0'?> <class> </class>";
		ByteArrayInputStream input = new ByteArrayInputStream(xml.getBytes("UTF-8"));
		Document doc = builder.parse(file);
		
		doc.getDocumentElement().normalize();
		System.out.println("Root Element name: "+doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("student");
		System.out.println("-------------------------------");
		
		for(int i = 0; i<nList.getLength();i++)
		{
			Node nNode = nList.item(i);
			System.out.println("\nCurrent Element: "+nNode.getNodeName());
			if(nNode.getNodeType() == Node.ELEMENT_NODE)
			{
				Element eElement = (Element) nNode;
				System.out.println("Student roll no: "+eElement.getAttribute("rollno"));
				System.out.println("First Name: "+eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name: "+eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Nick Name: "+eElement.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("Marks: "+eElement.getElementsByTagName("marks").item(0).getTextContent());
			}
		}
		
		
	}
}
