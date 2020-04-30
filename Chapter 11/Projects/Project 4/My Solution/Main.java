/* 
Write a program that replaces each line of a file with its reverse. 

Of course, if you run Reverse twice on the same file, you get back the original file.

*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) throws FileNotFoundException 
  {
    String file_name;
    if (args.length == 1) 
    {
      file_name = args[0];
    } 
    else 
    {
      System.out.print("File name: ");
      Scanner sc = new Scanner(System.in);
      file_name = sc.next();
      sc.close();
    }
    Scanner fr=null;
    
    try
    {
      fr = new Scanner(new File(file_name));
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Sorry File Not Found. Please check and rerun the program\n");
      System.exit(0);
    }
    while (fr.hasNextLine()) 
    {
      String line = fr.nextLine();
      line = reverse(line);
      System.out.println(line);
    }
    fr.close();
  }

  public static String reverse(String line) 
  {
    return new StringBuilder(line).reverse().toString();
  }
}
