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
	public static void main(String[] args) {
		Candy twix = new Candy("Twix", 1.00);
		Candy skittles = new Candy("Skittles", 1.20);
		Candy largeGumball = new Candy("Gum", 1.00);

		Soda dew = new Soda("Mountain Dew", 1.25);
		Soda root = new Soda("Root Beer", 1.25);
		Soda bigRed = new Soda("Big Red", 1.50);

		CandyVM VendingMachine = new CandyVM(twix, 3, skittles, 2, largeGumball, 3);
		SodaVM VendingMachine2 = new SodaVM(dew, 5, root, 5, bigRed, 3);

		Scanner scan = new Scanner(System.in);
		System.out.println(VendingMachine.GetMachineInfo());
		System.out.println(VendingMachine2.GetMachineInfo());
		System.out.println("Enter 1 for Candy, or 2 for Soda, or Q to quit");
		
		int in = scan.nextInt();
		boolean quit = false;
		while(!quit) {
			if (in == 1) {
				System.out.println("You have selected the Candy vending machine" );
				System.out.println(VendingMachine.DisplayContents());
				System.out.println("pick a candy to purchase");
				String num = scan.next();
				if (num.equals("1")||num.equals("2")||num.equals("3")) {
					System.out.println("enter money to purchase item");
					double amountIn = scan.nextDouble();
					VendingMachine.TakeMoney(amountIn);
					Candy candy = VendingMachine.VendItem(num);
					System.out.println("Here is your " + candy.getName());
				}
			}

			if (in == 2) {
				System.out.println("You hae selected the Soda vending machine");
				VendingMachine2.DisplayContents();
			}
			if (in == 3) {
				System.out.println("You have selected a general vending machine");
			}
			if (!scan.hasNextInt()) {
				String a = scan.next();
				if (a.equalsIgnoreCase("q")) {
					quit = true;
					break;
				}
			} else {
				System.out.println("You have entered an invalid option, try again");
			}
		}
		scan.close();
	}
}
//		boolean quit = false;
//		while (true) {
//			if (VendingMachine.getMoney() <= 1) {
//			System.out.println(VendingMachine.DisplayContents());
//			System.out.println("Enter money or Q to quit");
//			}
//			while (true) {
//				if (!scan.hasNextDouble()) {
//					String a = scan.next();
//					if (a.equalsIgnoreCase("q")) {
//						quit = true;
//						break;
//					}else {
//						System.out.println("Invalid input");
//					}
//				} else {
//					break;
//				}
//			}
//				if (quit == true) {
//					break;
//				}
//				double amountIn = scan.nextDouble();
//				VendingMachine.TakeMoney(amountIn);
//				double money = VendingMachine.getMoney();
//				if (money < 1) {
//					System.out.println("You must put in 1 dollar or greater");
//				} else { VendingMachine.ReturnMoney(0); }
//				System.out.println("Enter the number for the candy you would like to purchase");
//				String num = scan.next();
//				if (num.equals("1")||num.equals("2")||num.equals("3")) {
//					Candy candy = VendingMachine.VendItem((num));
//					if (candy.getPrice() > amountIn) {
//						System.out.println("You must put in money greater than what you are buying, enter a new amount");
//					} else {
//						System.out.println("Here is your " + candy.getName());
//						VendingMachine.ReturnMoney(candy.getPrice());
//					}
//					System.out.println("Here is your " + candy.getName());
//				}
//			}