public class Main 
{
  public static void main(String[] args)
  {
    BagInterface bag = new Bag();
    bag.addItem("ball");
    bag.addItem("ball");
    bag.addItem("ball");
    bag.addItem("ball");
    bag.addItem("apple");
    bag.addItem("apple");
    bag.addItem("orange");
    bag.addItem("orange");
    bag.addItem("orange");
    System.out.println("Count of ball::" + bag.count("ball"));
    System.out.println("Count of apple::" + bag.count("apple"));
    System.out.println("Count of orange::" + bag.count("orange"));
  }
}
