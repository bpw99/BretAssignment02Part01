import java.util.LinkedList;
import java.util.Queue;

public class CandyVM implements ICandyVendingMachine
{
	Queue<Candy> slot1 = new LinkedList<Candy>();
	Queue<Candy> slot2 = new LinkedList<Candy>();
	Queue<Candy> slot3 = new LinkedList<Candy>();
	
	double money = 0;
	
	
	public CandyVM()
	{
		
		
		
	}
	
	public CandyVM(Candy a, int b, Candy c, int d, Candy e, int f)
	{
		for(;b>0;b--)
		{
			slot1.add(a.clone());
		}
		for(;d>0;d--)
		{
			slot2.add(c.clone());
		}
		for(;f>0;f--)
		{
			slot3.add(e.clone());
		}
	}
	
	
	
	@Override
	public void TakeMoney(double amount) {
		money += amount;
		
	}
	public double getMoney()
	{
		return money;
	}
	@Override
	public void ReturnMoney(double amount) {
		System.out.println("Here is the money you have left $" + (money-amount) +"\n");
	}
	@Override
	public Candy VendItem(String slotCode) {
		if(slotCode.equals("1"))
		{
			return slot1.poll();
		}
		else if(slotCode.equals("2"))
		{
			return slot2.poll();
		}
		else if(slotCode.equals("3"))
		{
			return slot3.poll();
		}
		else
		{
			return null;
		}
	}
	@Override
	public String GetMachineInfo() {
		return "This is a Candy vending machine";
	}
	@Override
	public String DisplayContents() {
		String out = "";
		out += "Slot (1): " + slot1.peek().getName() + " - " + "$" + slot1.peek().getPrice() +  " (" +slot1.size() +")"+ "\n";
		 out += "Slot (2): " + slot2.peek().getName() + " - " + "$" + slot2.peek().getPrice() + " ("+ slot2.size() +")"+ "\n";
		 out += "Slot (3): " + slot3.peek().getName() + " - " + "$" + slot3.peek().getPrice() + " (" + slot3.size() + ")";
		 
		 return out;
	}
	
	
	
	public Candy vend(int slotCode)
	{
		switch (slotCode)
		{
		case 1:
			if(money >= slot1.peek().getPrice())
			{
				money -= slot1.peek().getPrice();
				return slot1.poll();
			}
			else
			{
				System.out.println("ERROR NOT ENOUGH MONEY");
			}
			break;
			
		case 2:
			if(money >= slot2.peek().getPrice())
			{
				money -= slot2.peek().getPrice();
				return slot2.poll();
			}
			else
			{
				System.out.println("ERROR NOT ENOUGH MONEY");
				
			}
			break;
		case 3:
			if(money >= slot3.peek().getPrice())
			{
				money -= slot3.peek().getPrice();
				return slot3.poll();
			}
			else
			{
				System.out.println("ERROR NOT ENOUGH MONEY");
			}
			break;
		default:
			System.out.println("That ain't an option chief");
			break;
			
		}
		return null;
	}

	
	
	

}
