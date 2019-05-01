package com.java.interview;
/**
 * 
 * @author suresh-rathore
 *
 */
public class SecondHighestNumberInArray {
	public static void main (String []args) {
		int arr[] = {14,46,47,94,52,86,36,94,89};
		int largest =arr[0];
		int secondLargest=arr[0];
		System.out.println("The Given Array is : ");
		for (int i=0;i <arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if (arr[i]>secondLargest && arr[i] !=largest) {
				secondLargest=arr[i];
			}
		}
		System.out.println("\n Second Largest number is : "+secondLargest);
	}
}
