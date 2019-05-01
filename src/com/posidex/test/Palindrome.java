package com.posidex.test;

public class Palindrome {
	public static void main (String []args) {
		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome(100));

		
	}
	public static boolean isPalindrome(int number) {
		int palindrome = number;
		int reverse=0;
		while (number != 0) {
			int rem = number%10;
			reverse = reverse*10+rem;
			number/=10;
		}
		if (palindrome == reverse)
			return true;
		else
			return false;
	}
}
