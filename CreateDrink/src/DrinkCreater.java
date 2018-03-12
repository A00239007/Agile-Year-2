import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;


public class DrinkCreater {
	public static void main(String [] args) throws Exception
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		File f = new File("C:\\Notepad++\\Drink.xml");
		
		Document dom = builder.parse(f);
		dom.getDocumentElement().normalize();
		Element root = dom.getDocumentElement();
		
		Element drinkEl = dom.createElement("Drink");
		drinkEl.setAttribute("name", "bepis");
		Element companyEl = dom.createElement("Company");
		Text companyText = dom.createTextNode("Memes By Dad");
		companyEl.appendChild(companyText);
		drinkEl.appendChild(companyEl);
		Element colourEl = dom.createElement("Colour");
		Text colourText = dom.createTextNode("Slightly blacker than black");
		colourEl.appendChild(colourText);
		drinkEl.appendChild(colourEl);
		Element qtyEl = dom.createElement("Qty");
		Text qtyText = dom.createTextNode("More than you would think, but less than you would hope");
		qtyEl.appendChild(qtyText);
		drinkEl.appendChild(qtyEl);
		
		root.appendChild(drinkEl);
		
		TransformerFactory transFactory = TransformerFactory.newInstance();
		Transformer transformer = transFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		DOMSource source = new DOMSource(dom);
		StreamResult result = new StreamResult(new File("C:\\Notepad++\\drink2.xml"));
		transformer.transform(source, result);
	}
}
