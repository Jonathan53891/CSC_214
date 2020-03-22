Implement the following algorithm to construct magic n × n squares; it works 
only if n is odd.

Set row = n - 1, column = n / 2. 
For k = 1 ... n * n
  Place k at [row][column].
  Increment row and column.
  If the row or column is n, replace it with 0.
  If the element at [row][column] has already been filled 
     Set row and column to their previous values.
     Decrement row.

Here is the 5 × 5 square that you get if you follow this method:

             11 18 25 02 09
             10 12 19 21 03
             04 06 13 20 22
             23 05 07 14 16
             17 24 01 08 15


Write a program whose input is the number n and whose output is the magic 
square of order n if n is odd.
