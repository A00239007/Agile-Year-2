import java.sql.Date;

/**
 * @author Simon Harper
 *Invoice class
 */
public class Invoice {

	int ID;
	Order order;
	double priceCorrection;
	Date deliveryDate;
	
	/**
	 * @param id is the id of the Invoice
	 * @param order contains the details from the customer class and has the list of publications
	 * @param pCorrection is the price that you want the original price of the publications to change too
	 * @param delDate is the date of when the delivery is going to be made
	 * The constructor for Invoice
	 */
	public Invoice(int id, Order order, double pCorrection, Date delDate)
	{
		this.ID = id;
		this.order = order;
		this.priceCorrection = pCorrection;
		this.deliveryDate = delDate;
	}
	
	
	/**
	 * @param ID is the id of the Invoice
	 * This method is used to search for Invoices that have been made
	 */
	public void SearchInvoice(int ID)
	{
		
	}
	
	/**
	 * @param ID is the id of the Invoice that you want to create
	 * @param order is the details of the order from the customer 
	 * @param priceCorrection is the price that you want the original price of the publications to change too 
	 * @param delvieryDate is the date of when the delivery is going to be made
	 */
	public void CreateInvoice(int ID, Order order, double priceCorrection, Date delvieryDate)
	{
		
	}
}
