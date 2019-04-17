/**
 * Vending Class
 * This is the main entry point for the Vending Machine Program.
 * 
 * @author Bret Wilson
 * @version 0.4
 * @since 2019-02-01
 */
import java.util.Scanner;

public class Vending {
	

	public static void main(String[] args) 
	{
		double net = 0;
		double net2 = 0;
		double net3 = 0;
		
		Candy candy = new Candy();
		Soda soda = new Soda();
		VendableItem general = new VendableItem();
		
		Candy twix = new Candy("Twix", 1.00);
		Candy skittles = new Candy("Skittles", 1.20);
		Candy largeGumball = new Candy("Gum", 1.00);

		Soda dew = new Soda("Mountain Dew", 1.25);
		Soda root = new Soda("Root Beer", 1.25);
		Soda bigRed = new Soda("Big Red", 1.50);
		
		VendableItem cola = new Soda("Cola", 1.00);
		VendableItem gummy = new Candy("Gummy worms", 1.00);
		VendableItem pepsi = new Soda("Pepsi", 1.00);
		

		GenericVM VendingMachine = new GenericVM(twix, 3, skittles, 2, largeGumball, 3);
		GenericVM VendingMachine2 = new GenericVM(dew, 5, root, 5, bigRed, 3);
		GenericVM VendingMachine3 = new GenericVM(cola, 3, gummy, 3, pepsi, 3);

		Scanner scan = new Scanner(System.in);
		
		boolean quit = false;
		
		while(true)
		{
			System.out.println("You have arrived at the vending machine \n type A to select a vending machine and put in money \n type B to pick the Candy vending machine \n type C to pick the Soda vending machine \n type D to pick the General vending machine \n or type Q to quit");
			String input = scan.nextLine();
			
			if(input.equalsIgnoreCase("Q"))
			{
				System.out.println("You have quit the Vending machine");
				System.exit(0);
			}
			if(input.equalsIgnoreCase("A"))
			{
				System.out.println("Choose a vending machine to put money into? \n 1: Candy \n 2: Soda \n 3: General");
				String in = scan.nextLine();
				if(in.equals("1"))
				{
					System.out.println("You have selected the Candy vending machine \n put money into the machine");
					VendingMachine.takeMoney(scan.nextDouble());
					System.out.println("here is your money " + net);
					
				}
				else if(in.equals("2"))
				{
					System.out.println("You have selected the Soda vending machine \n put money into the machine");
					VendingMachine2.takeMoney(scan.nextDouble());
					System.out.println("You have $" + VendingMachine2.getMoney());
					
				}
				else if(in.equals("3"))
				{
					System.out.println("You have selected the General vending machine \n put money into the machine");
					VendingMachine3.takeMoney(scan.nextDouble());
					System.out.println("You have $" + VendingMachine3.getMoney());
				}
				else
				{
					System.out.println("you must select 1, 2, or 3 please");
				}
				
			}
			else if(input.equalsIgnoreCase("B"))
			{
				System.out.println("Enter a candy you would like to purchase \n" + VendingMachine.displayContents());
				String choice = scan.nextLine();
				candy = (Candy) VendingMachine.vendItem(choice.toUpperCase());
				net += VendingMachine.getMoney() - candy.getPrice();
				if(net < 0)
				{
					System.out.println("You don't have enough money for that");
					System.exit(0);
				}
					
				if(candy != null)
				{
					System.out.println("Here is your " + candy.getName());
				}
			
			}
			else if(input.equalsIgnoreCase("C"))
			{
				System.out.println("Enter a candy you would like to purchase \n" + VendingMachine2.displayContents());
				String choice2 = scan.nextLine();
				soda = (Soda) VendingMachine2.vendItem(choice2.toUpperCase());
				net += VendingMachine.getMoney() - candy.getPrice();
				if(net < 0)
				{
					System.out.println("You don't have enough money for that");
					System.exit(0);
				}
				if(soda != null)
				{
					System.out.println("Here is your " + soda.getName());
				}
				
			
			}
			else if(input.equalsIgnoreCase("D"))
			{
				System.out.println("Enter a candy you would like to purchase \n" + VendingMachine3.displayContents());
				String choice3 = scan.nextLine();
				general = VendingMachine3.vendItem(choice3.toUpperCase());
				net += VendingMachine.getMoney() - candy.getPrice();
				if(net < 0)
				{
					System.out.println("You don't have enough money for that");
					System.exit(0);
				}
				if(general != null)
				{
					System.out.println("Here is your " + general.getName());
				}
				
			
			}
			else
			{
				System.out.println("Please enter A, B, C, D, or Q");
			}
			
			
			
			System.out.println("Your Candy Machine balance is " + (VendingMachine.getMoney() - candy.getPrice()));
			System.out.println("Your Soda Machine balance is " +  (VendingMachine2.getMoney() - soda.getPrice()));
			System.out.println("Your General Machine balance is " + (VendingMachine3.getMoney() - general.getPrice()));
			System.out.println();
			
		
			
			
		
			
			
			
		}
		
		
	}
	
}
		
		
		
