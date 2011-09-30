
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
import urn.ebay.apis.CoreComponentTypes.BasicAmountType;
import urn.ebay.apis.eBLBaseComponents.MerchantPullStatusCodeType;


/**
 * MerchantPullInfoType
 * Information about the merchant pull.
 */
public class MerchantPullInfoType {

	/**
	 * Current status of billing agreement 
	 */
	private MerchantPullStatusCodeType MpStatus;
	public MerchantPullStatusCodeType getMpStatus() {
		return MpStatus;
	}
	public void setMpStatus(MerchantPullStatusCodeType value) {
		this.MpStatus = value;
	}

	/**
Monthly maximum payment amount	 */
	private BasicAmountType MpMax;
	public BasicAmountType getMpMax() {
		return MpMax;
	}
	public void setMpMax(BasicAmountType value) {
		this.MpMax = value;
	}

	/**
The value of the mp_custom variable that you
	 * specified in a FORM submission to PayPal during the creation or
	 * updating of a customer billing agreement 
	 */
	private String MpCustom;
	public String getMpCustom() {
		return MpCustom;
	}
	public void setMpCustom(String value) {
		this.MpCustom = value;
	}

	/**
The value of the mp_desc variable (description of
	 * goods or services) associated with the billing agreement
	 */
	private String Desc;
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String value) {
		this.Desc = value;
	}

	/**
Invoice value as set by BillUserRequest API call
	 */
	private String Invoice;
	public String getInvoice() {
		return Invoice;
	}
	public void setInvoice(String value) {
		this.Invoice = value;
	}

	/**
Custom field as set by BillUserRequest API call
	 */
	private String Custom;
	public String getCustom() {
		return Custom;
	}
	public void setCustom(String value) {
		this.Custom = value;
	}

	/**
Note: This field is no longer used and is always
	 * empty.	 */
	private String PaymentSourceID;
	public String getPaymentSourceID() {
		return PaymentSourceID;
	}
	public void setPaymentSourceID(String value) {
		this.PaymentSourceID = value;
	}


	public MerchantPullInfoType() {
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
	 public MerchantPullInfoType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("MpStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("MpStatus").item(0))){ 
		 this.MpStatus = MerchantPullStatusCodeType.fromValue(document.getElementsByTagName("MpStatus").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("MpMax").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("MpMax").item(0))){ 
		 nodeList = document.getElementsByTagName("MpMax");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.MpMax =  new BasicAmountType(xmlString);

}
	}
		 if(document.getElementsByTagName("MpCustom").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("MpCustom").item(0))){ 
		 this.MpCustom =(String)document.getElementsByTagName("MpCustom").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Desc").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Desc").item(0))){ 
		 this.Desc =(String)document.getElementsByTagName("Desc").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Invoice").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Invoice").item(0))){ 
		 this.Invoice =(String)document.getElementsByTagName("Invoice").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Custom").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Custom").item(0))){ 
		 this.Custom =(String)document.getElementsByTagName("Custom").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PaymentSourceID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentSourceID").item(0))){ 
		 this.PaymentSourceID =(String)document.getElementsByTagName("PaymentSourceID").item(0).getTextContent();

}
	}
	}
}
