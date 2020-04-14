public class Numeric
{
	
	// Instance Variables
	
	// Constructors
	
	// Methods
	public static double  intPower(double x, int n)
	{
		if(n > 0 && n % 2 == 0)
		{
			return Math.pow(Math.pow(x, n / 2.0), 2);
		}
		else if(n > 0 && n % 2 != 0)
		{
			return Math.pow(x, n - 1) * x;
		}
		else
		{
			return (1 / Math.pow(x, -n));
		}
	}
}
