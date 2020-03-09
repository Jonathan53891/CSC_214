public class Card
{
	private String input;
	
	public Card(String input)
	{
		//Ace
		if (input.equals("AD"))
		{
			this.input = "Ace of Diamonds";
			return;
		}
		else if (input == "AH") 
		{
			this.input = "Ace of Hearts";
			return;
		}
		else if (input == "AS") 
		{
			this.input = "Ace of Spades";
			return;
		}
		else if (input == "AC") 
		{
			this.input = "Ace of Clubs";
			return;
		}
		else if (input.equals("KD")) 
		{
			this.input = "King of Diamonds";
			return;
		}
		else if (input == "KH") 
		{
			this.input = "King of Hearts";
			return;
		}
		else if (input == "KS") 
		{
			this.input = "King of Spades";
			return;
		}
		else if (input == "KC") 
		{
			this.input = "King of Clubs";
			return;
		}
		else if (input.equals("QD")) 
		{
			this.input = "Queen of Diamonds";
			return;
		}
		else if (input == "QH") 
		{
			this.input = "Queen of Hearts";
			return;
		}
		else if (input == "QS") 
		{
			this.input = "Queen of Spades";
			return;
		}
		else if (input == "QC") 
		{
			this.input = "Queen of Clubs";
			return;
		}
		else if (input.equals("JD")) 
		{
			this.input = "Jack of Diamonds";
			return;
		}
		else if (input == "JH") 
		{
			this.input = "Jack of Hearts";
			return;
		}
		else if (input == "JS") 
		{
			this.input = "Jack of Spades";
			return;
		}
		else if (input == "JC") 
		{
			this.input = "Jack of Clubs";
			return;
		}
		else if (input.equals("10D")) 
		{
			this.input = "Ten of Diamonds";
			return;
		}
		else if (input == "10H") 
		{
			this.input = "Ten of Hearts";
			return;
		}
		else if (input == "10S") 
		{
			this.input = "Ten of Spades";
			return;
		}
		else if (input == "10C") 
		{
			this.input = "Ten of Clubs";
			return;
		}
		else if (input.equals("9D")) //9
		{
			this.input = "Nine of Diamonds";
			return;
		}
		else if (input == "9H") 
		{
			this.input = "Nine of Hearts";
			return;
		}
		else if (input == "9S") 
		{
			this.input = "Nine of Spades";
			return;
		}
		else if (input == "9C") 
		{
			this.input = "Nine of Clubs";
			return;
		}
		else if (input.equals("8D")) //8
		{
			this.input = "Eight of Diamonds";
			return;
		}
		else if (input == "8H") 
		{
			this.input = "Eight of Hearts";
			return;
		}
		else if (input == "8S") 
		{
			this.input = "Eight of Spades";
			return;
		}
		else if (input == "8C") 
		{
			this.input = "Eight of Clubs";
			return;
		}
		else if (input.equals("7D")) //7
		{
			this.input = "Seven of Diamonds";
			return;
		}
		else if (input == "7H") 
		{
			this.input = "Seven of Hearts";
			return;
		}
		else if (input == "7S") 
		{
			this.input = "Seven of Spades";
			return;
		}
		else if (input == "7C") 
		{
			this.input = "Seven of Clubs";
			return;
		}
		else if (input.equals("6D")) //6
		{
			this.input = "Six of Diamonds";
			return;
		}
		else if (input == "6H") 
		{
			this.input = "Six of Hearts";
			return;
		}
		else if (input == "6S") 
		{
			this.input = "Six of Spades";
			return;
		}
		else if (input == "6C") 
		{
			this.input = "Six of Clubs";
			return;
		}
		else if (input.equals("5D")) //5
		{
			this.input = "Five of Diamonds";
			return;
		}
		else if (input == "5H") 
		{
			this.input = "Five of Hearts";
			return;
		}
		else if (input == "5S") 
		{
			this.input = "Five of Spades";
			return;
		}
		else if (input == "5C") 
		{
			this.input = "Five of Clubs";
			return;
		}
		else if (input.equals("4D")) //4
		{
			this.input = "Four of Diamonds";
			return;
		}
		else if (input == "4H") 
		{
			this.input = "Four of Hearts";
			return;
		}
		else if (input == "4S") 
		{
			this.input = "Four of Spades";
			return;
		}
		else if (input == "4C") 
		{
			this.input = "Four of Clubs";
			return;
		}
		else if (input.equals("3D")) //3
		{
			this.input = "Three of Diamonds";
			return;
		}
		else if (input == "3H") 
		{
			this.input = "Three of Hearts";
			return;
		}
		else if (input == "3S") 
		{
			this.input = "Three of Spades";
			return;
		}
		else if (input == "3C") 
		{
			this.input = "Three of Clubs";
			return;
		}
		else if (input.equals("2D")) //2
		{
			this.input = "Two of Diamonds";
			return;
		}
		else if (input == "2H") 
		{
			this.input = "Two of Hearts";
			return;
		}
		else if (input == "2S") 
		{
			this.input = "Two of Spades";
			return;
		}
		else if (input == "2C") 
		{
			this.input = "Two of Clubs";
			return;
		}
		else 
		{
			System.out.println("Unknown");
			return;
		}
	}
	
	public String getDescription()
	{
		return this.input;
	}  
}
