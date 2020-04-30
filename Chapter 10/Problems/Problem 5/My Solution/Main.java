import java.util.ArrayList;

interface Filter 
{
  boolean accept(Object x);
}

interface Measurable 
{
  int getMeasure();
  static Measurable largest(Measurable[] array) 
  {
    Measurable max = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i].getMeasure() > max.getMeasure()) max = array[i];
    }
    return max;
  }
  static Measurable smallest(Measurable[] array) 
  {
    Measurable min = array[0];
    for (int i = 0; i < array.length; i++) 
    {
      if (array[i].getMeasure() < min.getMeasure()) min = array[i];
    }
    return min;
  }
  static int average(Measurable[] array) 
  {
    int sum = 0;
    for (int i = 0; i < array.length; i++) 
    {
      sum += array[i].getMeasure();
    }
    return sum / array.length;
  }
}
class BankAccount implements Measurable 
{
  private int money;
  public int getMeasure() { return money; }
  public BankAccount(int m) {
    money = m;
  }
  public String toString() {
    return "BankAccount { money: " + money + " }";
  }
}
class BankAccountFilter implements Filter {
  int cutoff;
  public BankAccountFilter(int c) {
    cutoff = c;
  }
  public boolean accept(Object a) {
    if (a instanceof BankAccount) return ((BankAccount)a).getMeasure() >= cutoff;
    else return false;
  }
}
 
class Main {
  public static void main(String[] args) {
    ArrayList<BankAccount> b = new ArrayList<BankAccount>();
    b.add(new BankAccount(10));
    b.add(new BankAccount(100));
    b.add(new BankAccount(1000));
    b.add(new BankAccount(10000));
    System.out.println("Before filter");
    System.out.println(b);
    BankAccountFilter f = new BankAccountFilter(1000);
    for (int i = b.size()-1; i >= 0; i--) {
      if (!f.accept(b.get(i))) {
        b.remove(i);
      }
    }
    System.out.println("\nAfter filter");
    System.out.println(b);
   
  }
}
