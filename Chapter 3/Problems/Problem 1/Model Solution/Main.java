// when putting multiple classes in a repl, do not use public in front of class.
// In a normal environment, when creating a public class, you should
// i.e.  public class Main

public class Main {
  public static void main(String[] args) {
      Counter tally = new Counter();
      tally.setLimit(3);
      tally.click();
      tally.click();
      tally.click();
      System.out.println(tally.getValue());
      System.out.println("Expected: 3");
      tally.click();
      System.out.println(tally.getValue());
      System.out.println("Expected: 3");
  }
}

/**
   This class models a tally counter.
*/
class Counter
{
   private int value;
   private int max;

   /**
      Sets the tally limit.
      @param maximum Admission limit.
   */
   public void setLimit(int maximum)
   {
      max = maximum;
   }

   /**
      Gets the current value of this counter.
      @return the current value
   */
   public int getValue()
   {
      return value;
   }

   /**
      Advances the value of this counter by 1.
   */
   public void click()
   {
      value = Math.min(value + 1, max);
   }

   /**
      Resets the value of this counter to 0.
   */
   public void reset()
   {
      value = 0;
   }
}
