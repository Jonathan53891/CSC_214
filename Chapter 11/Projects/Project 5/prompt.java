/*


Write a program that reads in a set of coin descriptions from a file. 

The input file has the format 
   coinName1 coinValue1 
   coinName2 coinValue2 
    . . . 
	
Add a method 
    void read(Scanner in) throws FileNotFoundException 

to the Coin class of Section 8.2. 

Throw an exception if the current line is not properly formatted. 

Then implement a method 

static ArrayList readFile(String filename) throws FileNotFoundException 

In the main method, call readFile. 

If an exception is thrown, give the user a chance to select another file. If you read all coins successfully, print the total value.

*/
