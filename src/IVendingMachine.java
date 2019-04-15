/**
 * VM (Vending Machine) Interface
 * 
 * @author Bret Wilson
 * @version 0.4
 * @since 2019-03
 */
public interface IVendingMachine<E> {
	// Accepts the amount of money from the user
	 void TakeMoney(double amount);
	 /**
		* @return double Returns the amount of money to the user.
		*/
	 void ReturnMoney(double amount);
	 /**
		* Spits out an item based on the vending slot chosen by the user
		* Each vending machine should have SlotA, SlotB, and SlotC
		* Up to 5 items can be placed in each slot of the vending machine
		*/
	 E VendItem(String slotCode);
	 // Displays what kind of vending machine it is
	 String GetMachineInfo();
	 // Shows the item name and price for each Slot of the machine
	 String DisplayContents();
}
