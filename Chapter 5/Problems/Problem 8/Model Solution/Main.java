import java.util.Scanner;

class Main
{
   public static void main(String[] args)
   {
      final String MY_PIN = "1234";
      Scanner in = new Scanner(System.in);

      boolean flag = false;

      System.out.print("Enter your PIN: ");
      String pin = in.next();

      if (pin.equals(MY_PIN))
      {
         System.out.println("Your PIN is correct");
         flag = true;
      }
      else
      {
         if (flag == false)
         {
            System.out.println("Your PIN is incorrect");
            System.out.print("Enter your PIN: ");
            pin = in.next();

            if (pin.equals(MY_PIN))
            {
               System.out.println("Your PIN is correct");
               flag = true;
            }

            if (flag == false)
            {
               System.out.println("Your PIN is incorrect");
               System.out.print("Enter your PIN: ");

               pin = in.next();

               if (pin.equals(MY_PIN))
               {
                  System.out.println("Your PIN is correct");
                  flag = true;
               }

               if (flag == false)
               {
                  System.out.println("Your bank card is blocked");
               }
            }
         }
      }
   }
}
