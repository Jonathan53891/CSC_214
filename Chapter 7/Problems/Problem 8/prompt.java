Consider the following class:

public class Sequence
{
   private ArrayList<Integer> values;
   public Sequence() { values = new ArrayList<Integer>(); }
   public void add(int n) { values.add(n); }
   public String toString() { return values.toString(); }
}

Add a method

public Sequence append(Sequence other)

that creates a new sequence, appending this and the other sequence, without 
modifying either sequence. For example, if a is
1 4 9 16
and b is the sequence
9 7 4 9 11
then the call a.append(b) returns the sequence
1 4 9 16 9 7 4 9 11
without modifying a or b.
