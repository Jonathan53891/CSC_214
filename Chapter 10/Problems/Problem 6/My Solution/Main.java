public class Main 
{
  private static void print(int n, NumberFormatter formatter)
  {
    String s = String.format("%15s",formatter.format(n));
    System.out.print(s);
  }
  
  public static void main(String[] args) 
  {
    int numbers[]= {100,55555,1000000,35,5};
    DefaultFormatter defFmt = new DefaultFormatter();
    DecimalFormatter deciFmt = new DecimalFormatter();
    AccountingFormatter accFmt = new AccountingFormatter();
    BaseFormatter baseFmt=new BaseFormatter(16) ; //base 16
    String s;
    System.out.println("\tDefault \t Decimal \tAccounting \t Base("+baseFmt.getBase()+")");
    
    for(int i = 0; i < numbers.length; i++)
    {
      print(numbers[i], defFmt);
      print(numbers[i], deciFmt);
      print(numbers[i], accFmt);
      print(numbers[i], baseFmt);
      
      System.out.println();//new line
    }
  }
}
