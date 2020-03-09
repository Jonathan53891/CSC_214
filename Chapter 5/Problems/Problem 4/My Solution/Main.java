import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter employee hours: ");
		double hours = in.nextDouble();
		in.close();
		Paycheck Paycheck = new Paycheck(hours);
		System.out.println("");
		System.out.println("Employee Hours: " + hours );
		System.out.println("Employee Paycheck: " + Paycheck.getPay() );

	}

}
