import java.util.Scanner;

public class Main 
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = in.nextInt();
    
    if (n > 0)
    {
      System.out.println("It's a positive number");
    }
    else if (n < 0)
    {
      System.out.println("It's a negative number");
    }
    else
    {
      System.out.println("It's a zero");
    }
  }
}
