import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    int n = 2;
	  int powerValue;
	  int sum = 0;
	  while (n <= 20)
	  {
		  powerValue= (n*n);
		  sum += powerValue;
		  n++;
	  }
	  System.out.println(sum);
  }
}
