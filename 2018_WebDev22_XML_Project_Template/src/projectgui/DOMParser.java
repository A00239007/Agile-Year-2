/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author A00239007
 */
public class DOMParser {
    
    public ArrayList<Student> parser() throws Exception
    {
        File inputFile = new File("C:\\Users\\A00239007\\Documents\\Repo\\agile-year-2\\2018_WebDev22_XML_Project_Template\\Students.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        
        Document dom = builder.parse(inputFile);
        dom.getDocumentElement().normalize();
        ArrayList<Student> student = new ArrayList<>();
        NodeList nList = dom.getElementsByTagName("student");
        for (int i = 0; i < nList.getLength(); i++) {
            Element eElement = (Element)nList.item(i);
            Student stdnt = new Student();
            
            stdnt.setTitle(eElement.getAttribute("title"));
            stdnt.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
            stdnt.setAge(Integer.parseInt(eElement.getElementsByTagName("age").item(0).getTextContent()));
            stdnt.setCollege(eElement.getElementsByTagName("college").item(0).getTextContent());
            stdnt.setSchool(eElement.getElementsByTagName("school").item(0).getTextContent());
            student.add(stdnt);
        }
        return student;
    }
}
