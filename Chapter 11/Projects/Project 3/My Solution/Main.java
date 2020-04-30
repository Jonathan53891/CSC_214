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
   
   The line numbers are enclosed in //# # delimiters so that the program can be used 
   for numbering Java source files. Prompt the user for the input and output file 
   names.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Construct a scanner to scan for input values in the console
		Scanner console = new Scanner(System.in);
		
		// Read in the names for the input file and output file
		String inputFileName = "";
		String outputFileName = "";
		
		System.out.print("Enter Input File Name: ");
		inputFileName = inputFileName.concat(console.next());
		
		System.out.print("Enter Output File Name: ");
		outputFileName = outputFileName.concat(console.next());
		
		// Close the console scanner
		console.close();
		
		// Construct a PrintWriter, File, and Scanner object
		PrintWriter out = new PrintWriter(outputFileName);
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		
		// Write to the output file
		int lineNum = 0;
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			lineNum++;
			
			out.println("/* " + lineNum + "*/ " + line);
		}
		
		in.close();
		out.close();
	}
}
