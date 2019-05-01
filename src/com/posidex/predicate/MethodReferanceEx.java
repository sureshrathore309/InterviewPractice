package com.posidex.predicate;

public class MethodReferanceEx {
	public static void  m1() {
		for (int i=0;i<=10;i++)
			System.out.println("Child thread");
	}
	public static void main (String []args) {
		Runnable r = MethodReferanceEx::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("Main Thread");
	}
}