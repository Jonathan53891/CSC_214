/*
Consider the following class:

public class Sequence
{
  private int[] values;
  public Sequence(int size) { values = new int[size]; }
  public void set(int i, int n) { values[i] = n; }
  public int get(int i) { return values[i]; }
  public int size() { return values.length; }
}

Add a method
public boolean equals(Sequence other)

that checks whether two sequences have the same values in the same order.
*/
