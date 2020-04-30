import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CoinReader
{
	// Instance Variables
	private ArrayList<Coin> coinList = new ArrayList<Coin>();
	
	// Constructors
	
	// Methods
	public ArrayList<Coin> readFile(String fileName) throws IOException
	{
		File inFile = new File(fileName);//"src\\project_5\\".concat(fileName));
		Scanner in = new Scanner(inFile);
		
		try
		{
			readData(in);
			return coinList;
		}
		finally
		{
			in.close();
		}
	}
	
	public void readData(Scanner in) throws BadDataException
	{
		while(in.hasNextLine())
		{
			if(in.hasNextInt() || in.hasNextDouble())
			{
				coinList.clear();
				throw new BadDataException("Coin Name Expected");
			}
			String coinName = in.next();
			
			if(!in.hasNextDouble())
			{
				coinList.clear();
				throw new BadDataException("Coin Value Expected");
			}
			double coinValue = in.nextDouble();
			
			// Create the coin and add it to the array list
			Coin newCoin = new Coin(coinValue, coinName);
			coinList.add(newCoin);
		}
	}
}
