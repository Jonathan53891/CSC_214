import java.util.Scanner;

class Main
{
  public void readInt(Scanner in, String prompt, String error, int min, int max)
  {
    System.out.println(prompt);
    while(true)
    {
      System.out.println("Please enter a number to check: ");
      int number = in.nextInt();
      
      if(number < 10 || number > 999)
        System.out.println(error);
      else
        break;
    }
  }
  
  public static void main(String args[])
  {
    int min1 = 10 , max1 = 999;
    String msg = "Hello...! Welcome to My Program...!";
    String errMsg = "Your number is not in between 10 and 999. Please Enter another number to check :";
    Scanner s = new Scanner(System.in);
    Input inp = new Input();
    inp.readInt(s, msg, errMsg, min1, max1);
  }
}
