# MakeChangeProject

Application Functionality:
The functionality of this application is to be able to take in the following parameters:

a) total cost of a good or service in a dollar amount with decimals
b) take in the dollar amount provided by the customer in dollar amount with decimals (amount tendered)
c) when there is a difference in total cost and amount tendered the value will be computed and proper dollar and cents will be provided to 
the cashier in explicit dollar and cent denominations
d) if amount tendered is greater than cost, an appropriate error message will be displayed 


Lessons Learned in Register.java application: 
1) there was an issue on loss of precision on the hundreths place where one penny's value was getting pushed off into the thousandths place
the correction was to add .005 to the subject value and kicking up the hundreths thousandths value to ensure the one penny wasn't lost

2) there is a creative way of seperating the whole dollar amount and the decimal cent amount into two seperate variables if needed by
taking the double change amount and casting it into an int you would arrive at a whole number for the dollar mount and putting it into a whole number variable
then you could take the double change amount and substract out the whole number part and you'd be left with the decimal values untampered with.

 

