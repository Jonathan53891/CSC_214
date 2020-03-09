public class Paycheck 
{
	private double hours;
	private final double rate = 9.25;
	
	
	public Paycheck(double theHours)
	{
		hours = theHours;
	}
	
	public double getPay()
	{
		double pay = 0;
		
		if (hours < 0)
		{
			System.out.println("Employee hours must be positive. ");
		}
		else
		{
			if(hours < 40)
			{
				return hours*rate;
			}
			else
			{
				return 40*rate + (hours - 40)*1.50*rate;
			}
		}
		return pay;
	}
}
