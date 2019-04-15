import java.util.Scanner;

public class Vending {
	
	
	
	
	
	public static void main(String[] args) {
		
		double in = 0;
		double amount2 = 0;
		double amount = 0;
		Candy candy = new Candy();
		Candy twix = new Candy("Twix", 1.00);
		Candy skittles = new Candy("Skittles", 1.20);
		Candy largeGumball = new Candy("Gum", 1.00);
		
		Soda dew = new Soda("Mountain Dew", 1.25);
		Soda root = new Soda("Root Beer", 1.25);
		Soda bigRed = new Soda("Big Red", 1.50);
		

		CandyVM VendingMachine = new CandyVM(twix, 3, skittles, 2, largeGumball, 3);
		SodaVM VendingMachine2 = new SodaVM(dew, 5, root, 5, bigRed, 3);
		
		
		Scanner scan = new Scanner(System.in);
		
		
		boolean quit = false;
		
		while(true)
		{
		
			
			System.out.println(VendingMachine.GetMachineInfo());
			System.out.println(VendingMachine2.GetMachineInfo());
			System.out.println("Enter 1 for Candy, or 2 for Soda, or Q to quit");
			in = scan.nextDouble();
			
			while(in == 1)
			{
				System.out.println("You have selected the Candy vending machine" );
				System.out.println(VendingMachine.DisplayContents());
				System.out.println("pick a candy to purchase");
				System.out.println("Enter Q to quit");
				String num = scan.next();
				if(num.equals("1")||num.equals("2")||num.equals("3"))
				{
					while(amount - candy.getPrice() > 0)
					{
					
					
					System.out.println("enter money to purchase item");
					System.out.println("Enter Q to quit");
					amount = scan.nextDouble();
					VendingMachine.TakeMoney(amount);
					candy = VendingMachine.VendItem(num);
					}
					System.out.println("You have $" + VendingMachine.getMoney() + "remaining");
					
					while(amount + amount2 < candy.getPrice())
				
					{
						System.out.println("enter more money to purchase item");
						System.out.println("Enter Q to quit");

						amount2 = scan.nextDouble();
						VendingMachine.TakeMoney(amount2 + amount);
						VendingMachine.VendItem(num);
						
					}
					System.out.println("Here is your " + candy.getName());
					VendingMachine.ReturnMoney(candy.getPrice());
					System.out.println("Enter Q to quit");
					

			
					
					
					
			
				}
				
			}
			if(in == 2)
			{
				System.out.println("You have selected the Soda vending machine");
				VendingMachine2.DisplayContents();
				break;
			}
			if(in == 3)
			{
				System.out.println("You have selected a general vending machine");
				break;
			}
			if(!scan.hasNextInt())
			{
				String a = scan.next();
				if(a.equalsIgnoreCase("q"));
				{
					System.out.println("you have quit the vending machine");
					quit = true;
					break;
			
				}
				
			}
			else
			{
				break;
			}
			
		}
		
		
//		boolean quit = false;
//		while (true) {
//			
//			
//			if(VendingMachine.getMoney() <= 1)
//			{
//			System.out.println(VendingMachine.DisplayContents());
//			System.out.println("Enter money or Q to quit");
//			}
//			
//			while (true) {
//
//				if (!scan.hasNextDouble()) {
//					String a = scan.next();
//					if (a.equalsIgnoreCase("q")) {
//						quit = true;
//						break;
//					
//
//					}else {
//						System.out.println("Invalid input");
//					}
//
//				} else {
//					break;
//				}
//			}
//				if (quit == true) {
//					break;
//				}
//
//				double amountIn = scan.nextDouble();
//
//				VendingMachine.TakeMoney(amountIn);
//				double money = VendingMachine.getMoney();
//				if(money < 1)
//				{
//					System.out.println("You must put in 1 dollar or greater");
//				}
//				else
//				{
//				VendingMachine.ReturnMoney(0);
//				}
//
//				System.out.println("Enter the number for the candy you would like to purchase");
//		
//
//				String num = scan.next();
//				if(num.equals("1")||num.equals("2")||num.equals("3"))
//				{
//					
//					Candy candy = VendingMachine.VendItem((num));
//					if(candy.getPrice() > amountIn)
//					{
//						System.out.println("You must put in money greater than what you are buying, enter a new amount");
//						
//						
//					}
//					else
//					{
//						System.out.println("Here is your " + candy.getName());
//						VendingMachine.ReturnMoney(candy.getPrice());
//					
//
//					}
//					System.out.println("Here is your " + candy.getName());
//
//				}
//
//			
//
//				
//			}
		
	}
}

