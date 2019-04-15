import java.util.LinkedList;
import java.util.Queue;

public class GenericVM<E extends IVendingMachine> implements IVendingMachine<E>, Cloneable 

{


	Queue<E> slot1 = new LinkedList<E>();
	Queue<E> slot2 = new LinkedList<E>();
	Queue<E> slot3 = new LinkedList<E>();
	
	
	public GenericVM()
	{
		
	}
	
	
	
	
	double money = 0;

	
	
	
	public GenericVM(Generic a, int b, Generic c, int d, Generic e, int f)
	{
		
		for(; b > 0; b -= 1) {
			slot1.add((E) a.clone());
		}
		for(;d > 0; d -= 1) {
			slot2.add((E) c.clone());
		}
		for(;f > 0; f -= 1) {
			slot3.add((E) e.clone());
		}
	}
	
	@Override
	public void TakeMoney(double amount) {
		money += amount;	
	}
	public double getMoney() {
		return money;
	}
	@Override
	public void ReturnMoney(double amount) {
		System.out.println("Here is the money you have left $" + (money-amount) +"\n");
	}
	@Override
	public E VendItem(String slotCode) {
		if(slotCode.equals("1")) {
			return slot1.poll();
		}
		else if(slotCode.equals("2")) {
			return slot2.poll();
		}
		else if(slotCode.equals("3")) {
			return slot3.poll();
		}
		else {
			return null;
		}
	}
	@Override
	public String GetMachineInfo() {
		return "(2) This is a Soda vending machine";
	}
	@Override
	public String DisplayContents() {
		String out = "";
		out += "Slot (1): " + ((Generic) slot1.peek()).getName() + " - " + "$" + ((Generic) slot1.peek()).getPrice() + " (" + slot1.size() + ")"+ "\n";
		out += "Slot (2): " + ((Generic) slot2.peek()).getName() + " - " + "$" + ((Generic) slot2.peek()).getPrice() + " (" + slot2.size() + ")"+ "\n";
		out += "Slot (3): " + ((Generic) slot3.peek()).getName() + " - " + "$" + ((Generic) slot3.peek()).getPrice() + " (" + slot3.size() + ")";
		return out;
	}
	
	public E vend(int slotCode) {
		switch (slotCode) {
		case 1:
			if(money >= ( (Generic) slot1.peek()).getPrice()) {
				money -= ( (Generic) slot1.peek()).getPrice();
				return slot1.poll();
			}
			else {
				System.out.println("ERROR NOT ENOUGH MONEY");
			}
			break;
		
		case 2:
			if(money >= ((Generic) slot2.peek()).getPrice()) {
				money -= ((Generic) slot2.peek()).getPrice();
				return slot2.poll();
			}
			else {
				System.out.println("ERROR NOT ENOUGH MONEY");
			}
			break;
		case 3:
			if(money >= ((Generic) slot3.peek()).getPrice()) {
				money -= ((Generic) slot3.peek()).getPrice();
				return slot3.poll();
			}
			else {
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
