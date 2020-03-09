/*

When you use an automated teller machine (ATM) with your bank card, you need 
to use a personal identification number (PIN) to access your account. If a 
user fails more than three times when entering the PIN, the machine will block 
the card. Assume that the user’s PIN is “1234” and write a program that asks 
the user for the PIN no more than three times, and does the following:

- If the user enters the right number, print a message saying, “Your PIN is 
correct”, and end the program.
- If the user enters a wrong number, print a message saying, “Your PIN is 
incorrect” and, if you have asked for the PIN less than three times, ask for 
it again.
- If the user enters a wrong number three times, print a message saying “Your 
bank card is blocked” and end the program.

Sample Runs:



 
Enter your PIN:  1111
Your PIN is incorrect
Enter your PIN:  222
Your PIN is incorrect
Enter your PIN:  3333
Your bank card is blocked
 
Enter your PIN:  2139213213213
Your PIN is incorrect
Enter your PIN:  1233
Your PIN is incorrect
Enter your PIN:  1234
Your PIN is correct
 
Enter your PIN:  1234
Your PIN is correct

*/
