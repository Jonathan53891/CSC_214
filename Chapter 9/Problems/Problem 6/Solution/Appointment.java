abstract class Appointment
{
  private String description;
  private int year;
  private int month;
  private int date;
  
  public Appointment(int year, int month, int date, String description)
  {
    this.year = year;
    this.month = month;
    this.date = date;
    this.description = description;
  }
  
  abstract boolean occursOn(int year, int month, int day);
  
  public String getDescription()
  {
    return this.description;
  }
  
  public int getYear()
  {
    return this.year;
  }
  
  public int getMonth()
  {
    return this.month;
  }
  
  public int getDate()
  {
    return this.date;
  }
}
