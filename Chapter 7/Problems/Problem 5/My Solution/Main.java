import java.security.SecureRandom;
import java.util.Arrays;
public class Main //RandomSort
{
   public static void main(String[] args)
   {
       //Set a constant of size=10
       final int size=20;
       //Create an array of int of size 20
       int[] nums=new int[size];
       //Create instance of SecureRandom class
       SecureRandom random=new SecureRandom();      
       //Read 20 string from user
       for (int i = 0; i < nums.length; i++)           
           //Generates an random number in a range of 0 to 99
           nums[i]=random.nextInt(100) ;
              
       System.out.println("Array with random values");
       System.out.println("---------------");
       //print arr elements
       for (int i = 0; i < nums.length; i++)
           System.out.println(nums[i]);
      
       /*Call the static method sort of Arrays class with nums
          array,nums */
       Arrays.sort(nums);

       System.out.println("After sorting");
       System.out.println("---------------");
       //print the sorted array, nums       
       for (int i = 0; i < nums.length; i++)
           System.out.println(nums[i]);
      
   } //end of the main method
  
}//end of the class
