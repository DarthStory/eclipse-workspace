package packageCuz;

import java.util.List;
import java.util.Scanner;

public class BagMain {

	public static void Bags() {
		/*
		 * Main method that input data, then used methods in the Bag to 
		 * manipulate the data. 
		 */
		Scanner scnr = new Scanner(System.in);
		Bag<Object> stuff = new Bag<>();
		
		System.out.println("We are going to request 10 values. Integer, Float, Double, Char or String."
				+ " Afterwards, we will modify that Bag with requests for the user to do different functions.");
		for(int i = 0; i < 9; i++) {
			System.out.println("Enter in a value: ");
			String value = scnr.nextLine();
			stuff.add(value);
		}
		
		List<Object> currentItems = stuff.getItems();
		System.out.println("\nCurrent items in the bag: " + currentItems);
		
		
		int choice = -1;
		while (choice < 0) {
			System.out.println("Would you like to Add, Remove or see if a value is in the bag?");
			String yesNo = scnr.nextLine();
			
		}
		
		return;
	}
	public static void addBag() {
		Scanner scnr = new Scanner(System.in);
		
	}
}
