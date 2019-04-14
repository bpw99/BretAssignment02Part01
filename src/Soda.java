
public class Soda implements ISodaVendingMachine, Cloneable
{
	String name;
	double price;
	
	public Soda()
	{
		
	}
	
	public Soda(String name, double price)
	{
		setName(name);
		setPrice(price);
	}
	public void setName(String nameIN)
	{
		name = nameIN;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPrice(double priceIN)
	{
		price = priceIN;
	}
	
	public double getPrice()
	{
		return price;
	}

	@Override
	public void TakeMoney(double amount) {
		
	}

	@Override
	public void ReturnMoney(double amount) {
		
	}

	@Override
	public Soda VendItem(String slotCode) {
		
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
	public Soda clone()
	{
		return new Soda(this.name,this.price);
	}

	

}
