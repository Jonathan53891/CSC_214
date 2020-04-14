public class Main
{
  public static void main(String args[])
  {
    Employee e =new Employee("Neo",12000);
    e.tostring();
    
    Manager m =new Manager("Cramster",100000,"Homework");
    m.tostring();
    
    Executive ex =new Executive("Chegg",1000000,"Homework");
    ex.tostring();
  }
}
