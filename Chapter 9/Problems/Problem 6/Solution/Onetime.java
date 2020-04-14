class Onetime extends Appointment
{
  public Onetime(int year, int month, int day, String description)
  {
    super(year, month, day, description);
  }
  
  boolean occursOn(int year, int month, int day)
  {
    return (this.getYear() == year && this.getMonth() == month && this.getDate() == day);
  }
  
  public String toString()
  {
    return "Onetime[" +this.getDescription() + ". Date: " + this.getMonth() + "/" + this.getDate() + "/" + this.getYear() + "]";
  }
}

