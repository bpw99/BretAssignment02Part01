
public class Generic<E> implements IVendingMachine 
{
	String name;
	double price;
	
	public Generic()
	{
		
	}
	
	public Generic(String name, double price)
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
	public Generic<E> VendItem(String slotCode) {
		
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
	public Generic<E> clone()
	{
		return new Generic<E>(this.name,this.price);
	}


}
