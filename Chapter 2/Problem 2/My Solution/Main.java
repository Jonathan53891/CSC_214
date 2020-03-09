class Main { 
    public static void main(String args[]) 
    { 
    System.out.println("This program demonstrates the behavior of String's trim() function.");
    System.out.println("");
    System.out.println("The starting string is");
    String s = new String("  Here is a string   with  multiple spaces");
    System.out.println(s);
    System.out.println("And here it is after applying the trim function");  
    System.out.println(s.trim()); 
    System.out.println("And after removing all spaces using the replace function: ");
    String target = " ";
    String replacement = "";
    System.out.println(s.replace(target, replacement));
       
    } 
} 
