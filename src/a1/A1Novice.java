package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int cust = scan.nextInt();
		String [] names = new String [cust];
		for (int i=0; i<names.length; i++) {
			String firstname = scan.next();
			String lastname = scan.next();
			char letter1 = firstname.charAt(0);
			int items = scan.nextInt();
			String [] things = new String [items];
			Double totalprice = 0.00;
			for (int j=0; j<things.length; j++) {
				int quantity = scan.nextInt();
				scan.next();
				Double price = scan.nextDouble();
				totalprice += price * quantity;
			}
		String value = String.format("%.2f", totalprice);
		System.out.println(letter1 + "." + " " + lastname + ":" + " " + value);
		}
		
	}
}
