import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
  public static void main(String[] args)
  {
    String fileName = "input";
    
    LookupTable names = new LookupTable(1050);
    
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
    
    LookupTable numbers = new LookupTable(1050);
    numbers.reverse(names);
    
    boolean more = true;
    
    while (more)
    {
      String cmd = JOptionPane.showInputDialog("Lookup N)ame, P)hone, Q)uit?");
      
      if (cmd == null)
      {
        more = false;
      }
      else if (cmd.equalsIgnoreCase("Q"))
      {
        more = false;
      }
      else if (cmd.equalsIgnoreCase("N"))
      {
        String n = JOptionPane.showInputDialog("Enter name: ");
        System.out.println("Phone number: " + names.lookup(n));
      }
      else if (cmd.equalsIgnoreCase("P"))
      {
        String n = JOptionPane.showInputDialog("Enter phone number: ");
        System.out.println("Name: " + numbers.lookup(n));
      }
    }
    System.exit(0);
  }
}
