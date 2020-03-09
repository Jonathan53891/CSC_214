/*

The following algorithm yields the season (Spring, Summer, Fall, or Winter) 
for a given month and day.

📷
If month is 1, 2, or 3, season = “Winter” 
Else if month is 4, 5, or 6, season = “Spring”
Else if month is 7, 8, or 9, season = “Summer”
Else if month is 10, 11, or 12, season = “Fall”
If month is divisible by 3 and day >= 21
  If season is “Winter”, season = “Spring” 
  Else if season is “Spring”, season = “Summer” 
  Else if season is “Summer”, season = “Fall” 
  Else season = “Winter” 

Write a program that prompts the user for a month and day and then prints 
the season, as determined by this algorithm. Create a class Date with a 
method getSeason.

Sample Run
 
Please enter a date (month and day):  3 5
Season: Winter

*/
