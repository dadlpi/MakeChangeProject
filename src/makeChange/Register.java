package makeChange;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		int twentys = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickles = 0;
		int pennies = 0;
		// The user is prompted asking for the price of the item.

		System.out.println("how much did the price cost?");
		Scanner keyboardInput = new Scanner(System.in);
		double itemCost = keyboardInput.nextDouble();

		// The user is then prompted asking how much money was tendered by the customer.
		System.out.println("how much money are you paying with?");
		double amountPayingWith = keyboardInput.nextDouble();

		// Display an appropriate message if the customer provided too little money or
		// the exact amount.
		if (amountPayingWith < itemCost) {
			System.err.println("you are not providing sufficent cash to complete the transation, please provide correct denominations for correct change");
		}

		else if (amountPayingWith == itemCost) {
			System.out.println("thank you for your business");
		}

		else {

			/*
			 * ################################## CORE LOGIC  ####################################
			 */

			double change = -(itemCost - amountPayingWith);
			change += .0005;
//			System.out.println((int) (change / 20.00));
//			System.out.println(change);

			/* NOTES WITH JOHN -- our change is = 17.38
			 one variable with 17 to hold dollars
			 to get the change only portion, you can substract the int cents dropped
			 portion (your dollars only) and substract it by the whole dollar amt
			 change - dollar
			 sec variable to holding the change only protion with the .38 * 100 = 38
			 */

//			int dollarAmt = (int) (change); 
//			double centsAmt = (change - dollarAmt);

			System.out.print("change due, in dollars returned: " + change + "\n");

			if ((change / 20.00) >= 1) {
				twentys = (int) (change / 20);
				System.out.println("provide the customer with " + twentys + " twenty(s)");
				change -= (twentys * 20);
//				System.out.println("remaining dollar amount remaining " + change); // this is your test line
			}
//				
//			

			if ((int) (change / 10) > 0) {
				tens = (int) (change / 10);
				System.out.println("provide the customer with " + tens + " ten(s)");
				change -= (tens * 10);
//				System.out.println("remaining dollar amount remaining " + change); // this is your test line
			}

			if ((int) (change / 5) > 0) {
				fives = (int) (change / 5);
				System.out.println("provide the customer with " + fives + " five(s)");
				change -= (fives * 5);
//				System.out.println("remaining dollar amount remaining " + change); // this is your test line
			}
//				
			if ((int) (change / 1) > 0) {
				ones = (int) (change / 1);
				System.out.println("provide the customer with " + ones + " one(s)");
				change -= (ones * 1);
//				System.out.println("remaining cent amount remaining " + change); // this is your test line
			}
//			

			if ((int) (change / .25) > 0) {
				quarters = (int) (change / .25);
				System.out.println("provide the customer with " + quarters + " quarter(s)");
				change -= (quarters * .25);
//				System.out.println("remaining cent amount remaining " + change); // this is your test line
			}

			if ((int) (change / .10) > 0) {
				dimes = (int) (change / .10);
				System.out.println("provide the customer with " + dimes + " dime(s)");
				change -= (dimes * .1);
//				System.out.println("remaining cent amount remaining " + change); // this is your test line
			}

			if ((int) (change / .05) > 0) {
				nickles = (int) (change / .05);
				System.out.println("provide the customer with " + nickles + " nickle(s)");
				change -= (nickles * .05);
//				System.out.println("remaining cent amount remaining " + change); // this is your test line
			}

			if ((int) (change / .01) > 0) {
				pennies = (int) (change / .01);
				System.out.println("provide the customer with " + pennies + " pennies(s)");
				change -= (pennies * .01);
//				System.out.println("remaining cent amount remaining " + change); // this is your test line
			}

		

		}

		keyboardInput.close();

	}

}
