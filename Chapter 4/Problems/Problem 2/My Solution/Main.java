import java.util.Scanner;


public class Main
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
      
       int num1, num2;
       System.out.print("Enter first number: ");
       num1 = sc.nextInt();
       System.out.print("Enter second number: ");
       num2 = sc.nextInt();
      
       System.out.println("Sum = "+(num1+num2));
       System.out.println("Difference = "+(num1-num2));
       System.out.println("Product = "+(num1*num2));
       System.out.println("Absolute value = "+Math.abs(num1-num2));
       System.out.println("Maximum = "+Math.max(num1, num2));
       System.out.println("Minimum = "+Math.min(num1, num2));
   }
}
