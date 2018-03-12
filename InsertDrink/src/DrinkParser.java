import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class DrinkParser {
	public static void main(String [] args) throws Exception
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		File f = new File("C:\\Notepad++\\Drink.xml");
		
		Document dom = builder.parse(f);
		dom.getDocumentElement().normalize();
		Element root = dom.getDocumentElement();
		
		NodeList nList = dom.getElementsByTagName("Drink");
		ArrayList<Drink> drnk = new ArrayList<Drink>();
		for (int i = 0; i < nList.getLength(); i++) {
			Element eElement = (Element) nList.item(i);
			
			Drink drink = new Drink();
			
			drink.setColour(eElement.getElementsByTagName("Colour").item(0).getTextContent());
			drink.setCompany(eElement.getElementsByTagName("Company").item(0).getTextContent());
			drink.setName(eElement.getAttribute("Name"));
			drink.setQty(eElement.getElementsByTagName("Qty").item(0).getTextContent());
			drnk.add(drink);
		}
		
		System.out.println("No. of Drink '"+drnk.size()+"'.");
		for (int i = 0; i < drnk.size(); i++) {
			System.out.println(drnk.toString());
		}
	}
}
