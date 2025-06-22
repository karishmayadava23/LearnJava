package CollectionNotes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		// Declaration
//		Map myMap = new HashMap();
//		HashMap myMap1 = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding Pairs
		hm.put(101, "Karishma");
		hm.put(102, "Karishma");
		hm.put(102, "James");
		hm.put(103, "James");
//		hm.put(null, null);
//		hm.put(null, "Stera");
		hm.put(105, null);
		System.out.println(hm);
		System.out.println("size of hashmap: " + hm.size());

		// we can remove key to remove value
		System.out.println(hm.remove(101));
		System.out.println(hm);// printing as list

		// Access value of particular key
		System.out.println(hm.get(103));

		// to get all keys
		System.out.println(hm.keySet());

		// to get all values
		System.out.println(hm.values());

		// to get key and value
		System.out.println(hm.entrySet());// printing as set

		// to replace value
		System.out.println(hm.put(103, "Karishma"));
		System.out.println(hm);

		// hashing means saving data randomly no insert order is preserved so we cannot
		// use normal for loop
		// we use for each loop to retrevie data one by one
		for (int k : hm.keySet()) {
			System.out.println(k + " " + hm.get(k));
		}

		System.out.println("Using Iterator");
		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> ent = itr.next();
			System.out.println(ent.getKey() + " " + ent.getValue());
//			System.out.println("++++++++++++++++++");
//			System.out.println(itr.next());
		}
		hm.clear();
		System.out.println(hm.isEmpty());

	}

}
