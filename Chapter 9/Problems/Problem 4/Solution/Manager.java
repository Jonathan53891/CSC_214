class Manager extends Employee
{
  String department;
  void tostring()
  {
    System.out.println("Manager:\nName: "+name+"\nDepartment: "+department+"\nSalary: "+salary+"\n");
  }
  Manager(String n,double s,String d)
  {
    super(n,s);
    department=d;
  }
}
