package xmlTesting;

import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XmlTest {

	public static void main(String[] args) throws Exception {
		Document doc = XMLDocumentFactory.getInstance().loadDocument("students.xml");
		
		Node n = doc.getFirstChild();
		System.out.println(n.getNodeName());
		for (Node script = n.getFirstChild(); script != null; script = script.getNextSibling())
		{
			System.out.println(script.getNodeName());
		}
	}

}
