package packageCuz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dealership {

	public static void dealership() {
		
		AutoInventory autoInventory = new AutoInventory();
		Scanner scnr = new Scanner(System.in);
		
		/* A while loop that will keep running until specifically
		 * told to stop
		 */
		while(true) {
			// Start Menu, to instruct user how to input
			System.out.println("\nAutomobile Inventory");
			System.out.println("1. Add an automobile");
			System.out.println("2. Modify an automobile");
			System.out.println("3. Delete an automobile");
			System.out.println("4. View all automobiles");
			System.out.println("0. Exit Inventory");
			
			// prompts to get a user input. 
			System.out.print("Choose option 0-4.");
			// initializing choice. 
			int choice = -1;
			// since an "int" is being requested, a try/catch is implemented for anything outside
			// that input. 
			while (choice < 0)
				try {
				// requests input
				choice = scnr.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Invalid entry. Please try again. 0-4: ");
					// if it errors out, this consumes the last input and requests again
					scnr.next();
			}
			// Start of the switch for the menu above
			switch (choice) {
			// 0 being the weird number to choose, it exits the program. 
			case 0:
				while(true) {
					System.out.print("Do you want to print out the list to a file? Y(Yes) or N(No)");
					String answer = scnr.next();
					char ch = answer.charAt(0);					
					if (ch == 'n' || ch == 'N') {
						System.out.println("File will not be printed.");
						break;
					}else if (ch == 'y' || ch == 'Y') {
						autoInventory.printList();
						break;							
					}else {
						System.out.println("Please enter either \"Y\" or \"N\". Thank you.\n");
						continue;
					}
					
				}
				System.out.println("\n\t\t---> Exiting application. <---");
				scnr.close();
				// specifically exits the while loop to exit the program
				return;
			case 1:
				// add automobile, gets input from user, puts them into the "automobile" and adds
				// them to the Automobile object
				System.out.println("Follow prompts to enter Make, Model, Color, Year, and Mileage");
				System.out.print("Make: ");
				String make = scnr.next();
				System.out.print("Model: ");
				String model = scnr.next();
				System.out.print("Color: ");
				String color = scnr.next();
				
				// loop to make sure that if it errors out, it will still get the year instead
				// of skipping over and causing an error in the creation of the automobile
				int year = -1;
				while(year <= 0) {
					// try/catch because of requesting an int
					try {
						System.out.print("Year: ");
						year = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid year. Please enter again.");
						scnr.next();
					}
				}
				int mileage = -1;
				while (mileage <= 0) {
					try {
						System.out.print("Mileage: ");
						mileage = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid mileage. Please enter again.");
						scnr.next();
					}
				}
				// adds the variables to the Automobile list under the current available index using
				// the addAutomobile method
				autoInventory.addAutomobile(make, model, color, year, mileage);
				System.out.println("Automobile added.\n");
				// stops case flow
				break;
			case 2:
				// Modify an entry
				System.out.print("Enter the number of the automobile to modify: ");
				// initializes variable
				int modifyIndex = -1;
				// int again so try/catch
				while (modifyIndex < 0) {
					try {
					modifyIndex = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid number. Please try again.");
						scnr.next();
						continue;
					}
					// if the input is less than 0 or greater than the list size, it is outside
					// of the parameters to select an index in the "Automobiles" list
					if(modifyIndex <= 0 || modifyIndex > autoInventory.getAutomobiles().size()) {
						System.out.println("Invalid number. Please try again.");
						modifyIndex = -1;
					}
				}
				// after it knows what index to modify, it really is just a repeat
				// of "addAutomobile" 
				System.out.println("Enter a new automobile Make, Model, Color, Year, and Mileage.");
				System.out.print("Make: ");
				String newMake = scnr.next();
				System.out.print("Model: ");
				String newModel = scnr.next();
				System.out.print("Color: ");
				String newColor = scnr.next();
			
				int newYear = -1;
				while (newYear < 0) {
					try {
						System.out.print("Year: ");
						newYear = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid year. Please enter again.");
						scnr.next();
					}
				}
				int newMileage = -1;
				while (newMileage < 0) {
					try {
						System.out.print("Mileage: ");
						newMileage = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid year. Please enter again.");
						scnr.next();
					}
				}
				// runs the edit automobile method to change the variables to the index chosen
				// by the user. 
				autoInventory.editAutomobile(modifyIndex - 1, newMake, newModel, newColor, newYear, newMileage);
				System.out.println("Automobile modified successfuly.\n");
				break;			
			case 3:
				// delete, takes the index selected by the user and deletes that chosen object. 
				System.out.println("Enter the number of the automobile to delete: ");
				int deleteIndex = -1;
				while (deleteIndex < 0) {
					try {
					deleteIndex = scnr.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid number. Please try again.");
						scnr.next();
						continue;
					}
					
					if (deleteIndex <= 0 || deleteIndex > autoInventory.getAutomobiles().size()) {
						System.out.println("Invalid number. Please try again.");
						deleteIndex = -1;
					}
				}
				autoInventory.deleteAutomobile(deleteIndex - 1);
				System.out.println("Automobile deleted successfully.\n");
				break;
			case 4:
				// View all automobiles by running the viewAutomobiles method. 
				autoInventory.viewAutomobiles();
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
	
}
