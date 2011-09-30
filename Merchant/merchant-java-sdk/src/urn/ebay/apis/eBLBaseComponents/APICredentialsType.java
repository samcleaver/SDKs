
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.eBLBaseComponents.APIAuthenticationType;


/**
 * APICredentialsType 
 */
public class APICredentialsType {

	/**
	 * Merchant’s PayPal API username
	 * Character length and limitations: 128 alphanumeric characters
	 */
	private String Username;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String value) {
		this.Username = value;
	}

	/**
	 * Merchant’s PayPal API password
	 * Character length and limitations: 40 alphanumeric characters
	 */
	private String Password;
	public String getPassword() {
		return Password;
	}
	public void setPassword(String value) {
		this.Password = value;
	}

	/**
	 * Merchant’s PayPal API signature, if one exists.
	 * Character length and limitations: 256 alphanumeric characters
	 */
	private String Signature;
	public String getSignature() {
		return Signature;
	}
	public void setSignature(String value) {
		this.Signature = value;
	}

	/**
	 * Merchant’s PayPal API certificate in PEM format, if one exists
	 * The certificate consists of two parts: the private key (2,048
	 * bytes) and the certificate proper (4,000 bytes).
	 * Character length and limitations: 6,048 alphanumeric characters
	 */
	private String Certificate;
	public String getCertificate() {
		return Certificate;
	}
	public void setCertificate(String value) {
		this.Certificate = value;
	}

	/**
	 * Merchant’s PayPal API authentication mechanism.
	 * Auth-None: no authentication mechanism on file
	 * Cert: API certificate
	 * Sign: API signature
	 * Character length and limitations: 9 alphanumeric characters
	 */
	private APIAuthenticationType Type;
	public APIAuthenticationType getType() {
		return Type;
	}
	public void setType(APIAuthenticationType value) {
		this.Type = value;
	}


	public APICredentialsType() {
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
	 public APICredentialsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("Username").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Username").item(0))){ 
		 this.Username =(String)document.getElementsByTagName("Username").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Password").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Password").item(0))){ 
		 this.Password =(String)document.getElementsByTagName("Password").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Signature").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Signature").item(0))){ 
		 this.Signature =(String)document.getElementsByTagName("Signature").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Certificate").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Certificate").item(0))){ 
		 this.Certificate =(String)document.getElementsByTagName("Certificate").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Type").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Type").item(0))){ 
		 this.Type = APIAuthenticationType.fromValue(document.getElementsByTagName("Type").item(0).getTextContent());

}
	}
	}
}
