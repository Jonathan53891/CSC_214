/*

Write a program that reads a file containing text. 

Read each line and send it to the output file, preceded by line numbers. 

If the input file is 
          Mary had a little lamb Whose fleece was white as snow. 
		  And everywhere that Mary went, The lamb was sure to go! 
		  
then the program produces the output file 
   //# 1 # Mary had a little lamb 
   //# 2 # Whose fleece was white as snow. 
   //# 3 # And everywhere that Mary went, 
   //# 4 # The lamb was sure to go! 
   
   The line numbers are enclosed in //# # delimiters so that the program can be used for numbering Java source files. Prompt the user for the input and output file names.

*/

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main
{
  public static void main(String[] args) throws FileNotFoundException
  {
    int ln = 1;
    Scanner input = new Scanner(System.in); // taking input from the keyboard
    System.out.print("i/p file: ");
    String inputFileName = input.next();
    System.out.print("o/p file: ");
    String outputFileName = input.next();
    FileReader rd = new FileReader("inputfile.txt"); // reading input file
    Scanner inf = new Scanner(rd);
    PrintWriter outf = new PrintWriter("outputfile.txt");//writing out put file using printWriter
    while (inf.hasNextLine()) // iterating at the end of the last line from the first line
    {
      String a = inf.nextLine();
      outf.println("/* " + ln + " */ " + a); //keeping line numbers before every line
      ln++; // incrementing the line number for each and every line
    }
    outf.close(); // closing the output file
  }
}
