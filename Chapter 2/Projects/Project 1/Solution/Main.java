import java.util.Calendar;
import java.util.GregorianCalendar;

class Main
{
    public static void main(String[] args)
    {
      GregorianCalendar today = new GregorianCalendar();

        // The day and weekday that is 100 days from today
        today.add(Calendar.DAY_OF_MONTH, 100);
        int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int weekDay = today.get(Calendar.DAY_OF_WEEK);
        System.out.print("The date and weekday that is 100 days from today: " + dayOfMonth + ", " + weekDay);
        System.out.println();

        // The weekday of My birthday
        GregorianCalendar myBirthDay = new GregorianCalendar(1999, 10, 5);
        int birthDayWeekDay = myBirthDay.get(Calendar.DAY_OF_WEEK);
        System.out.println("The weekday of my birthday: " + birthDayWeekDay);

        // The date that is 10,000 days from my birthday
        myBirthDay.add(Calendar.DAY_OF_MONTH, 10000);
        int day = myBirthDay.get(Calendar.DAY_OF_MONTH);
        int month = myBirthDay.get(Calendar.MONTH);
        int year = myBirthDay.get(Calendar.YEAR);
        System.out.print("10,000 days from my birthday: ");
        System.out.println(year + "-" + month + "-" + day);
    }
}
