public class Coin
{
	// Instance Variables
	private double coinValue;
	private String coinName;
	
	// Constructors
	public Coin(double value, String name)
	{
		coinValue = value;
		coinName = name;
	}
	
	// Methods
	public double getCoinValue()
	{
		return coinValue;
	}
  
	public String getCoinName()
	{
		return coinName;
	}
}
