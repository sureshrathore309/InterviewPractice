package com.posidex.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main (String []args) {
		List<Integer> myList = new ArrayList<>();
		for (int i=0; i<100;i++) myList.add(i);
		Stream<Integer> sequentialStream = myList.stream();
		Stream<Integer> paraallelStream = myList.parallelStream();
		Stream<Integer>	highNum = paraallelStream.filter(p->p>90);
		highNum.forEach(p->System.out.println("High Nums parallel : "+p));
		System.out.println("Sequential : ");
		Stream<Integer>	highNumPar = sequentialStream.filter(p->p>90);
		highNumPar.forEach(p->System.out.println("High Nums Sequential : "+p));

		
	}
}
