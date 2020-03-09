import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer number:");
    int val = in.nextInt();
    val = Math.abs(val);
    String valStr = String.valueOf(val);
    int digitCount = valStr.length();
    System.out.println("The number " + val + " has " + digitCount + " digits");
  }
}
