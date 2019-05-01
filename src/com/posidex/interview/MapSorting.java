package com.posidex.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapSorting {
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> map) {
		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		list.forEach(a -> temp.put(a.getKey(), a.getValue()));
		return temp;
	}

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// enter data into hashmap
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);
		Map<String, Integer> hm1 = sortByValue(hm);

		// print the sorted hashmap
		for (Map.Entry<String, Integer> en : hm1.entrySet()) {
			System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
		}
	}
}
