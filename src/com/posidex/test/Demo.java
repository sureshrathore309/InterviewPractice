package com.posidex.test;

import java.util.ArrayList;
import java.util.List;

interface F{
	static void m1() {
		System.out.println("Hello");
	}
}
public abstract class Demo implements F{
	public static void main (String []args) {
		F.m1();
		ArrayList list = new ArrayList();
	}
	public static void m2() {
		
	}
}