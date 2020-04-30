public class Country implements Measurable//, Named
{
	private String name;
	private double area;

	public Country(String countryName, double countryArea)
	{
		this.name = countryName;
		this.area = countryArea;
	}
	
	public String getCountryName()
	{
		return this.name;
	}
	
	public double getCountryArea()
	{
		return this.area;
	}
	
	public double getMeasure()
	{
		return area;
	}
	
	public String getName()
	{
		return name;
	}
}
