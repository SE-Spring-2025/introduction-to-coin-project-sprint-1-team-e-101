import java.util.Scanner;
import javax.swing.SwingUtilities;

public class Demo {
	private static final Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		CoinCounts counts = Coin.getCoinCounts();
		TotalCoinsDashboard totalDash = new TotalCoinsDashboard(counts);
		QuarterCounterDashboard quarterDash = new QuarterCounterDashboard(counts);
		SwingUtilities.invokeLater(totalDash);
		SwingUtilities.invokeLater(quarterDash);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		blankLines();
		System.out.println("Welcome to the Coin Demo!");

		metallurgyDemo();
		blankLines();
		manufacturingWorkflow();
		blankLines();
		interactiveDemo();

		blankLines();
		System.out.println("Thanks for watching the Coin Demo.");
		System.out.println("Have a wonderful day!");
		blankLines();
	}

	private static void metallurgyDemo() {
		blankLines();
		System.out.println("=== Metallurgy Demo ===");
		System.out.println("Penny (Cupro-Nickel): " + new Penny(new CuproNickel()));
		System.out.println("Nickel (Cupro-Nickel):       " + new Nickel(new CuproNickel()));
		System.out.println("Dime (Cupro-Nickel):         " + new Dime(new CuproNickel()));
		System.out.println("Quarter (Cupro-Nickel):      " + new Quarter(new CuproNickel()));
		System.out.println("HalfDollar (Cupro-Nickel):   " + new HalfDollar(new CuproNickel()));
		System.out.println("Dollar default:       " + new Dollar());
		System.out.println("Dollar (1991):        " + new Dollar(1991));
		System.out.println("Dollar (Cupro-Nickel):       " + new Dollar(new CuproNickel()));
		System.out.println("Dollar (Cupro-Nickel, 1991): " + new Dollar(new CuproNickel(), 1991));
		System.out.println("=== End of Metallurgy Demo ===");
	}

	private static void manufacturingWorkflow() {
		Penny penny = new Penny(new CuproNickel());
		penny.manufacture(penny);

		Nickel nickel = new Nickel(new CuproNickel());
		nickel.manufacture(nickel);

		Dime dime = new Dime(new CuproNickel());
		dime.manufacture(dime);

		Quarter quarter = new Quarter(new CuproNickel());
		quarter.manufacture(quarter);

		HalfDollar halfDollar = new HalfDollar(new CuproNickel());
		halfDollar.manufacture(halfDollar);

		Dollar dollar = new Dollar(new CuproNickel());
		dollar.manufacture(dollar);

		System.out.println("=== Manufacturing Workflow Demo ===");
		System.out.println("Penny: " + penny);
		System.out.println("Nickel: " + nickel);
		System.out.println("Dime: " + dime);
		System.out.println("Quarter: " + quarter);
		System.out.println("HalfDollar: " + halfDollar);
		System.out.println("Dollar: " + dollar);
		System.out.println("=== End of Manufacturing Workflow Demo ===");
		blankLines();

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
