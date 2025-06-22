package CollectionNotes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {

		// Declaration
		HashSet set1 = new HashSet();
//	Set set2 = new HashSet();

		// Set<String> set3 = new HashSet<String>();
		// Adding data in hashset
		set1.add("James");
		set1.add("James");
		set1.add(false);
		set1.add(123);
		set1.add(null);
		set1.add(null);

		System.out.println(set1);

		// remove element ,we specify value
		System.out.println(set1.remove("James"));
		System.out.println(set1.remove(2));
		System.out.println(set1);

		// insertion is not possible
		// Accessing specific element -Not Possible
		// We have workaround such that convery hashset into arraylist

		ArrayList list1 = new ArrayList(set1); // converting set into arrayList
		System.out.println(list1);
		System.out.println(list1.get(2));

		// Read all elements using enhanced for..each loop

		for (Object x : set1) {
			System.out.println(x);

		}
// size of hashset
		System.out.println(set1.size());
		// using iterator
		Iterator<Object> itr = set1.iterator(); // Adding <Object>is optional
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Clearing all elements
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());

	}
}
