A valid credit card number will yield a result divisible by 10 when you:
1.  Form the sum of all digits. 
2.  Add to that sum every second digit, starting with the second digit from the right and going backwards
3.  Then add the COUNT of digits in the second step that are greater than four. 

The result should be divisible by 10.

For example, consider the number 4012 8888 8888 1881. 
1.  The sum of all digits is 89. 
2.  The sum of every second digit going backwards is 46, so the total so far is 89+46 = 135
3.  Of the digits from  step 2, 5 are larger than four, so the result is 140. 
4.  140 is divisible by 10 so the card number is valid.
