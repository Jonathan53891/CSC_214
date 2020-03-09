// when putting multiple classes in a repl, do not use public in front of class.
// In a normal environment, when creating a public class, you should
// i.e.  public class Main

class Main {
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

class Counter
{
  private int value;
  private int limit;

  public int getValue()
  {
      return value;
  }

  public void setLimit(int maximum)
  {
      limit = maximum;
  }

  public void click()
  {
    value = Math.min(value + 1, limit);
  }

  public void undo()
  {
    value = Math.max(value - 1, 0);
  }

  public void reset()
  {
    value = 0;
  }	
}
