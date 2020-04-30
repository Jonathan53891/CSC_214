import java.util.Arrays;

/**
 * Modify the selection sort algorithm to sort an array of coins by their value."
 */

public class Main 
{
  public class Coin
  {
    private int value;
    private String name;

    private Coin(int aValue, String aName) 
    {
      value = aValue;
      name = aName;
    }
    
    private int getValue() 
    {
      return value;
    }

    public String toString() 
    {
      return name;
    }
  }

  public static void main(String[] args) 
  {
    Coin[] coins = new Coin[5];
    coins[2] = new Main().new Coin(1, "cent");
    coins[3] = new Main().new Coin(5, "nickel");
    coins[4] = new Main().new Coin(10, "dime");
    coins[1] = new Main().new Coin(25, "penny");
    coins[0] = new Main().new Coin(100, "dollar");

    System.out.println("Before sort: " + Arrays.toString(coins));

    // Selection sort coins by their value.
    for (int i = 0; i < coins.length; i++) 
    {
      int minPos = i;
      for(int j=i;j<coins.length;j++)
      {
        if(coins[j].getValue()<coins[minPos].getValue())
        {
          minPos=j;
        }
      }
      Coin temp=coins[minPos];
      coins[minPos]=coins[i];
      coins[i]=temp;
    }
    System.out.println("After sort: " + Arrays.toString(coins));
  }
}
