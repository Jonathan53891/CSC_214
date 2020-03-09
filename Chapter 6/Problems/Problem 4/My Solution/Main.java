import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Number: ");
		long number = input.nextLong();
		input.close();
		long odd_digits_sum = 0;
		
		while (number > 0) 
		{
			long digit = number % 10;
			if (digit % 2 != 0) 
			{
				odd_digits_sum += digit;
			}
			number /= 10;
		}
		System.out.println("Sum of number's odd digits: " + odd_digits_sum);
	}
}
      
