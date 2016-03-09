import java.io.*;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.*;

public class java_xml {
    public static void main(String args[]){
	try {
	    Document document= DocumentBuilderFactory
		.newInstance()
		.newDocumentBuilder()
		.parse(new File("test.xml"));
	    Node node=document.getDocumentElement();
	    NodeList nodes = node.getChildNodes();
	    for(int i = 0; i < nodes.getLength(); i++){
		String name = nodes.item(i).getNodeName();
		System.out.println(name);
	    }
	} catch (Exception e) {
	   
	}
    }
}
