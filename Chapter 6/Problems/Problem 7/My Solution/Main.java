import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        
        String word = in.next();
        in.close();
        char[] charArray = word.toCharArray(); 
        // Line above is an array that converts 'string' to 'char'
        // Looping through char array, in reverse order, i.e from last to first
        // While printing each character at that index
        for (int i = word.length() - 1; i >= 0; i--) 
        {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }
}
