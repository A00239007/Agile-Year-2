
public class Drink {
	String name;
	String company;
	String colour;
	String qty;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	
	public String toString()
	{
		return "\nDrink Details - Name:"+name+", Company:"+company+", Colour:"+colour+", Qty:"+qty+"";
	}
}
