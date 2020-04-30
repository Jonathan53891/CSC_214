class Segment implements CharSequence {
  String reference;
  int startIndex;
  int endIndex; // Exclusive
  public Segment(String r, int start, int end) {
    if (start < 0 || end < 0 || end <= start) {
      throw new IndexOutOfBoundsException("Invalid start and end passed." );
    }
    reference = r;
    startIndex = start;
    endIndex = end;
  }
  public char charAt(int index) {
    if (startIndex + index >= endIndex) {
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }
    return reference.charAt(startIndex + index);
  }
  public int length() {
    return endIndex-startIndex;
  }
  public Segment subSequence(int start, int end) {
    if (start < 0 || end < 0 || end <= start || end > length()) {
      throw new IndexOutOfBoundsException("Invalid start and end passed." );
    }
    return new Segment(reference, startIndex + start, startIndex+start+end);
  }
  public String toString() {
    return reference.substring(startIndex,endIndex);
  }
}
class Main {
  public static void main(String[] args) {
    String a = "This is hypothetically a very long string, and needs to be split up into segments.";
    Segment s1 = new Segment(a,0,22);
    Segment subs1 = s1.subSequence(8,14);
    System.out.println("Segment 1: " + s1);
    System.out.println("Length: " + s1.length());
    System.out.println("3rd char: " + s1.charAt(2));
    System.out.println("Subsegment 1: " + subs1);
    System.out.println("Length: " + subs1.length());
    System.out.println("3rd char: " + subs1.charAt(2));
   
  }
}
