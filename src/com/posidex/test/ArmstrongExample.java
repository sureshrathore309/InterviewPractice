package com.posidex.test;

public class ArmstrongExample {
	public static void main (String []args){
		int n=1513,c=0,a,temp;
		temp=n;
		while (n>0) {
			a=n%10;
			n/=10;
			c=c+a*a*a;
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");
		
	}
}
