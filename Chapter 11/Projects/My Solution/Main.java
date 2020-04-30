/*

Write a program that carries out the following tasks:

1. Open a file with the name hello.txt.
2. Store the message "Hello, World!" in the file.
3. Close the file.
4. Open the same file again.
5. Read the message into a string variable and print it.
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main
{
  public static void main(String[] args) 
  {
    String line="Hello World!";
    try
    {
      //Creating FileWriter object by passing output file name as input.
      FileWriter fw=new FileWriter("D:\\hello.txt");
      BufferedWriter bw=new BufferedWriter(fw,1024);
      //Writing the data to the txt file
      bw.write(line);
      //closing the buffered writer
      bw.close();
      //closing the file write
      fw.close();
      // FileReader reads text files in the default encoding.
      FileReader fileReader = new FileReader("D:\\hello.txt");
      //Always wrap FileReader in BufferedReader.
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      //Reading the data from the file.
      
      while((line = bufferedReader.readLine()) != null)
      {
        //Displaying the data on the console
        System.out.println(line);
      }
      //Closing the buffered reader
      bufferedReader.close();
      //closing the file reader
      fileReader.close();
    }
    
    catch(FileNotFoundException ex)
    {
      System.out.println("Could'nt able to open file ");
    }
    
    catch(IOException ex) 
    {
      System.out.println("Error reading file ");
    }
  }
}
