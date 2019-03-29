import java.util.Scanner;

public class VendingMachine {
	
	
	
	
	
	public static void main(String[] args) {
		
                //initializes 3 candys to be placed into the slot variables//
		Candy twix = new Candy("Twix", 1.00);
		Candy skittles = new Candy("Skittles", 1.20);
		Candy largeGumball = new Candy("Gum", 1.00);
		
                //twix,skittles,and largeGumball are declared in the vending machine and given amounts//
		CandyVM VendingMachine = new CandyVM(twix, 3, skittles, 2, largeGumball, 3);
		Scanner scan = new Scanner(System.in);
		
		
		boolean quit = false;
		while (true) {
			
			
			
			System.out.println(VendingMachine.DisplayContents());
			System.out.println("Enter money or Q to quit, if you already have enough money, enter 0");
			
			
			while (true) {
                                //Checks to make sure that if the scanner does not detect a double
                                //then it will make sure the user can quit by entering q
				if (!scan.hasNextDouble()) {
					String a = scan.next();
					if (a.equalsIgnoreCase("q")) {
						quit = true;
						break;
					

					}else {//catches not doubles or ints that are not q
						System.out.println("Invalid input, try again");
					}

				} else {
					break;
				}
			}
				if (quit == true) {
					break;
				}
                                //takes user entered money amount after he pays for a candy//
				double amountIn = scan.nextDouble();
				VendingMachine.TakeMoney(amountIn);
				double money = VendingMachine.getMoney();
                                //makes sure user does not give money that is lower than the cost of the lowest priced candies//
				if(money < 1)
				{
					System.out.println("You must put in 1 dollar or greater");
				}
                                //return the users money that is left//
				else
				{
				VendingMachine.ReturnMoney(0);
				}

				System.out.println("Enter the number for the candy you would like to purchase");
		
                                //takes user input (either 1,2 or 3) and purchases candy at respective slot//
				String num = scan.next();
				if(num.equals("1")||num.equals("2")||num.equals("3"))
				{
					
					Candy candy = VendingMachine.VendItem((num));
                                        //makes sure that the user enters an amount not less than the price of the candy//
					if(candy.getPrice() > amountIn)
					{
						System.out.println("You must put in money greater than what you are buying, enter a new amount");
						
						
					}
					else
					{
						System.out.println("Here is your " + candy.getName());
						VendingMachine.ReturnMoney(candy.getPrice());


					}
					System.out.println("Here is your " + candy.getName());

				}

			

				
			}
		
	}
}

