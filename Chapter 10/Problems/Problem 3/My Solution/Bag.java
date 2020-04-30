import java.util.ArrayList;

public class Bag implements BagInterface
{
  public class Item
  {
    String itemName;
    int quantity;
  }
  
  Item item;
  ArrayList<Item> items = new ArrayList<Item>();
  public void addItem(String itemName)
  {
    item = new Item();
    item.itemName = itemName;
    items.add(item);
  }
  
  public int count(String itemName)
  {
    int count=0;
    for(Item item: items)
    {
      if(itemName.equalsIgnoreCase(item.itemName))
        count++;
    }
    return count;
  }
}
