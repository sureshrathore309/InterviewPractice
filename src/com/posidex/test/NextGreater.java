package com.posidex.test;

import java.util.Arrays;

public class NextGreater {
	static void swap(char arr[], int i, int j) {
		char temp = arr[i];
		arr[i]=arr[j];
		arr[j] = temp;
	}
	public static void findNext(char arr[], int n) {
		int i;
		for (i=n-1;i>0;i--) {
			if (arr[i] > arr[i-1]) {
				break;
			}
		}
		if (i==0) {
			System.out.println("Not possible ");
		}
		else {
			int x = arr[i-1], min=i;
			for (int j = i+1;j<n;j++) {
				if (arr[j]>x && arr[j] < arr[min])
					min = j;
			}
			swap(arr, i-1, min);
			Arrays.sort(arr, i, n);
			System.out.println("Next number with same set of disgit is");
			for (i=0; i<n;i++){
				System.out.print(arr[i]);
			}
		}
	}
	public static void main(String[] args)  
    { 
        char digits[] = { '5','3','4','9','7','6' }; 
        int n = digits.length; 
        findNext(digits, n); 
    } 
}
