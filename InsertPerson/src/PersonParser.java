import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class PersonParser {
	public static void main(String[]args) throws Exception
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		File f = new File("C:\\Notepad++\\Employee.xml");
		
		Document dom = builder.parse(f);
		dom.getDocumentElement().normalize();
		Element root = dom.getDocumentElement();
		System.out.println("Element:"+root.getNodeName());
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		NodeList nList = dom.getElementsByTagName("Employee");
		
		for (int i = 0;	i< nList.getLength(); i++) {
			Node nNode = nList.item(i);
			Element eElement = (Element)nNode;
			Employee employee = new Employee();
			employee.setContactType(eElement.getAttribute("type"));
			employee.setId(eElement.getElementsByTagName("Id").item(0).getTextContent());
			employee.setAge(eElement.getElementsByTagName("Age").item(0).getTextContent());
			employee.setName(eElement.getElementsByTagName("Name").item(0).getTextContent());
			
			emp.add(employee);
		}
		
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i).toString());
		}
	}
}
