/*


Write a program that reads in a set of coin descriptions from a file. 

The input file has the format 
   coinName1 coinValue1 
   coinName2 coinValue2 
    . . . 
	
Add a method 
    void read(Scanner in) throws FileNotFoundException 

to the Coin class of Section 8.2. 

Throw an exception if the current line is not properly formatted. 

Then implement a method 

static ArrayList readFile(String filename) throws FileNotFoundException 

In the main method, call readFile. 

If an exception is thrown, give the user a chance to select another file. If you read all coins successfully, print the total value.

*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		CoinReader reader = new CoinReader();
		ArrayList<Coin> data = new ArrayList<Coin>();
		
		boolean isDone = false;
		while(!isDone)
		{	
			try
			{
				System.out.print("Enter Input File Name: ");
				String fileName = in.next();
				
				data = reader.readFile(fileName);
				
				for(Coin coins : data)
				{
					System.out.println(coins.getCoinName() + "-" + coins.getCoinValue());
				}
				
				isDone = true;
			}
			catch(FileNotFoundException e)
			{
				System.out.println("ERROR: File Not Found");
				
			}
			catch(BadDataException e)
			{
				System.out.println("Bad Data: " + e.getMessage());
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		in.close();
	}
}
