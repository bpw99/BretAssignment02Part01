import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		
		Candy twix = new Candy("Twix", 1.00);
		Candy skittles = new Candy("Skittles", 1.20);
		Candy largeGumball = new Candy("Gum", 1.00);

		CandyVM VendingMachine = new CandyVM(twix, 3, skittles, 2, largeGumball, 3);
		Scanner scan = new Scanner(System.in);

		boolean quit = false;
		while (true) {	

			System.out.println(VendingMachine.DisplayContents());
			System.out.println("Enter money or Q to quit");

			while (true) {
				if (!scan.hasNextDouble()) {
					String a = scan.next();
					if (a.equalsIgnoreCase("q")) {
						quit = true;
						break;

					} else {
						System.out.println("Invalid input");
					}
				} else {
					break;
				}
			}
			if (quit == true) {
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
			/*while(true)
			{
				if (!scan.hasNextInt()) {
					String a = scan.next();
					if (a.equalsIgnoreCase("q")) {
						quit = true;
						break;
					

				}else {
						System.out.println("Invalid input");
					}

				} else {
					break;
				}

			}
			if (quit = true) {
				break;
			}*/
			

				String num = scan.next();
				if(num.equals("1")||num.equals("2")||num.equals("3"))
				{
					
					Candy candy = VendingMachine.VendItem((num));
					if(candy.getPrice() > amountIn)
					{
						System.out.println("You must put in money greater than what you are buying");
						break;
					}
					else
					{
						System.out.println("Here is your " + candy.getName());
						VendingMachine.ReturnMoney(candy.getPrice());

					}
				}

			

				
			}
		
	}
}

// {
// System.out.println(VendingMachine.GetMachineInfo());
// System.out.println(VendingMachine.DisplayContents());
// System.out.println("Pick a vending machine item or hit Q to quit");
// Scanner scan = new Scanner(System.in);
// int input = scan.nextInt();
//
//
//
//
//
// if(input == 1)
// {
// System.out.println("continue with the vending machine");
//
// System.out.println("You picked a twix bar, enter funds to purchase item");
// System.out.println(VendingMachine.GetMachineInfo());
// System.out.println(VendingMachine.DisplayContents());
// double input2 = scan.nextDouble();
// VendingMachine.TakeMoney(input2);
// VendingMachine.vend(1);
// VendingMachine.ReturnMoney(input2);
//
//
// }
//
// if(input == 2)
// {
// System.out.println("continue with the vending machine");
//
// System.out.println("you picked skittles, enter funds to purchase item");
// System.out.println(VendingMachine.GetMachineInfo());
// System.out.println(VendingMachine.DisplayContents());
// double input3 = scan.nextDouble();
// VendingMachine.TakeMoney(input3);
// VendingMachine.vend(2);
// VendingMachine.ReturnMoney(input3);
//
////
//
// }
// if(input == 3)
// {
// System.out.println("continue with the vending machine");
//
// System.out.println("you picked gum, enter funds to purchase item");
// System.out.println(VendingMachine.GetMachineInfo());
// System.out.println(VendingMachine.DisplayContents());
// double input4 = scan.nextDouble();
// VendingMachine.TakeMoney(input4);
// VendingMachine.vend(3);
// VendingMachine.ReturnMoney(input4);
//
//
//
// }
//
//
