import java.util.Scanner;

public class Main 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student's name:");
    String student = sc.next();
    System.out.println("Enter number of hours worked:");
    double hours = sc.nextDouble();
    System.out.println("Enter hourly pay rate:");
    double pay = sc.nextDouble();
    double gross_pay = pay * hours;
    System.out.println("Enter federal tax rate:");
    double federal_tax = sc.nextDouble();
    double federal_tax_rate = federal_tax * 0.20;
    System.out.println("Enter social security tax rate:");
    double social_security_tax = sc.nextDouble();
    double social_security_tax_rate = social_security_tax * 0.20;
    double deductions = federal_tax_rate + social_security_tax_rate;
    double complete_pay = gross_pay - deductions;
    System.out.println("Student name: " + student);
    System.out.println("Hours worked: " + hours);
    System.out.println(" Enter payrate: " + pay);
    System.out.println(" Enter gross pay: " + gross_pay);
    System.out.println(" Deductions are listed as shown below: ");
    System.out.println("\t Federdal Tax Rate is: " + federal_tax_rate);
    System.out.println("\t Social Security Tax Rate is :" + social_security_tax_rate);
    System.out.println("\t Total deductions:" + deductions);
    System.out.println("Total pay: " + complete_pay);
  }
}
