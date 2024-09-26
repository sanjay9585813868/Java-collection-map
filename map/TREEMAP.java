package map;

import java.util.*;

public class TREEMAP {
	public static void main(String args[]) {

		/*
		 * Java TreeMap contains values based on the key. 
		 * It implements the NavigableMap
		 * interface and extends AbstractMap class. 
		 * Java TreeMap contains only unique elements. 
		 * Java TreeMap cannot have a null key but can have multiple null values. 
		 * Java TreeMap is non synchronized. 
		 * Java TreeMap maintains ascending order.
		 */

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100, "Amit");
		tm.put(102, "Ravi");
		tm.put(101, "Vijay");
		tm.put(103, "Rahul");
		System.out.println("Before invoking remove() method");
		for (Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		tm.remove(102);
		System.out.println("After invoking remove() method");
		for (Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("-------------NavigableMap------------");
		
		//to navigate in tree map
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		// Maintains descending order
		System.out.println("descendingMap: " + map.descendingMap());
		// Returns key-value pairs whose keys are less than or equal to the specified
		// key.
		System.out.println("headMap: " + map.headMap(102, true));
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map.tailMap(102, true));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(100, false, 102, true));
	}
}