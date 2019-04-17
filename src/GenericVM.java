/**
 * GenericVM (Vending Machine) Class
 * This class is the generic Vending Maching for Vendable Items.
 * 
 * @author Bret Wilson
 * @version 0.2
 * @since 2019-04-01
 */
import java.util.LinkedList;
import java.util.Queue;

public class GenericVM implements IVendingMachine<VendableItem>, Cloneable {

	// Item Slots
	private Queue<VendableItem> slot1 = new LinkedList<VendableItem>();
	private Queue<VendableItem> slot2 = new LinkedList<VendableItem>();
	private Queue<VendableItem> slot3 = new LinkedList<VendableItem>();

	private double money;
	private String vendingType;

	// Constructors
	public GenericVM() { money = 0.0; vendingType = ""; }
	
	public GenericVM(VendableItem a, int b, VendableItem c, int d, VendableItem e, int f) {
		vendingType = a.getClass().getSimpleName();
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
	public GenericVM(Queue<VendableItem> slot1, Queue<VendableItem> slot2, Queue<VendableItem> slot3, double money, String vendingType) {
		this.slot1 = slot1;
		this.slot2 = slot2;
		this.slot3 = slot3;
		this.money = money;
		this.vendingType = vendingType;
	}
	// -----

	// Money Methods
	public double getMoney() { return money; }
	
	public void takeMoney(double amount) {
		money += amount;
	}
	public void returnMoney(double amount) {
		System.out.println( "Here is the money you have left $" + (money - amount) +"\n");
	}
	// ---

	public VendableItem vendItem(String slotCode) {
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

	public VendableItem vendItem1(String slotCode) {
		switch (slotCode) {
		case "1":
			if (money >= slot1.peek().getPrice()) {
				money -= slot1.peek().getPrice();
				return slot1.poll();
			} else {
				System.out.println("ERROR NOT ENOUGH MONEY");
			}
			break;
		case "2":
			if (money >= slot2.peek().getPrice()) {
				money -= slot2.peek().getPrice();
				return slot2.poll();
			} else {
				System.out.println("ERROR NOT ENOUGH MONEY");
			}
			break;
		case "3":
			if (money >= slot3.peek().getPrice()) {
				money -= slot3.peek().getPrice();
				return slot3.poll();
			} else {
				System.out.println("ERROR NOT ENOUGH MONEY");
			}
			break;
		default:
			System.out.println("That ain't an option chief");
			break;			
		}
		return null;
	}
	// Vending Machine Methods
	public String getMachineInfo() {
		return "This is a "+vendingType+" vending machine";
	}
	public String displayContents() {
		String out = "";
		out += "Slot (1): " + slot1.peek().getName() + " - " + "$" + slot1.peek().getPrice() + " (" + slot1.size() + ")"+ "\n";
		out += "Slot (2): " + slot2.peek().getName() + " - " + "$" + slot2.peek().getPrice() + " (" + slot2.size() + ")"+ "\n";
		out += "Slot (3): " + slot3.peek().getName() + " - " + "$" + slot3.peek().getPrice() + " (" + slot3.size() + ")";
		return out;
	}

	public GenericVM clone() {
		return new GenericVM(this.slot1, this.slot2, this.slot3, this.money, this.vendingType);
	}
}