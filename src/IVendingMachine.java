/**
 * VM (Vending Machine) Interface
 * 
 * @author Bret Wilson
 * @version 0.5
 * @since 2019-03
 */
public interface IVendingMachine<T extends VendableItem> {
	/**
	 * Accepts the amount of money from the user.
	 * @param double amount Takes a Double amount
	 */
	 public void takeMoney(double amount);
	 /**
		* Prints the amount of money to the user.
		* @param double amount
		*/
	 public void returnMoney(double amount);
	 /**
		* Spits out an item based on the vending slot chosen by the user
		* Each vending machine should have SlotA, SlotB, and SlotC
		* Up to 5 items can be placed in each slot of the vending machine
		*/
	 public T vendItem(String slotCode);
	 /**
		* Displays what type of vending items are being vendored
		* @return String
		*/
	 public String getMachineInfo();
	 /**
		* Returns the item name and price for each Slot of the machine
		* @return String
		*/
	 public String displayContents();
}
