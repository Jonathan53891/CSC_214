import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        
        boolean first = true;
        int min = 0;
        int val = 0;
        
        while (scan.hasNextInt())
        {
            val = scan.nextInt();
            System.out.println("Enter an integer");
            if (first == true)
            {
                min = val;
                first = false;
            }
            else if (val < min)
            {
                System.out.println("Enter an integer");
                min = val;
            }
            while (!scan.hasNextInt())
            {
                System.out.println (("The minimum value is ") + (min));
                break;
            }
        }
    }
}
