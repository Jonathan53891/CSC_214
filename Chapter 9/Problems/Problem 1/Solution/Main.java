import java.util.Scanner;

public class Main
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    Manager manager = new Manager();
    System.out.print("Enter name of employee: ");
    manager.setName(in.nextLine());
    System.out.print("Enter name of base salary: ");
    manager.setBaseSalary(in.nextDouble());
    System.out.print("Enter bonus amount: ");
    manager.setBonus(in.nextDouble());

    System.out.println("Employee Name: " + manager.getName());
    System.out.println("Employee Base salary: " + manager.getSalary());
    System.out.println("Employee Bonus: " + manager.getBonus());
  }
}
