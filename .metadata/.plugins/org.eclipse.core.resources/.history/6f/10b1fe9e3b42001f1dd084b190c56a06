package packageCuz;

public class BagMethod {

		public static void workBag() {
			
			Bag<Object> bag1 = new Bag<>();
			Bag<Object> bag2 = new Bag<>();
			
			bag1.add("Tree");
			bag1.add(2);
			bag1.add("Label");
			bag1.add("bowl");
			bag1.add(23.32);
			

			bag2.add(2);
			bag2.add("Label");
			bag2.add("Lemon");
			bag2.add(74);
			
			System.out.println("Bag 1 size: " + bag1.size());
			System.out.println("Bag 2 size: " + bag2.size());
			
			
			bag1.merge(bag2);
			System.out.println("Both bags: " + bag1);
			
			Bag<Object> distinctBag = bag1.distinct();
			System.out.println("Distinct bag: " + distinctBag);
		}
}
