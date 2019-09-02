package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// The integer count of the number of items in the store
		int countofitems = scan.nextInt();
		String [] nameofitem = new String [countofitems];
		Double [] priceofitem = new Double [countofitems];
		// Arrays to track the name and price of each item matching the first item to the first price
		for (int i = 0; i < countofitems; i++) {
			nameofitem [i] = scan.next();
			priceofitem [i] = scan.nextDouble();
		}
		// Initializing a variable to track the amount of customers
		int numbercustomer = scan.nextInt();
		// Initializing a variable to track the biggest amount spent
		Double biggestspent = Double.MIN_VALUE;
		// Initializing a variable to track the biggest spender
		String biggestspender = new String ();
		// Initializing a variable to track the smallest amount spent
		Double smallestspent = Double.MAX_VALUE;
		// Initializing a variable to track the smallest spender
		String smallestspender = new String ();
		// Initializing a variable to track the total amount spent
		Double totalamountspent = 0.0;
		// Initializing a variable to track the amount per customer
		Double amountpercustomer = 0.0;
		// Initializing a variable to start the average
		Double average = 0.0;
		// A string array to match the full name with the items
		String [] fullname = new String [numbercustomer];
		for (int i = 0; i < numbercustomer; i++) {
			String firstname = scan.next();
			String lastname = scan.next();
			fullname[i] = firstname + " " + lastname;
			amountpercustomer = 0.0;
			int amountbought = scan.nextInt();
			for (int j = 0; j < amountbought; j++) {
				int quantitypercustomer = scan.nextInt();
				String itemnamepercustomer = scan.next();
				// A for loop to loop through items to match customers
				// with their items and the amount they spent
				for (int k = 0; k < nameofitem.length; k++) {
					if (nameofitem[k].equals(itemnamepercustomer)){
						totalamountspent += priceofitem[k] * quantitypercustomer;
						amountpercustomer += priceofitem[k] * quantitypercustomer;
					}
							
				}
			}
			// A conditional to see if this amount per customer spent the most
			if (amountpercustomer > biggestspent) {
				biggestspender = fullname[i];
				biggestspent = amountpercustomer;
			}
			
			// A conditional to see if this customer spent least
			if (amountpercustomer < smallestspent) {
				smallestspender = fullname[i];
				smallestspent = amountpercustomer;
			}
			average = totalamountspent / numbercustomer;
		
		}
		String biggestvalue = String.format("%.2f", biggestspent);
		String smallestvalue = String.format("%.2f", smallestspent);
		String averagevalue = String.format("%.2f", average);
		System.out.println("Biggest:" + " " + biggestspender + " " + "(" + biggestvalue + ")" );
		System.out.println("Smallest:" + " " + smallestspender + " " + "(" + smallestvalue + ")" );
		System.out.println("Average:" + " " + averagevalue);

	}
}
