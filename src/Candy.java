public class Candy implements ICandyVendingMachine, Cloneable {

	private double price;
	public double getPrice() { return(price); }
	public void setPrice(double price) { this.price = price; }
	
	private String name;
	public String getName() { return(name); }
	public void setName(String name) { this.name = name; }
	
	// Constructor
	public Candy() {}
	
	public Candy(String n, double p) {
		price = p;
		name = n;
	}
	// -----

	// Instance 
	public void TakeMoney(double amount) { }

	public void ReturnMoney(double amount) { }

	public Candy VendItem(String slotCode) { return(null); }

	public String GetMachineInfo() { return(null); }

	public String DisplayContents() { return(null); }
	
	public Candy clone() {
		return new Candy(this.name,this.price);
	}
}