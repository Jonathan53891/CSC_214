import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a date (month and day): " );
    int month = in.nextInt();
    int day = in.nextInt();
    in.close();
    Date date = new Date(month, day);
    System.out.println("Season: " + date.getSeason());
  }
}
