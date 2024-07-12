package packageCuz;

import java.util.InputMismatchException;
/*
 *  Working on requesting info for the input to the bag. 
 *  
 *  Ability to create a whole new bag
 *  
 *  
 */
import java.util.Scanner;

public class BagMain {

	public static void Bags() {

		Scanner scnr = new Scanner(System.in); 
		Bag<Object> bag1 = new Bag<>();
		Bag<Object> bag2 = new Bag<>();	
		
			System.out.println("This program is Bag Manipulation. We have 2 bags that you can"
					+ " work with. We are going to request 10 values. Integer, Float, Double, Char or String."
					+ " Afterwards, we will modify that Bag with requests for the user to do different functions.");
			int i = 0;
			while(i < 10) {
				for(i = 0; i < 9; i++) {
				System.out.println("Enter in a value: ");
				String value = scnr.nextLine();
				bag1.add(value);
			}
			
				
				
			for(Object list : bag1) {
				System.out.print(list + " ");
				
			}
				
			
			while(true) {
				System.out.println("\nWould you like to Add, Remove, Query, Clear or Print out a Bag?");
				String answer = scnr.next();
				char ch = answer.charAt(0);
				if(ch == 'n' || ch == 'N') {
				return;	
				}else if(ch == 'y' || ch == 'Y') {
					
					System.out.println("Choose 1. Add, 2. Remove, 3. Query, 4. Clear, 5. Count, 6. Merge, 7. Size.");
					
					
					int selection = 0;
					while(selection == 0) 
						try {
							selection = scnr.nextInt();
						}catch (InputMismatchException e) {
							System.out.println("Invalid entry. Please try again. 1-3: ");
							scnr.next();
						}
						switch(selection) {
							case 1:
								System.out.println("Enter Bag number to add, 1 or 2?");
								int chosenAdd = scnr.nextInt();
								System.out.println("Add value. Enter value: ");
								String inputValueAdd = scnr.next();
								if(chosenAdd == 1) {
									System.out.println("Adding to bag 1: " + inputValueAdd);
									bag1.add(inputValueAdd);
								}else {
									System.out.println("Adding to bag 2: " + inputValueAdd);
									bag2.add(inputValueAdd);
								}
								System.out.println(bag1);
								System.out.println(bag2);
								continue;
							case 2:
								System.out.println("Enter Bag number to remove, 1 or 2?");
								int chosenRemove = scnr.nextInt();
								System.out.println("Add value. Enter value: ");
								String inputValueRemove = scnr.next();
								System.out.println("Removing value.");
								if(chosenRemove == 1) {
									System.out.println("Removing from bag 1: " + inputValueRemove);
									bag1.remove(inputValueRemove);
								}else {
									System.out.println("Removing from bag 2: " + inputValueRemove);
									bag2.remove(inputValueRemove);
								}
								System.out.println(bag1);
								System.out.println(bag2);
								continue;
							case 3:
								System.out.println("Enter Bag number to query, 1 or 2?");
								int chosenQuery = scnr.nextInt();
								System.out.println("Query value. Enter value: ");
								String inputValueQuery = scnr.next();
								if(chosenQuery == 1) {
									System.out.println("Does Bag 1 contain: " + inputValueQuery + "?: " + bag1.contains(inputValueQuery));
								}else {
									System.out.println("Does Bag 2 contain: " + inputValueQuery + "?: " + bag2.contains(inputValueQuery));
								}
								System.out.println(bag1);
								System.out.println(bag2);
								continue;
							case 4:
								System.out.println("Enter Bag number to remove, 1 or 2?");
								int chosenClear = scnr.nextInt();
								System.out.println("Removing value.");
								if(chosenClear == 1) {
									System.out.println("Clearing bag 1.");
									bag1.clear();
								}else {
									System.out.println("Clearing bag 2.");
									bag2.clear();
								}
								continue;
							default:
								return;
					}
				}
				else {
					System.out.println("Invalid Entry. Enter in Y(Yes) or N(No).");
				}
			}
		}
	}
	public static void addBag() {
		Scanner scnr = new Scanner(System.in);
		
	}
}
