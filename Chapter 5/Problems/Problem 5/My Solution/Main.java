import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the card notation: ");
		String input = in.nextLine();
		in.close();
		Card card = new Card(input);
		System.out.println(card.getDescription());
	}
}
