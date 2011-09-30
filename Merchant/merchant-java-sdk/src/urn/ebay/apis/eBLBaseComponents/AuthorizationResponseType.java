
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.eBLBaseComponents.AckCodeType;
import urn.ebay.apis.eBLBaseComponents.ErrorType;


/**
 * Status will denote whether Auto authorization was successful or not.
 */
public class AuthorizationResponseType {

	/**
	 * Status will denote whether Auto authorization was successful or not.
	 *
	 * @Required
	 */
	private AckCodeType Status;
	public AckCodeType getStatus() {
		return Status;
	}
	public void setStatus(AckCodeType value) {
		this.Status = value;
	}

	/**
	 */
	private List<ErrorType> AuthorizationError = new ArrayList<ErrorType>();
	public List<ErrorType> getAuthorizationError() {
		return AuthorizationError;
	}
	public void setAuthorizationError(List<ErrorType> value) {
		this.AuthorizationError = value;
	}


	public AuthorizationResponseType() {
	}
	 private  boolean isWhitespaceNode(Node n) {
		 if (n.getNodeType() == Node.TEXT_NODE) { 
				String val = n.getNodeValue();
				return val.trim().length() == 0; 
		 } else {
				return false;
		 } 
	 } 
	 private String convertToXML(Node node){ 
		 StringBuffer bf = new StringBuffer(); 
		 do{ 
		 if (node.getChildNodes().getLength() == 1 && node.getChildNodes().item(0).getNodeType()==Node.TEXT_NODE) { 
				bf.append("<" + node.getNodeName() + ">" + node.getTextContent()+ "</" + node.getNodeName() + ">"); 
				return bf.toString(); 
			} 
			bf.append("<" + node.getNodeName() + ">"); 
			NodeList childNode = node.getChildNodes(); 
			for (int j = 0; j < childNode.getLength(); j++) { 
				Node offspring = childNode.item(j); 
				if (offspring.getChildNodes().getLength() == 1) { 
					if (!isWhitespaceNode(offspring)) { 
						bf.append("<" + offspring.getNodeName() + ">"+ offspring.getTextContent() + "</"+ offspring.getNodeName() + ">");
					}
				} else {
					bf.append(convertToXML(offspring));
				}
			}
			bf.append("</" + node.getNodeName() + ">");
			return bf.toString();
		 }while(true);
		}
	 public AuthorizationResponseType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("Status").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Status").item(0))){ 
		 this.Status = AckCodeType.fromValue(document.getElementsByTagName("Status").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("AuthorizationError").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AuthorizationError").item(0))){ 
		 nodeList = document.getElementsByTagName("AuthorizationError");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 xmlString = convertToXML(nodeList.item(i)); 
				this.AuthorizationError.add(new ErrorType(xmlString));
			}

}
	}
	}
}
