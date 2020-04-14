import java.util.ArrayList;
import java.util.Iterator;

class Calendar
{
  ArrayList<Appointment> appointments;
  
  public Calendar()
  {
    appointments = new ArrayList<Appointment>();
  }
  
  public void add(Appointment apt)
  {
    this.appointments.add(apt);
  }
  
  public void remove(int year, int month, int day)
  {
    Iterator<Appointment> appointmentsIterator = appointments.iterator();
    
    while(appointmentsIterator.hasNext())
    {
      Appointment appointment = appointmentsIterator.next();
      
      if(appointment.getDate() == day && appointment.getMonth() == month && appointment.getYear() == year)
      {
        appointmentsIterator.remove();
      }
    }
  }
  
  public String toString()
  {
    String output = "";
    for(Appointment appointment : appointments)
    {
      output = output + appointment + "\n";
    }
    return output;
  }
}
