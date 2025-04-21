import java.util.Scanner;

public class Demo {
	private static final Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		blankLines();
		System.out.println("Welcome to the Coin Demo!");

		fixedDemo();
		interactiveDemo();

		blankLines();
		System.out.println("Thanks for watching the Coin Demo.");
		System.out.println("Have a wonderful day!");
		blankLines();
	}

	private static void fixedDemo() {
		blankLines();
		System.out.println("=== Fixed Demo ===");
		System.out.println("Penny (Cupro-Nickel): " + new Penny(new CuproNickel()));
		System.out.println("Nickel (Cupro-Nickel):       " + new Nickel(new CuproNickel()));
		System.out.println("Dime (Cupro-Nickel):         " + new Dime(new CuproNickel()));
		System.out.println("Quarter (Cupro-Nickel):      " + new Quarter(new CuproNickel()));
		System.out.println("HalfDollar (Cupro-Nickel):   " + new HalfDollar(new CuproNickel()));
		System.out.println("Dollar default:       " + new Dollar());
		System.out.println("Dollar (1991):        " + new Dollar(1991));
	}

	private static void interactiveDemo() {
		blankLines();
		System.out.print("Would you like to make more coins yourself? (Y/n) ");
		String resp = keyboard.nextLine().trim();
		if (resp.isEmpty() || resp.charAt(0) == 'Y' || resp.charAt(0) == 'y') {
			runDemo();
		}
	}

	private static void runDemo() {
		while (true) {
			blankLines();
			printMenu();
			System.out.print("What coin to make? ");
			String resp = keyboard.nextLine().trim();
			if (resp.isEmpty())
				continue;
			Coin c;
			switch (Character.toUpperCase(resp.charAt(0))) {
				case 'G':
					System.out.println("Gonna make a dollar coin...");
					c = new Dollar();
					break;
				case 'H':
					System.out.println("Gonna make a half dollar coin...");
					c = new HalfDollar();
					break;
				case 'Q':
					System.out.println("Gonna make a quarter coin...");
					c = new Quarter();
					break;
				case 'D':
					System.out.println("Gonna make a dime coin...");
					c = new Dime();
					break;
				case 'N':
					System.out.println("Gonna make a nickel coin...");
					c = new Nickel();
					break;
				case 'P':
					System.out.println("Gonna make a penny coin...");
					c = new Penny();
					break;
				case 'X':
					return;
				default:
					System.out.println("Invalid entry, try again.");
					continue;
			}
			System.out.println("Result: " + c);
		}
	}

	private static void printMenu() {
		System.out.println("I'm ready to make you a coin!");
		System.out.println("Enter G for a dollar coin.");
		System.out.println("Enter H for a half dollar coin.");
		System.out.println("Enter Q for a quarter coin.");
		System.out.println("Enter D for a dime coin.");
		System.out.println("Enter N for a nickel coin.");
		System.out.println("Enter P for a penny coin.");
		System.out.println("Enter X to exit the demo.");
		System.out.println();
	}

	private static void blankLines() {
		System.out.println();
		System.out.println();
	}
}
