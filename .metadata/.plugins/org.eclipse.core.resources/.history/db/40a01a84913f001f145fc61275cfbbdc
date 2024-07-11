package packageCuz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Bag<T> implements Iterable<T> {
	
	/*
	 * Bag class that implements the Iterable method to get through the array. 
	 * add method was the most simple and has been used a lot in previous assignments
	 * 
	 * Working with the Iterator method was at first hard to get what was going on
	 * except that it was moving through the array. I did come to understand each part
	 * I used it to work with all of the methods that I have to modify the Bag. It also
	 * made the code really nice and clean. 
	 */
    private ArrayList<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
    	Iterator<T> one = items.iterator();
    	while(one.hasNext()) {
    		if(one.next().equals(item)) {
    			one.remove();
    			return;
    		}
    	}
    }

    public boolean contains(T item) {
    	Iterator<T> contain = items.iterator();
    	while(contain.hasNext()) {
    		if(contain.next().equals(item)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public int count(T item) {
    	int count = 0;
    	Iterator<T> counter = items.iterator();
    	while(counter.hasNext()) {
    		if(counter.next().equals(item)) {
    			count++;
    		}
    	}
    	return count;
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
    
    //Getters and setters for the items array. 
    public List<T> getItems() {
    	return new ArrayList<>(items);
    }
    
    public void setItems(List<T> items) {
    	this.items = new ArrayList<>(items);
    }
}
