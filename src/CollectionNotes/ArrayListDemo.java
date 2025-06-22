package CollectionNotes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// declaration
		ArrayList myList = new ArrayList(); // allow all heterogenous data
		// List myList1 = new ArrayList();
		/**
		 * Collection only store objects and not primitive data types to store primitive
		 * data type we use wrapper class as below
		 */
		// ArrayList<Integer> intList = new ArrayList<Integer>();
		// ArrayList<String> sList = new ArrayList<String>();
		/**
		 * Suppose we have Employee class and have created multiple objects then we can
		 * use ArrayList to hold different Employee Objects
		 */

		// Adding data into arraylist
		myList.add(100);
		myList.add("Karishma");
		myList.add('C');
		myList.add('C');
		myList.add(true);
		myList.add(null);
		myList.add(null);

		// size of arraylist
		System.out.println("Size of mylist: " + myList.size());
		// 7
		// printing arrayList
		System.out.println("Printing Data from arrayList: " + myList);
		// [100, Karishma, C, C, true, null, null]

		// Remove element from arraylist
		System.out.println(myList.remove(5));// 5 is index of the elem which we want to remove
		// count starts from 0
		System.out.println(myList);

		// To insert value somewhere middle in arraylist
		myList.add(2, "Java");
		System.out.println(myList);

		// modifying element(modify/replace/change)
		myList.set(2, "python");
		System.out.println(myList);

		// Access specific element from arrayList
		System.out.println(myList.get(5));

		// read data
		System.out.println("Using Normal Loop");
		// normal for loop
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		System.out.println("Using for each loop");
		for (Object value : myList) {
			System.out.println(value);
		}

		System.out.println("Using Iterator"); // Iterator will work only for collections
		Iterator itr = myList.iterator(); // return Iterator type of object
		System.out.println(itr.next());
		// use while loop whenever you are using iterator
		System.out.println("Using while loop");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		List<String> l1 = new ArrayList<String>();
		l1.add("Jambo");
		l1.add("Jg");
		Iterator it1 = l1.iterator();

		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
//to check arraylist is empty or contains value
		System.out.println(myList.isEmpty());

		// to remove all elements from the arrayList
		List myList2 = new ArrayList();
		myList2.add("python");
		System.out.println(myList.removeAll(myList2));
		System.out.println(myList);
		myList.clear();
		System.out.println(myList);
	}
}
