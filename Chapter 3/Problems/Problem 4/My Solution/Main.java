public class Main
{
    public static void main(String[] args)
    {
        Product lollipop = new Product("Lollipop", 7.45);
        Product marshmallow = new Product("Marshmallow", 10.10);

        System.out.println(lollipop.getName() + " price: $"
                + lollipop.getPrice());
        lollipop.reducePrice(5);

        System.out.println(marshmallow.getName() + " price: $"
                + marshmallow.getPrice());
        marshmallow.reducePrice(5);

        System.out.println(lollipop.getName() + " reduced price: $"
                + lollipop.getPrice());
        System.out.println(marshmallow.getName() + " reduced price: $" +
                marshmallow.getPrice());
    }
}
