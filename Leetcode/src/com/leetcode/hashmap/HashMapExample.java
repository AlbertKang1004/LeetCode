package com.leetcode.hashmap;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, Integer> hashmap = new HashMap<>();
		hashmap.putIfAbsent(0, 0); 
		// putIfAbsent checks if there is a corresponding value for the key, and adds the pair if there is none.
		hashmap.putIfAbsent(2, 3);
		// map value 3 on key 2

		hashmap.put(1, 1);
		// map value 1 on key 1
		hashmap.put(1, 2);
		// overwrite value 1 (not putIfAbsent - Overwrite possible)

		System.out.println("The value of key 1 is: " + hashmap.get(1));
		// get() receives the value of a key.
		hashmap.remove(2);
		// remove() removes the key by indexing a value
		
		if (!hashmap.containsKey(2)) {
			System.out.println("Key 2 is not in the hash map.");
		}
		// contain() checks whether a key exist on the hashmap or not
		
		System.out.println("The size of hash map is: " + hashmap.size());
		for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
			System.out.println("( " + entry.getKey() + " , " + entry.getValue() + " )");
		}
		// for (Map.Entry<Integer, Integer> entry: hashmap.entrySet())
		//
		
		System.out.println("are in the hashmap.");
		hashmap.clear();
		// clear() removes all the values and keys
		
		if(hashmap.isEmpty()) {
			System.out.println("Hashmap is empty.");
		}
		// isEmpty() checks if the map is empty
	}

}
