public class Product
{
    private String name;
    private double price;

    Product(String aName, double aPrice)
    {
        name = aName;
        price = aPrice;
    }

    String getName()
    {
        return name;
    }

    double getPrice()
    {
        return price;
    }
    
    void reducePrice(double reduceByAmount)
    {
        price -= reduceByAmount;
    }
}
