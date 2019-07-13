package com.skilldistiller.makechange;

import java.util.Scanner;

public class MakeChange {

		public static void main(String[] args) {
					Scanner kb = new Scanner(System.in);
					
					String item; 
			
			System.out.println("§~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Welcome to Lewy's Snack Shop~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~§");
			System.out.println(" \n  Snickers $1.25 ~ Skittles ~ $1.50 ~ Doritos 75¢ ~ Cheerwine $2.00 ~ Sprite $3.20 \n");
			System.out.println("    Tiujana Tacos 25¢  ~  Tequilla Sips 75¢  ~   Dos Equis $2.33  ~   Pet snacks $1.15  ");
			System.out.println("\n        Cucumbers $2.25   ~  Hummus $3.60  ~  Kiwi 60¢  ~  Pokémon Cards $4.24");
			System.out.println(" \n\n ~~~~~   and many more items      Please pay at the Automatic Register.  ");
			// Do while loop here
			System.out.println("\n\nAUTOMATIC REGISTER");
			System.out.println("\nWhat is the total cost of your purchase? \n (i.e. 12.73) \n$");
			item = kb.next(); 
			
			double amountPaid; 
			 
			
			switch (item) { 
			case "Snickers":
				System.out.println("That will be $1.25, please.");
				break;
			case "Skittles": 
				System.out.println("That will be $1.50, please.");
				break;
			case "Doritos": 
				System.out.println("That will be .75¢, please.");
				break;
			case "Cheerwine":
				System.out.println("That will be $2.00, please.");
				break;
			case "Sprite": 
				System.out.println("That will be $3.20, please.");
				break;
			default: 
				System.out.println("Sorry that's not an item we sell.\n Please enter a purchasable item:");
				//return to loop - or quit 
			}
				
			//		doTransaction(kb);
			
		
			
			
	//	}
	//	public static void doTransaction(Scanner input) {
			System.out.println("Please enter your payment amount: (i.e. $5.68) ");
	//		input.nextDouble();
			amountPaid = kb.nextDouble();
			int convertedChange = (int) (amountPaid * 100); 
			System.out.println("You paid: " + convertedChange + "\nThank you");
			
			
			int change = convertedChange / 2000; 
			int remains = convertedChange%2000; 
			int twenties = change; //number of twenties
			change = remains; // what's left
			
			int tens = change / 1000; // number of tens
			remains = change%1000; // what's left
			change = remains; 
			
			int fives = change / 500; // number of fives
			remains = change%500; // what's left
			change = remains; 
			
			int ones = change / 100; // number of ones
			remains = change%100; // what's left
			change = remains; 
			
			int quarters = change / 25; // number of quarters
			remains = change%25; // what's left
			change = remains; 
			
			int dimes = change / 10; // number of dimes
			remains = change%10; // what's left
			change = remains; 
			
			int nickels = change / 5; // number of nickels
			remains = change%5; // what's left
			change = remains;   
			
			int pennies = change; // finally the pennies 
			
			//boolean insert here to account for only printing the necessary amounts back
			
			System.out.println("Your change is\n " + twenties + " twenties \n" + tens + " tens\n " + fives + " fives\n "+ ones + " ones \n "
					+ quarters + " quarters \n"+ dimes + " dimes \n"+ nickels + " nickels\n "+ pennies + " pennies \n");
			
			
			kb.close(); 
			
		}
}




