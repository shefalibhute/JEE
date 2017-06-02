import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXml {

	
	public static void main(String[] args) {
		
		DocumentBuilderFactory fact=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder build=fact.newDocumentBuilder();
			Document root=build.parse(new File("Employee.xml"));
			
			Node node=root.getDocumentElement();
			System.out.println("Root Element : "+node.getNodeName());
			NodeList list=node.getChildNodes();
			showNodeDetail(list);
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param list
	 */
	private static void showNodeDetail(NodeList list) {
		for(int i=0;i<list.getLength();i++)
		{
			Node n=list.item(i);
			String n_name=n.getNodeName();
			NodeList l=n.getChildNodes();
			if(l.getLength()==0)
			{
				System.out.print(" - "+n.getNodeValue()+"\n");
			}
			else
			{
				System.out.print("\t"+n_name);
				showNodeDetail(l);
			}
		}
	}

}
