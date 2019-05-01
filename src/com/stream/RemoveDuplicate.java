package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main (String []args) {
		  ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		  System.out.println(numbersList);
		  List<Integer> list = numbersList.stream().distinct().collect(Collectors.toList());
		  System.out.println(list);
		  System.out.println("Max Value : "+numbersList.stream().max((o1,o2)->o1.compareTo(o2)).get());
		  System.out.println("Min Value : "+numbersList.stream().min((o1,o2)->o1.compareTo(o2)).get());

 	}
}
