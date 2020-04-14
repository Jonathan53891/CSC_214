class Monthly extends Appointment
{
  public Monthly(int year, int month, int day, String description)
  {
    super(year, month, day, description);
  }
  
  boolean occursOn(int year, int month, int day)
  {
    return (this.getDate() == day);
  }
  
  public String toString()
  {
    return "Monthly[" +this.getDescription() + ". Date: " + this.getMonth() + "/" + this.getDate() + "/" + this.getYear() + "]";
  }
}
