import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
   A table for lookups and reverse lookups
*/
public class LookupTable
{ 
   . . .

   /**
      Constructs a LookupTable object.
   */
   public LookupTable()
   { 
      . . .
   }
   
   /**
      Reads key/value pairs.
      @param in the scanner for reading the input
   */
   public void read(Scanner in) 
   { 
      . . .
   }
   
   /**
      Looks up an item in the table.
      @param k the key to find
      @return the value with the given key, or null if no
      such item was found.
   */
   public String lookup(String k)
   { 
      . . .
   }

   /**
      Looks up an item in the table.
      @param v the value to find
      @return the key with the given value, or null if no
      such item was found.
   */
   public String reverseLookup(String v)
   { 
      . . .
   }
}
