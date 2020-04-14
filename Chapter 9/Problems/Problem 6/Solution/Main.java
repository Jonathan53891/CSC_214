public class Main
{
  public static void main(String[] args)
  {
    Calendar calendar = new Calendar();
    calendar.add(new Daily(2000, 8, 13, "Brush your teeth."));
    calendar.add(new Monthly(2003, 5, 20, "Visit grandma."));
    calendar.add(new Onetime(2004, 11, 2, "Dentist appointment."));
    calendar.add(new Onetime(2004, 10, 31, "Trick or Treat."));
    calendar.add(new Monthly(2004, 11, 2, "Dentist appointment."));
    calendar.add(new Onetime(2004, 11, 2, "Dentist appointment."));
    
    System.out.println("Before removal of appointment " + "\n" + calendar);
    
    calendar.remove(2004, 11, 2);
    
    System.out.println("After removal of 11/2/2004 " + "\n" + calendar);
  }
}
