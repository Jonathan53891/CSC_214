import java.util.Scanner;
public class Main 
{
  static int sumRows(int[][] mat1,int n)
  {
    int N = n*n;
    int sumNow = 0, sum = (N*(N+1)/(2*n));
    for (int i=0;i<n;i++) 
    {
      sumNow=0;
      for (int j=0;j<n;j++) 
      {
        sumNow = sumNow + mat1[i][j];
      }
      
      if (sumNow!=sum) 
      {
        System.out.println(sum + " " + sumNow);
        sum = -1;
        break;
      }
    }
    return sum;
  }
  
  static int sumCols(int[][] mat1,int n)
  {
    int N = n*n;
    int sumNow = 0,sum = (N*(N+1)/(2*n));
    
    for (int i=0;i<n;i++) 
    {
      sumNow=0;
      for (int j=0;j<n;j++) 
      {
        sumNow = sumNow + mat1[j][i];
      }
      
      if (sumNow!=sum) 
      {
        System.out.println(sum + " " + sumNow);
        sum = -1;
        break;
      }
    }
    return sum;
  }
  
  static int sumDiag(int[][] mat1, int n)
  {
    int N = n*n;
    int sumNow1 = 0,sumNow2 = 0,sum = (N*(N+1)/(2*n));
    
    for(int i=0;i<n;i++)
    {
      sumNow1 = sumNow1 + mat1[i][i];
    }
    
    for(int i=0;i<n;i++)
    {
      sumNow2 = sumNow2 + mat1[n-i-1][i];
    }
    
    if (sumNow1 == sum && sumNow2 == sumNow2) 
    {
      return sum;
    }
    else 
    {
      return -1;
    }
  }
  
  public static void main(String[] args) 
  {
    int n=4;
    int[][] mat1= new int[n][n];
    int[] a=new int[(n*n)];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter " +( n*n )+" elements");
    int num=0;
    
    for (int i=0;i<n;i++) 
    {
      for (int j=0;j<n;j++) 
      {
        num=sc.nextInt();
        if (num>(n*n) || num < 1) 
        {
          System.out.println("number should be in range (1,"+(n*n)+")\n");
          return;
        }
        else
        {
          if (a[num-1]==1) 
          {
            System.out.println("repeated number not accetable");
            return;
          }
          else
          {
            mat1[i][j]=num;
            a[num-1]=1;
          }
        }
      }
    }
    
    int notAllNums=0;
    for (int x :a ) 
    {
      if (x!=1) 
      {
        notAllNums=1;
      }
    }
    if (notAllNums==1) 
    {
      System.out.println("all numbers are not present");
    }
    else
    {
      System.out.println("all numbers are present");
    }
    
    int sumR=sumRows(mat1,n);
    int sumC=sumCols(mat1,n);
    int sumD=sumDiag(mat1,n);
    int N=n*n;
    int sum=(N*(N+1)/(2*n));
    
    if (sumD==sumC && sumD==sum && sumD==sum) 
    {
      System.out.println("Matrix is a magic square");
    }
  }
}

