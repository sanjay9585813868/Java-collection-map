package map;

import java.util.HashMap;
import java.util.Map;

// HashMap contains values based on the key.
//HashMap contains only unique keys
//HashMap may have one null key and multiple null values.
// HashMap is non synchronized.
// HashMap maintains no order.
//Java HashMap class is 16 with a load factor of 0.75.
public class HASHMAP {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();

		System.out.println("After creating map"+map);
		//to add data we use put(k,v) function
		map.put(1, "sanjay");
		map.put(2, "fel");
		map.put(3, "jack");
		map.put(4, "Ben");
		map.put(5, "Rahul");
		
		System.out.println("After adding data on map "+map);		
	    //key-based removal  
	    map.remove(1);  
	    System.out.println("To remove a element from list with key: "+map);  
	    //key-value pair based removal  
	    map.remove(5, "Rahul");  
	    System.out.println("To remove a element from list with key and value"+map); 
	    //to replace
	    map.replace(4, "Gaurav");
	    System.out.println("To replace a element from list with key and value"+map); 
	    
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer	key = entry.getKey();
			String val = entry.getValue();

			System.out.println("key :"+ key +" value :"+val);
			
		}
	}
}
