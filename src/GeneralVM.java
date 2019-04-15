/**
 * GeneralVM (Vending Machine) Class
 * This class is the generic Vending Maching for Vendable Items.
 * 
 * @author Bret Wilson
 * @version 0.2
 * @since 2019-04-01
 */
import java.util.LinkedList;
import java.util.Queue;

public class GeneralVM<T extends Vendable & Cloneable> implements IVendingMachine<T>, Cloneable {

	// Item Slots
	private Queue<T> slot1 = new LinkedList<T>();
	private Queue<T> slot2 = new LinkedList<T>();
	private Queue<T> slot3 = new LinkedList<T>();

	private double money = 0;

	// Constructors
	public GeneralVM() { }
	
	public GeneralVM(T a, Integer b, T c, Integer d, T e, Integer f) {
		for(; b > 0; b -= 1) {
			slot1.add(a.clone());
		}
		for(;d > 0; d -= 1) {
			slot2.add(c.clone());
		}
		for(;f > 0; f -= 1) {
			slot3.add(e.clone());
		}
	}
	public GeneralVM(Queue<T> slot1, Queue<T> slot2, Queue<T> slot3, double money) {
		this.slot1 = slot1;
		this.slot2 = slot2;
		this.slot3 = slot3;
		this.money = money;
	}
	// -----

	// Money Methods
	public void takeMoney(double amount) { money += amount; }
	public double getMoney() { return money; }
	public void returnMoney(double amount) {
		System.out.println("Here is the money you have left $" + (money-amount) +"\n");
	}
	// ---

	//
	public T vendItem(String slotCode) {
		if (slotCode.equals("1")) {
			return slot1.poll();
		} else if (slotCode.equals("2")) {
			return slot2.poll();
		} else if (slotCode.equals("3")) {
			return slot3.poll();
		} else {
			return null;
		}
	}

	public String getMachineInfo() {
		return "(2) This is a Soda vending machine";
	}
	public String displayContents() {
		String out = "";
		out += "Slot (1): " + slot1.peek().getName() + " - " + "$" + slot1.peek().getPrice() + " (" + slot1.size() + ")"+ "\n";
		out += "Slot (2): " + slot2.peek().getName() + " - " + "$" + slot2.peek().getPrice() + " (" + slot2.size() + ")"+ "\n";
		out += "Slot (3): " + slot3.peek().getName() + " - " + "$" + slot3.peek().getPrice() + " (" + slot3.size() + ")";
		return out;
	}
	
	public T vend(int slotCode) {
		switch (slotCode) {
		case 1:
			if (money >= slot1.peek().getPrice()) {
				money -= slot1.peek().getPrice();
				return slot1.poll();
			}
			else {
				System.out.println("ERROR NOT ENOUGH MONEY");
			}
			break;
		
		case 2:
			if (money >= slot2.peek().getPrice()) {
				money -= slot2.peek().getPrice();
				return slot2.poll();
			}
			else {
				System.out.println("ERROR NOT ENOUGH MONEY");
			}
			break;
		case 3:
			if (money >= slot3.peek().getPrice()) {
				money -= slot3.peek().getPrice();
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
	public GeneralVM<T> clone() {
		return new GeneralVM<T>(this.slot1, this.slot2, this.slot3, this.money);
	}
}
