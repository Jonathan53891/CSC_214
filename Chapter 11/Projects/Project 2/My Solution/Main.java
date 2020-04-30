// Write a program that reads a file, removes any blank lines, and writes the 
// non-blank lines back to the same file.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) throws FileNotFoundException 
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter input file name: ");
    String filename = in.next();
    Scanner fin = new Scanner(new File(filename));
    ArrayList<String> lines = new ArrayList<>();
    while (fin.hasNextLine()) 
    {
      lines.add(fin.nextLine());
    }
    fin.close();
    in.close();
    PrintWriter printWriter = new PrintWriter(filename);
    for(String line: lines) 
    {
      if(!line.isEmpty()) 
      {
        printWriter.println(line);
      }
    }
    printWriter.flush();
    printWriter.close();
  }
}
