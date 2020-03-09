class Main {
  public static void main(String[] args) {
        System.out.println ("This program demonstrates the behavior of String's trim() function.\n");
        String data = "  Here is a string   with  multiple spaces   ";
        // Demonstrate the use of trim
        System.out.println("The starting string is ");
        System.out.println( data);
        System.out.println("And here it is after applying the trim function");
        System.out.println( data.trim() );
        System.out.println("And after removing all spaces using the replace function:");
        System.out.println(data.replace(" ",""));
  }
}
