import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string :");
      String str = in.next();
      for(int i=0; i<str.length(); i++)
        System.out.println(str.charAt(i));
   }
}
