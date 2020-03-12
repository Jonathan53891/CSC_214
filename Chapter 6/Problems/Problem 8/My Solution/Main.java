import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Side length: ");
    int sideLength = input.nextInt();
    input.close();

    int maxWidth = sideLength * 2 - 1;
    int halfWidth = maxWidth / 2;
    int dotNum = 1;

    // top half
    for (int i = 0; i < sideLength; i++)
    {
      for (int j = 0; j < halfWidth; j++)
      {
        System.out.print(" ");
      }
      for (int j = 0; j < dotNum; j++)
      {
        System.out.print("*");
      }
      System.out.println();
      dotNum += 2;
      halfWidth -= 1;
    }
    // bottom half
    dotNum = maxWidth - 2;
    halfWidth = 1;
    for (int i = 0; i < sideLength; i++)
    {
      for (int j = 0; j < halfWidth; j++)
      {
        System.out.print(" ");
      }
      for (int j = 0; j < dotNum; j++)
      {
        System.out.print("*");
      }
      System.out.println();
      dotNum -= 2;
      halfWidth += 1;
    }
  }
}
