import java.util.Scanner;

public class MainCoffee {

	public static void main(String[] args) {
		Coffee coffee = null;
		double userTotal = 0;

		Coffee.greetingsInfo();
		while (true) {
			// Displaying Coffee Menu for the User
			System.out.println("Coffee 1: Latte ");
			System.out.println("Coffee 2: Americano ");
			System.out.println("Coffee 3: Cappuccino ");
			System.out.println("Coffee 4: Caramel Machiato ");
			System.out.println("Coffee 5: Mocha ");
			// Getting Coffee Number
			Scanner board = new Scanner(System.in);
			System.out.print("Enter the Coffee Number>> ");
			String userChoiceCoffee = board.nextLine();

			switch (userChoiceCoffee) {

			case "1":
				coffee = new Coffee("Latte");

				break;
			case "2":
				coffee = new Coffee("Americano");
				break;
			case "3":
				coffee = new Coffee("Cappuccino");
				break;
			case "4":
				coffee = new Coffee("Caramel Machiato");
				break;
			case "5":
				coffee = new Coffee("Mocha");
				break;

			}

			Scanner board2 = new Scanner(System.in);
			System.out.print("Please choose the size (S/M/L): ");
			System.out.print("(S)mall: $3.70 / (M)edium: $4.55 / (L)arge: $5.00>> ");
			// setting small, medium and large coffee prices

			coffee.setSmallPrice(3.70);
			coffee.setMediumPrice(4.55);
			coffee.setLargePrice(5.00);
			String userChoiceSize = board2.nextLine();
			String size = null;

			switch (userChoiceSize) {
			case "S":
				size = "Small";
				break;
			case "M":
				size = "Medium";
				break;
			case "L":
				size = "Large";
				break;
			default:
				System.out.print("Invalid");
			}

			Scanner board3 = new Scanner(System.in);
			System.out.print("Confirm your order (Y/N): ");
			String userConfirmOrder = board3.nextLine();

			if (userConfirmOrder.equals("Y")) {
				switch (userChoiceSize) {
				case "S":
					userTotal = 3.70 + (3.70 * 0.05);
					break;
				case "M":
					userTotal = 4.55 + (4.55 * 0.05);
					break;
				case "L":
					userTotal = 5.00 + (5.00 * 0.05);
					break;
				default:
					System.out.println("Invalid");
				}
				System.out.println("Thank you for your purchase!");
				System.out.println("Your " + size + " " + coffee.getCoffeeName() + " is ready to serve!");
				System.out.println("This is your total: $" + String.format("%.2f", userTotal));
			}
			System.out.print("Would you like to Order Something else (Y/N): ");
			Scanner board31 = new Scanner(System.in);
			String userOrderMore = board31.nextLine();
			if (userOrderMore.equals("N")) {
				System.out.println("Have a Wonderful Day!");
				break;
			}
		}
	}

}
