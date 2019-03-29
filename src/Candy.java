public class Candy implements ICandyVendingMachine, Cloneable {
	
	String name;
	double price;
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// Constructor
	public Candy() {}
	
	public Candy(String n, double p) {
		price = p;
		name = n;
	}

	@Override
	public void TakeMoney(double amount) 
	{
		
	}

	@Override
	public void ReturnMoney(double amount) 
	{
		
	}

	@Override
	public Object VendItem(String slotCode) {
		
		return null;
	}

	@Override
	public String GetMachineInfo() {
		
		return null;
	}

	@Override
	public String DisplayContents() {
		
		return null;
	}
	
	public Candy clone()
	{
		return new Candy(this.name,this.price);
	}

}
