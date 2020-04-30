/*

Write a program that carries out the following tasks:

1. Open a file with the name hello.txt.
2. Store the message "Hello, World!" in the file.
3. Close the file.
4. Open the same file again.
5. Read the message into a string variable and print it.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Open A File with the name file_name_input.txt, write something, and then close it
		File outputFile = new File("src\\exercise_11_1\\file_name_output.txt");
		
		try(PrintWriter out = new PrintWriter(outputFile))
		{
			out.println("Im trying to print something to the file");
		}
		
		// Open the same file and read it
		try(Scanner in = new Scanner(outputFile))
		{
			String line = in.nextLine();
			System.out.println(line);
		}
	}
}
