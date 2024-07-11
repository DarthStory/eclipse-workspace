package packageCuz;

import java.util.InputMismatchException;
/*
 *  Working on requesting info for the input to the bag. 
 */
import java.util.Scanner;

public class BagMain {

	public static void Bags() {

		Scanner scnr = new Scanner(System.in); 
			Bag<Object> stuff = new Bag<>();
			
			System.out.println("This program is Bag Manipulation. We have 2 bags that you can"
					+ " work with. We are going to request 10 values. Integer, Float, Double, Char or String."
					+ " Afterwards, we will modify that Bag with requests for the user to do different functions.");
			int i = 0;
			while(i < 10) {
				for(i = 0; i < 9; i++) {
				System.out.println("Enter in a value: ");
				String value = scnr.nextLine();
				stuff.add(value);
			}
			
				
				
			for(Object list : stuff) {
				System.out.print(list + " ");
				
			}
				
			
			while(true) {
				System.out.println("\nWould you like to Add, Remove or see if a value is in the bag?");
				String answer = scnr.next();
				char ch = answer.charAt(0);
				if(ch == 'n' || ch == 'N') {
				return;	
				}
				else if(ch == 'y' || ch == 'Y') {
					
					System.out.println("Choose 1. Add, 2. Remove, 3. Query value if value is in the bag.");
					Bag<Object> bag1 = new Bag<>();
					Bag<Object> bag2 = new Bag<>();
					
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
								System.out.println("Add value. Enter value: ");
								String inputValue = scnr.next();
								bag1.add(inputValue);
								continue;
							case 2:
								System.out.println("Removing value.");
								
								continue;
							case 3:
								System.out.println("Query for value.");
								
								continue;
							default:
								return;
					}
				}
				else {
					System.out.println("");
				}
			}
		}
	}
	public static void addBag() {
		Scanner scnr = new Scanner(System.in);
		
	}
}
