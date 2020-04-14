class Executive extends Manager
{
  void tostring()
  {
    System.out.println("Executive:\nName: "+name+"\nDepartment: "+department+"\nSalary: "+salary+"\n");
  }
  Executive(String n,double s,String d)
  {
    super(n,s,d);
  }
}
