package com.posidex.predicate;

import java.util.function.Function;

public class FunctionEx {
	public static void main (String []args) {
		Function<String, Integer> fun = s->s.length();
		System.out.println(fun.apply("sure"));
		System.out.println(fun.apply("suresh"));

	}
}
