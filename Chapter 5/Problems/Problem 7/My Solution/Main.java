import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        num = in.nextInt();
        System.out.println(intToRoman(num));
        in.close();
    }

    public static String intToRoman(int n)
    {
        String romanOnes = romanDigit(n % 10, "I", "V", "X");
        n = n / 10;
        String romanTens = romanDigit(n % 10, "X", "L", "C");
        n = n / 10;
        String romanHundreds = romanDigit(n % 10, "C", "D", "M");
        n = n / 10;
        String romanThousands = romanDigit(n % 10, "M", "M", "M");

        return romanThousands + romanHundreds + romanTens + romanOnes;
    }

    public static String romanDigit(int n, String one, String five, String ten)
    {
        if (n != 0)
        {
            if (n == 9)
            {
                return one + ten;
            }
            else if (n == 8)
            {
                return five + one + one + one;
            }
            else if (n == 7)
            {
                return five + one + one;
            }
            else if (n == 6)
            {
                return five + one;
            }
            else if (n == 5)
            {
                return five;
            }
            else if (n == 4)
            {
                return one + five;
            }
            else if (n == 3)
            {
                return one + one + one;
            }
            else if (n == 2)
            {
                return one + one;
            }
            else
            {
                return one;
            }
        }
        return "";
    }
}
