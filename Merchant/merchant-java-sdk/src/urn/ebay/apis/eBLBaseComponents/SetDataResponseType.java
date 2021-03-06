package urn.ebay.apis.eBLBaseComponents;
import java.util.List;
import java.util.ArrayList;
import urn.ebay.apis.eBLBaseComponents.ErrorType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import java.io.FileInputStream;
import java.io.StringReader;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * If Checkout session was initialized successfully, the
 * corresponding token is returned in this element. 
 */
public class SetDataResponseType{


	/**
	 * If Checkout session was initialized successfully, the
	 * corresponding token is returned in this element. 	 
	 */ 
	private String Token;

	/**
	 * 	 
	 */ 
	private List<ErrorType> SetDataError = new ArrayList<ErrorType>();

	

	/**
	 * Default Constructor
	 */
	public SetDataResponseType (){
	}	

	/**
	 * Getter for Token
	 */
	 public String getToken() {
	 	return Token;
	 }
	 
	/**
	 * Setter for Token
	 */
	 public void setToken(String Token) {
	 	this.Token = Token;
	 }
	 
	/**
	 * Getter for SetDataError
	 */
	 public List<ErrorType> getSetDataError() {
	 	return SetDataError;
	 }
	 
	/**
	 * Setter for SetDataError
	 */
	 public void setSetDataError(List<ErrorType> SetDataError) {
	 	this.SetDataError = SetDataError;
	 }
	 


	private  boolean isWhitespaceNode(Node n) {
		if (n.getNodeType() == Node.TEXT_NODE) {
			String val = n.getNodeValue();
			return val.trim().length() == 0;
		} else {
			return false;
		}
	}
	
	private String convertToXML(Node n){
		String name = n.getNodeName();
		short type = n.getNodeType();
		if (Node.CDATA_SECTION_NODE == type) {
			return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		}
		if (name.startsWith("#")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<").append(name);
		NamedNodeMap attrs = n.getAttributes();
		if (attrs != null) {
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				sb.append(" ").append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
			}
		}
		String textContent = null;
		NodeList children = n.getChildNodes();
		if (children.getLength() == 0) {
			if (((textContent = n.getTextContent())) != null && (!"".equals(textContent))) {
				sb.append(textContent).append("</").append(name).append(">");
			} else {
				sb.append("/>");
			}
		} else {
			sb.append(">");
			boolean hasValidChildren = false;
			for (int i = 0; i < children.getLength(); i++) {
				String childToString = convertToXML(children.item(i));
				if (!"".equals(childToString)) {
					sb.append(childToString);
					hasValidChildren = true;
				}
			}
			if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) {
				sb.append(textContent);
			}
			sb.append("</").append(name).append(">");
		}
		return sb.toString();
	}
	
	public SetDataResponseType(Object xmlSoap) throws IOException, SAXException, ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource inStream = new InputSource();
		inStream.setCharacterStream(new StringReader((String)xmlSoap));
		Document document = builder.parse(inStream);
		NodeList nodeList= null;
		
		String xmlString = "";
		if (document.getElementsByTagName("Token").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("Token").item(0))) {
				this.Token = (String)document.getElementsByTagName("Token").item(0).getTextContent();
			}
		}
	
		if (document.getElementsByTagName("SetDataError").getLength() != 0) {
			if(!isWhitespaceNode(document.getElementsByTagName("SetDataError").item(0))) {
				nodeList = document.getElementsByTagName("SetDataError");
				for(int i=0; i < nodeList.getLength(); i++) {
					xmlString = convertToXML(nodeList.item(i));
					this.SetDataError.add(new ErrorType(xmlString));
				}
			}
		}
	}

}