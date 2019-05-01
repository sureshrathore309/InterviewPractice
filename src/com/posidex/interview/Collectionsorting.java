package com.posidex.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collectionsorting {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sursh");
		list.add("Rathore");
		list.add("Mahesh");
		list.add("Anil");
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		list.forEach(p -> System.out.println(p));
	}
}
