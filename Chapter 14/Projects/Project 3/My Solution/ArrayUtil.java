import java.util.Random;

public class ArrayUtil
{
  public static int[] randomIntArray(int length, int n)
  {
    int[] a = new int[length];
    Random generator = new Random();
    
    for (int i = 0; i < a.length; i++)
    {
      a[i] = generator.nextInt(n);
    }
    return a;
  }
  
  public static void print(int[] a)
  {
    for (int el : a)
    {
      System.out.print(el + " ");
    }
    System.out.println();
  }
}
