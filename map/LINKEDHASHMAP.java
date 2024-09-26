package map;

import java.util.*;

public class LINKEDHASHMAP {
	public static void main(String args[]) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		lhm.put(100, "Amit");
		lhm.put(101, "Vijay");
		lhm.put(102, "Rahul");

		for (Map.Entry m : lhm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// Fetching key
		System.out.println("Keys: " + lhm.keySet());
		// Fetching value
		System.out.println("Values: " + lhm.values());
		// Fetching key-value pair
		System.out.println("Key-Value pairs: " + lhm.entrySet());
		lhm.remove(102);
		for (Map.Entry m : lhm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}