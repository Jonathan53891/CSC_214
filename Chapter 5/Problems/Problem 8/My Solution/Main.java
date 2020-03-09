import java.util.Scanner;

public class Main {
    public static final long PIN = 1234;
    
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner in = new Scanner(System.in);

        // Define some variables
        int tries = 0;

        // Start a while loop and ask for the pin
        while(true) {
            // Ask the user for a PIN number
            System.out.println("Enter your PIN:");
            long pin = in.nextLong();

            // Increase the tries number
            tries++;

            // If the user has tried to much, show an error
            if(tries == 1) {
            	if(pin == PIN) {
                    System.out.println("Your PIN is correct");
                    System.exit(0);
                }
            	else
            	{
            		System.out.println("Your PIN is incorrect");
            	}
            }
            if(tries == 2) {
            	if(pin == PIN) {
                    System.out.println("Your PIN is correct");
                    System.exit(0);
                }
            	else
            	{
            		System.out.println("Your PIN is incorrect");
            	}
            }
            if(tries >= 3) {
            	if(pin == PIN) {
                    System.out.println("Your PIN is correct");
                    System.exit(0);
                }
            	else
            	{
            		System.out.println("Your bank card is blocked");
            		System.exit(0);
            	}
            }
        }
    }
}
