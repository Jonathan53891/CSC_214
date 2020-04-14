class Daily extends Appointment
{
  public Daily(int year, int month, int day, String description)
  {
    super(year, month, day, description);
  }
  
  boolean occursOn(int year, int month, int day)
  {
    return false;
  }
  
  public String toString()
  {
    return "Daily[" +this.getDescription() + ". Date: " + this.getMonth() + "/" + this.getDate() + "/" + this.getYear() + "]";
  }
}
