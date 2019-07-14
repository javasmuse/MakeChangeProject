package com.skilldistiller.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		System.out.println("§~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Welcome to Lewy's Snack Shop~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~§");
		System.out.println(" \n  Snickers $1.25 ~ Skittles ~ $1.50 ~ Doritos 75¢ ~ Cheerwine $2.00 ~ Sprite $3.20 \n");
		System.out.println("    Tiujana Tacos 25¢  ~  Tequilla Sips 75¢  ~   Dos Equis $2.33  ~   Pet snacks $1.15  ");
		System.out.println("\n        Cucumbers $2.25   ~  Hummus $3.60  ~  Kiwi 60¢  ~  Pokémon Cards $4.24");
		System.out.println(" \n\n ~~~~~   and many more items      Please pay at the Automatic Register.  ");
		System.out.println("\n\n***Please note, \nAutomatic Register does not accept purchases over $20.00. ");

		autoRegister();  
	}
		
// The autoRegister method accepts the Total Amount and Total Paid, decides if it is okay and if change is needed
// if change is needed the doTransaction method is called, if not possible loops back through by recalling itself

		public static void autoRegister() {
		Scanner kb = new Scanner(System.in);

		System.out.println("\n\nAUTOMATIC REGISTER");
		System.out.println("\nWhat is the total cost of your purchase? \n (i.e. 12.73) \n$");
		double totalCost = kb.nextDouble();
		if (totalCost > 20.00) {
			System.out.println("Sorry I can't accept such a large purchase, buy something cheaper. ");
			autoRegister();
		} else
			System.out.println("\nHow much is your payment? \n(i.e. 15.00)");
		double amountPaid = kb.nextDouble();
		kb.close();
		if (amountPaid > totalCost) {
			double input = amountPaid - totalCost;
			System.out.print("\nYour purchase is: ");
			System.out.printf("%4.2f", totalCost);
			System.out.print("\nAmount tendered is: ");
			System.out.printf("%4.2f", amountPaid);
			doTransaction(input);
		} else if (amountPaid == totalCost) {
			System.out.println("\nThank you. No change needed. Have a Nice Day! ");
		} else {
			System.out.println("\nInsufficient funds. \n Please add more money and try again ");
			autoRegister();
		}
	}

	public static void doTransaction(double input) {
		int convertedChange = (int) (input * 100);

		int ten = convertedChange / 1000; // number of tens
		int remains = ten % 1000; // what's left
		int change = remains;

		int five = change / 500; // number of fives
		remains = change % 500; // what's left
		change = remains;

		int ones = change / 100; // number of ones
		remains = change % 100; // what's left
		change = remains;

		int quarters = change / 25; // number of quarters
		remains = change % 25; // what's left
		change = remains;

		int dimes = change / 10; // number of dimes
		remains = change % 10; // what's left
		change = remains;

		int nickels = change / 5; // number of nickels
		remains = change % 5; // what's left
		change = remains;

		int pennies = change; // finally the pennies

		System.out.println("\n\nYour change is:\n ");
		
		if (ten != 0) {
			System.out.println("Ten: " + ten);
		}
		if (five != 0) {
			System.out.println("Five: " + five);
		}
		if (ones >= 2) {
			System.out.println("Ones: " + ones);
		}
		if (ones == 1) {
			System.out.println("One: " + ones);
		}
		if (quarters >= 2) {
			System.out.println("Quarters: " + quarters);
		}
		if (quarters == 1) {
			System.out.println("Quarter: " + quarters);
		}
		if (dimes >= 2) {
			System.out.println("Dimes: " + dimes);
		}
		if (dimes == 1) {
			System.out.println("Dime: " + dimes);
		}
		if (nickels >= 2) {
			System.out.println("Nickels: " + nickels);
		}
		if (nickels == 1) {
			System.out.println("Nickel: " + nickels);
		}
		if (pennies >= 2) {
			System.out.println("Pennies: " + pennies);
		}
		if (pennies == 1) {
			System.out.println("Penny: " + pennies);
		}
		System.out.println("\n Thank You & Have a Nice Day! ");

		{
		}
	}

}
