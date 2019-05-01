package com.posidex.predicate;
interface Inter{
	public void m1(int n);
}
public class MethodReferanceEx2 {
	public void m2(int n) {
		System.out.println("method referance "+n);
	}
	public static void main (String []args) {
		Inter i = I->System.out.print("from method referance " );
		i.m1(10);
		MethodReferanceEx2 m = new MethodReferanceEx2();
		m.m2(23);
	}
}
