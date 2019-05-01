package com.posidex.predicate;

import java.util.function.Predicate;

public class PredicateEx {
	public static void main (String []args) {
		Predicate<Integer> p = I->I>10;
		System.out.println(p.test(2));
		Predicate<String> ps = s->s.length()>3;
		System.out.println(ps.test("Suresh"));
	}
}