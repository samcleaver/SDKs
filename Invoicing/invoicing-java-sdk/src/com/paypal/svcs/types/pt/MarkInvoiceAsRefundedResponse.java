package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * The response object for MarkInvoiceAsRefunded. 
 */
public class MarkInvoiceAsRefundedResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * The invoice ID of the invoice that was marked as refunded. 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * The invoice number of the invoice that was marked as
	 * refunded. 	  
	 *@Required	 
	 */ 
	private String invoiceNumber;

	/**
	 * The URL of the details page of the invoice that was marked
	 * as refunded. 	  
	 *@Required	 
	 */ 
	private String invoiceURL;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public MarkInvoiceAsRefundedResponse (){
	}	

	/**
	 * Getter for responseEnvelope
	 */
	 public ResponseEnvelope getResponseEnvelope() {
	 	return responseEnvelope;
	 }
	 
	/**
	 * Setter for responseEnvelope
	 */
	 public void setResponseEnvelope(ResponseEnvelope responseEnvelope) {
	 	this.responseEnvelope = responseEnvelope;
	 }
	 
	/**
	 * Getter for invoiceID
	 */
	 public String getInvoiceID() {
	 	return invoiceID;
	 }
	 
	/**
	 * Setter for invoiceID
	 */
	 public void setInvoiceID(String invoiceID) {
	 	this.invoiceID = invoiceID;
	 }
	 
	/**
	 * Getter for invoiceNumber
	 */
	 public String getInvoiceNumber() {
	 	return invoiceNumber;
	 }
	 
	/**
	 * Setter for invoiceNumber
	 */
	 public void setInvoiceNumber(String invoiceNumber) {
	 	this.invoiceNumber = invoiceNumber;
	 }
	 
	/**
	 * Getter for invoiceURL
	 */
	 public String getInvoiceURL() {
	 	return invoiceURL;
	 }
	 
	/**
	 * Setter for invoiceURL
	 */
	 public void setInvoiceURL(String invoiceURL) {
	 	this.invoiceURL = invoiceURL;
	 }
	 
	/**
	 * Getter for error
	 */
	 public List<ErrorData> getError() {
	 	return error;
	 }
	 
	/**
	 * Setter for error
	 */
	 public void setError(List<ErrorData> error) {
	 	this.error = error;
	 }
	 


	public MarkInvoiceAsRefundedResponse(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "responseEnvelope" + ".timestamp")){
			String newPrefix = prefix + "responseEnvelope" + ".";
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if(map.containsKey(prefix + "invoiceID")){
			this.invoiceID = map.get(prefix + "invoiceID");
		}
		if(map.containsKey(prefix + "invoiceNumber")){
			this.invoiceNumber = map.get(prefix + "invoiceNumber");
		}
		if(map.containsKey(prefix + "invoiceURL")){
			this.invoiceURL = map.get(prefix + "invoiceURL");
		}
		i = 0;
		while(true) {
			if(map.containsKey(prefix + "error" + "(" + i + ")" + ".errorId")){
				String newPrefix = prefix + "error" + "(" + i + ")" + ".";
				this.error.add(new ErrorData(map, newPrefix));
			} else {
				break;
			}
			i++;
		}
	}

}