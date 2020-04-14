import java.util.Scanner;

public class Main
{

   public static void main(String[] args)
   {
      Appointment[] appointments = new Appointment[4];
      appointments[0] = new Daily(2016, 1, 1, "Brush your teeth.");
      appointments[1] = new Monthly(2016, 1, 31, "Visit grandma.");
      appointments[2] = new Onetime(2016, 3, 3, "Dentist appointment.");
      appointments[3] = new Onetime(2016, 4, 2, "Trick or Treat.");

      System.out.println("Enter a date (year, month, day) to list "
         + "appointments: ");
      Scanner in = new Scanner(System.in);
      int year = in.nextInt();
      int month = in.nextInt();
      int day = in.nextInt();
      for (int i = 0; i < appointments.length; i++)
      {
         if (appointments[i].occursOn(year, month, day))
         {
            System.out.println(appointments[i]);
         }
      }
   }
}
