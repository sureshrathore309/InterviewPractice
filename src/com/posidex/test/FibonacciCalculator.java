package com.posidex.test;

import java.util.Scanner;

public class FibonacciCalculator {
	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;

		}
		return fibonacci;
	}

	public static void main(String[] args) {
		System.out.println("Enter number upto which fibonacci series to print : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Fibonacci series upto " + num + " numbers ");
		for (int i = 1; i <= num; i++) {
			System.out.println(fibonacci(i) + " ");
		}
	}
}
