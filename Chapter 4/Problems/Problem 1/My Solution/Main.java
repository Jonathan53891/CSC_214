public class Main
{
  
  public static void main(String args[])
  {
    final double LENGTH = 11; //lengthh in inches
    final double WIDTH = 8.5; // length in inches
    final double MM_PER_INCH = 25.4; // millimeters per inch
  
    double paperLength,paperWidth;
  
    paperLength = LENGTH * MM_PER_INCH;
    paperWidth = WIDTH * MM_PER_INCH;

    System.out.println("The dimension in mm are: " + paperLength + " x " + paperWidth);
  }
}
