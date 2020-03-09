import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter an integer between 1,000 and 999,999: ");
    String input = in.next();
    int length = input.length();
    String part1 = input.substring(0, length - 4);
    String part2 = input.substring(length - 3, length);
    String result = part1 + part2;
    System.out.println(result);
  } 
}
