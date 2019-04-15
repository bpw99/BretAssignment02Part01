
import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		
		// Creates 3 Candy Objects
		Candy twix = new Candy("Twix", 1.00);
		Candy skittles = new Candy("Skittles", 1.20);
		Candy largeGumball = new Candy("Gum", 1.00);

		// Creates VendingMachine Object
		CandyVM VendingMachine = new CandyVM(twix, 3, skittles, 2, largeGumball, 3);

		// Scans for User Input
		Scanner scan = new Scanner(System.in);
		System.out.println(VendingMachine.DisplayContents());
		System.out.println("Enter money or Q to quit");
		
		boolean quit = false;
		while (true) {
			
			
			if(VendingMachine.getMoney() <= 1)
			{
			System.out.println(VendingMachine.DisplayContents());
			System.out.println("Enter money or Q to quit");
			}
			
			while (true) {

			while (true) {
				if (!scan.hasNextDouble()) {
					String a = scan.next();
					if (a.equalsIgnoreCase("q")) {
						doQuit = true;
						break;
					} else {
						System.out.println("Invalid input");
					}
				} else { break; }
			}
			if (doQuit) {
				break;
			}

			double amountIn = scan.nextDouble();
			VendingMachine.TakeMoney(amountIn);
			double money = VendingMachine.getMoney();
			if(money < 1) {
				System.out.println("You must put in 1 dollar or greater");
			} else {
				VendingMachine.ReturnMoney(0);
			}

			System.out.println("Enter the number for the candy you would like to purchase");
			String num = scan.next();
			if(num.equals("1")||num.equals("2")||num.equals("3")) {
				Candy candy = VendingMachine.VendItem((num));
				if(candy.getPrice() > amountIn) {
					System.out.println("You must put in money greater than what you are buying, enter a new amount");
				} else {
					System.out.println("Here is your " + candy.getName());
					VendingMachine.ReturnMoney(candy.getPrice());
				}
				System.out.println("Here is your " + candy.getName());
			}
		}
		scan.close();
	}
}