import java.util.Scanner;

public class Demo {
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the CoinFlips Demo!");

        fixedDemo();
        interactiveDemo();
        
        System.out.println();
        System.out.println();
        System.out.println("Thanks for watching the CoinFlips Demo.");
        System.out.println("Have a wonderful day!");
        System.out.println();
    }
    
    private static void fixedDemo() {
        System.out.println();
        System.out.println();
        System.out.println("Making a Penny()");
        System.out.println("Result: " + new Penny());
        System.out.println("Making a Nickel()");
        System.out.println("Result: " + new Nickel());
        System.out.println("Making a Dime()");
        System.out.println("Result: " + new Dime());
        System.out.println("Making a Quarter()");
        System.out.println("Result: " + new Quarter());
        System.out.println("Making a HalfDollar()");
        System.out.println("Result: " + new HalfDollar());
        System.out.println("Making a Dollar()");
        System.out.println("Result: " + new Dollar());
        System.out.println("Making a Dollar(1991)");
        System.out.println("Result: " + new Dollar(1991));
        System.out.println("Making a Generic coin using an anonymous subclass (99.99)");
        System.out.println("Result: " + new Coin(99.99) {});
    }
    
    private static void printMenu() {
        System.out.println();
        System.out.println();
        System.out.println("I'm ready to make you a coin!");
        System.out.println("Enter G for a dollar coin.");
        System.out.println("Enter H for a half dollar coin.");
        System.out.println("Enter Q for a quarter coin.");
        System.out.println("Enter D for a dime coin.");
        System.out.println("Enter N for a nickel coin.");
        System.out.println("Enter P for a penny coin.");
        System.out.println();
        System.out.println("Enter X to exit the demo.");
        System.out.println();
    }
    
    private static void interactiveDemo() {
        System.out.println();
        System.out.println();
        System.out.println("Would you like to make more coins yourself? (Y/n) ");
        String response = keyboard.nextLine().trim();
        if (!response.isEmpty() && (response.charAt(0) == 'Y' || response.charAt(0) == 'y'))
            runDemo();
    }
    
    private static void runDemo() {
        Coin c;
        
        while (true) {
            System.out.println();
            System.out.println();
    
            printMenu();
            System.out.print("What coin to make? ");
            String response = keyboard.nextLine().trim();
            if (response.isEmpty()) continue;
            char choice = response.charAt(0);
            switch (choice) {
                case 'G':
                    System.out.println("Gonna make a dollar coin...");
                    c = new Dollar();
                    System.out.println("Result: " + c);
                    break;
                case 'H':
                    System.out.println("Gonna make a half dollar coin...");
                    c = new HalfDollar();
                    System.out.println("Result: " + c);
                    break;
                case 'Q':
                    System.out.println("Gonna make a quarter coin...");
                    c = new Quarter();
                    System.out.println("Result: " + c);
                    break;
                case 'D':
                    System.out.println("Gonna make a dime coin...");
                    c = new Dime();
                    System.out.println("Result: " + c);
                    break;
                case 'N':
                    System.out.println("Gonna make a nickel coin...");
                    c = new Nickel();
                    System.out.println("Result: " + c);
                    break;
                case 'P':
                    System.out.println("Gonna make a penny coin...");
                    c = new Penny();
                    System.out.println("Result: " + c);
                    break;
                case 'X':
                    System.out.println("Exiting interactive demo...");
                    return;
                default:
                    System.out.println("Invalid entry, try again.");
                    break;
            }
        }
    }
}
