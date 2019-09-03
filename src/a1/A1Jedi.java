package a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int countofitems = scan.nextInt();
		ArrayList<String> itemList = new ArrayList<String>();
		Double [] itemPrices = new Double [countofitems];
		
		// Arrays to track the name and price of each item matching the first item to the first price
		for (int i = 0; i < countofitems; i++) {
			itemList.add(scan.next());
			itemPrices[i] = scan.nextDouble();
		}
		
		int customerCount = scan.nextInt();
		String[] customerNames = new String[customerCount];
		int[] totalQuantityBought = new int[countofitems];
		int[] differentCustomersBought = new int[countofitems];
		
		
		for(int i = 0; i < customerCount; i++) {
			boolean[] foodAlreadyBought = new boolean[countofitems];
			customerNames[i] = scan.next() + " " + scan.next();
			int customerItemCount = scan.nextInt();
			for(int y = 0; y < customerItemCount; y++) {
				int specificItemCount = scan.nextInt();
				int indexPos = itemList.indexOf(scan.next());
				if (foodAlreadyBought[indexPos] == false) {
					foodAlreadyBought[indexPos] = true;
					differentCustomersBought[indexPos] += 1;
				}
				totalQuantityBought[indexPos] += specificItemCount;
			}
		}
		
		for(int i = 0; i < countofitems; i++) {
			if(differentCustomersBought[i] == 0) {
				System.out.println("No customers bought " + itemList.get(i));
			} else {
				System.out.println(differentCustomersBought[i] + " customers bought " + totalQuantityBought[i] + " " + itemList.get(i));
			}
		}
		
	}	
}
