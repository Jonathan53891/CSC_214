import java.util.Scanner;

public class Main{
    public static void main(String[] args) 
    {
      System.out.println("I can help you choose between a Prius and any other car");
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the price of a car: ");
      final double CAR_PRICE  = keyboard.nextDouble();
      System.out.print("Please enter the resale value of this car: ");
      final double CAR_RESALE  = keyboard.nextDouble();
      System.out.print("Please enter the MPG for this car: ");
      final double CAR_MPG  = keyboard.nextDouble();
      System.out.print("How many miles do you drive per year? ");
      final int MILES_DRIVEN_PER_YEAR  = keyboard.nextInt();
      System.out.print("What is price of gas today? ");
      final double GAS_PRICE  = keyboard.nextDouble();
      
      final double HYBRID_NEW_PRICE = 24000;
      final double HYBRID_NEW_RESALE = 11000;
      final double HYBRID_NEW_MPG = 51.00;
      final double HYBRID_USED_PRICE = 20000;
      final double HYBRID_USED_RESALE = 9000;
      final double HYBRID_USED_MPG = 50.00;
      
      double carGasCost = 5 * ((MILES_DRIVEN_PER_YEAR / CAR_MPG) * GAS_PRICE);
      double hibridNewGasCost = 5 * ((MILES_DRIVEN_PER_YEAR / HYBRID_NEW_MPG) * GAS_PRICE);
      double hibridUsedGasCost = 5 * ((MILES_DRIVEN_PER_YEAR / HYBRID_USED_MPG) * GAS_PRICE);
      
      double carTotalCost = CAR_PRICE + carGasCost - CAR_RESALE;
      double hibridNewTotalCost = HYBRID_NEW_PRICE + hibridNewGasCost - HYBRID_NEW_RESALE;
      double hibridUsedTotalCost = HYBRID_USED_PRICE + hibridUsedGasCost - HYBRID_USED_RESALE;
      
      System.out.println("If the gas prices do not change and you continue to drive " 
	                      + MILES_DRIVEN_PER_YEAR + " per year in the next 5 years:");
	    System.out.printf("Your cars total cost will be:\t$%10.2f" , carTotalCost);
	    System.out.printf("\na 2012 Prius total cost will be:\t$%10.2f" , hibridNewTotalCost);
	    System.out.printf("\na 2010 Prius total cost will be:\t$%10.2f" , hibridUsedTotalCost); 
    }
}

 
