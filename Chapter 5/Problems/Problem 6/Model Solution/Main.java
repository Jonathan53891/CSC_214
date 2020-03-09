import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	    Scanner in = new Scanner(System.in);

      System.out.print("Please enter a date (month and day): " );
      int month = in.nextInt();
      int day = in.nextInt();
      Date date = new Date(month, day);
      System.out.println("Season: " + date.getSeason());
   }
}

/**
   This class calculates the season for a given month and day.
*/
class Date
{
   private int day;
   private int month;

   /**
      Constructs a Date with a month and day.
      @param month the month number with January being 1
      @param day the day of the month
   */
   public Date(int month, int day)
   {
      this.month = month;
      this.day = day;
   }

   /**
      @return the season of this date.
   */
   public String getSeason()
   {
      String season;
      if (month >= 1 && month <= 3)
      {
         season = "Winter";
      }
      else if (month >= 4 && month <= 6)
      {
         season = "Spring";
      }
      else if (month >= 7 && month <= 9)
      {
         season = "Summer";
      }
      else
      {
         season = "Fall";
      }

      if (month % 3 == 0 && day >= 21)
      {
         if (season.equals("Winter"))
         {
            season = "Spring";
         }
         else if (season.equals("Spring"))
         {
            season = "Summer";
         }
         else if (season.equals("Summer"))
         {
            season = "Fall";
         }
         else
         {
            season = "Winter";
         }
      }
      return season;
   }
}
