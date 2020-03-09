import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    System.out.print("Please enter 2 integers: "); //prompts user for ints
    int a = in.nextInt(); 
    int b = in.nextInt();
    int sum = 0;
    int temp;
    if(a > b) {
      temp = a;
      a = b;
      b = temp;
    }
    for (int j = a; j <= b; j++)
    {
      if (j % 2 == 1)
      sum += j;
    }
    System.out.println("The sum of all odd numbers (inclusive) between " + a + " and "+ b + " is " + sum);
   }
}
