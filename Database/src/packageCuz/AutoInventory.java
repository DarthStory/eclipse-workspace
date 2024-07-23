package packageCuz;

//import statements to get utilities ArrayList and List
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AutoInventory {

	// creates a list of automobile called automobiles
	private List<Automobile> automobiles;
		
	//Constructor
	public AutoInventory() {
		// names the arrayList (automobiles)
		automobiles = new ArrayList<>();
	}
	
	// Add Automobile
	// method with variables that were input from the user
	public void addAutomobile(String make, String model, String color, int year, int mileage) {
		// class object new object (variables of that object)
		Automobile automobile = new Automobile(make, model, color, year, mileage);
		// adds object to list
		automobiles.add(automobile);
		System.out.println("\n" + automobile.getMake() 
				+ " " + automobile.getModel() 
				+ " " + automobile.getColor() 
				+ " " + automobile.getYear() 
				+ " " + automobile.getMileage() + "\n");
	}
	
	// Edit an Automobile
	public void editAutomobile(int index, String make, String model, String color, int year, int mileage) {
		// Class object array get index
		Automobile automobile = automobiles.get(index);
		// modification to make to each variable
		automobile.setMake(make);
		automobile.setModel(model);
		automobile.setColor(color);
		automobile.setYear(year);
		automobile.setMileage(mileage);
		System.out.println("\n" +automobile.getMake() 
				+ " " + automobile.getModel() 
				+ " " + automobile.getColor() 
				+ " " + automobile.getYear() 
				+ " " + automobile.getMileage() + "\n");
	}
	
	// get method with the list of automobile that returns the array (automobiles)
	public List<Automobile> getAutomobiles() {
		return automobiles;
	}
	
	// view all Automobiles
	public void viewAutomobiles() {
		// if nothing in the list automobiles
		if (automobiles.isEmpty()) {
			// state list is empty
			System.out.println("No automobiles found.");
			return;
		}
		// setups loop to progress through the list
		for(int i = 0; i < automobiles.size(); i++) {
			// prints out the index of the object, and the variables of that object (automobile)
			System.out.print("\nAutomobile #" + (i + 1) + " ");
			//prints out the whole list (automobiles)
			System.out.println(automobiles.get(i));
		}
	}
	
	// Delete an automobile
	// takes index and deletes the variables associated with that index
	public void deleteAutomobile(int index) {
		automobiles.remove(index);
	}
	
	public void printList() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Temp\\AutoInventory.txt"));
			for (@SuppressWarnings("unused") Automobile vehicle : automobiles) {
				writer.write("\n" + automobiles);
				break;
			}
			System.out.println("List has been saved to: C:\\Temp\\");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
