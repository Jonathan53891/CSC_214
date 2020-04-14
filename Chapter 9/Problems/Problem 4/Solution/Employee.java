class Employee
{
  String name;
  double salary;
  void tostring()
  {
    System.out.println("Employee:\nName: "+name+"\nSalary: "+salary+"\n");
  }
  Employee(String n,double s)
  {
    name=n;
    salary=s;
  }
}
