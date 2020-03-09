import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter the number of gallons of gas in the tank ");
    	double gas = in.nextDouble();
    	System.out.print("Enter the fuel efficiency ");
    	double mpg = in.nextDouble();
    	if (mpg > 0)
    	{
    		final double COST_PER_GALLON = 3.95;
    		double distance = mpg * gas;
    		double cost = (100 / mpg) * COST_PER_GALLON;
    		System.out.print("Distance:");
    		System.out.printf("%8.1f\n", distance);
    		System.out.print("Cost:");
    		System.out.printf("%12.2f\n", cost);
    	}
    	else
    	{
    		System.out.println("No can go");
    	}
    }
}
