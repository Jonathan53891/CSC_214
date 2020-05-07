import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String fileName = "input";
    
    LookupTable names = new LookupTable(440);
    
    try
    {
      FileReader in = new FileReader(fileName + ".txt");
      names.read(new BufferedReader(in));
    }
    catch (IOException e)
    {
      System.out.println(e);
      System.exit(1);
    }

    LookupTable numbers = new LookupTable(440);
    numbers.reverse(names);
    
    boolean more = true;
    
    String menu = "Lookup N)ame, P)hone, Q)uit?";
    System.out.println(menu);
    Scanner scan = new Scanner(System.in);
    String choice = scan.nextLine();
    do {
      switch (choice)
      {
        case "N":
          String name_request = "Enter name: ";
          System.out.println(name_request);
          String n = scan.nextLine();
          System.out.println("Phone number: " + names.lookup(n)); 
          break;
        case "P":
          String phone_request = "Enter phone number: ";
          System.out.println(phone_request);
          String p = scan.nextLine();
          System.out.println("Name: " + numbers.lookup(p));
          break;
        case "Q":
          System.exit(1);
          break;
        default:
          break;
      }
      return;
    }
    while (choice != "Q");
  }
}
