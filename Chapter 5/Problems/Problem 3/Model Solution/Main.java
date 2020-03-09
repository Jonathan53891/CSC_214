/**
  Class TaxReturn is used to determine the tax amount for a person.
  The original U.S. income tax table of 1913 is applied.
*/
class TaxReturn
{
   private static final double RATE1 = 0.06;
   private static final double RATE2 = 0.05;
   private static final double RATE3 = 0.04;
   private static final double RATE4 = 0.03;
   private static final double RATE5 = 0.02;
   private static final double RATE6 = 0.01;

   private static final double BRACKET1 = 500000;
   private static final double BRACKET2 = 250000;
   private static final double BRACKET3 = 100000;
   private static final double BRACKET4 = 75000;
   private static final double BRACKET5 = 50000;

   private double income;

   /**
      Constructs a TaxReturn object for a given income.
      @param anIncome the taxpayer income
   */
   public TaxReturn(double anIncome)
   {
      income = anIncome;
   }

   /**
     Method used to calculate the tax.
     @return the tax amount
   */
   public double getTax()
   {
      double tax = 0;

      /* this preserves the original income after tax is calculated */
      double tIncome = income;

      if (tIncome > BRACKET1)
      {
         tax += (tIncome - BRACKET1) * RATE1;
         tIncome = BRACKET1;
      }

      if (tIncome > BRACKET2)
      {
         tax += (tIncome - BRACKET2) * RATE2;
         tIncome = BRACKET2;
      }

      if (tIncome > BRACKET3)
      {
         tax += (tIncome - BRACKET3) * RATE3;
         tIncome = BRACKET3;
      }

      if (tIncome > BRACKET4)
      {
         tax += (tIncome - BRACKET4) * RATE4;
         tIncome = BRACKET4;
      }

      if (tIncome > BRACKET5)
      {
         tax += (tIncome - BRACKET5) * RATE5;
         tIncome = BRACKET5;
      }

      tax += tIncome * RATE6;

      return tax;
   }
}


public class Main
{
   public static void main(String[] args)
   {
      double income = 600000;

      TaxReturn aTaxReturn = new TaxReturn(income);

      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 26250.0");

      income = 1000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 10.0");

      income = 117000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 2430.0");

      income = 60000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 700.0");

      income = 85000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 1300.0");
      
      income = 110000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 2150.0");
      
      income = 260000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 8250.0");

      income = 510000;
      aTaxReturn = new TaxReturn(income);
      System.out.println("Income of " + income 
                  + ", Tax: " + aTaxReturn.getTax());
      System.out.println("Expected: 20850.0");
   }
}
