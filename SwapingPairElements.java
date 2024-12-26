package logical_sections.day3;

import java.util.Scanner;

/*
 * Question 30: Swap Elements in Pairs
 Write a program to swap elements of the array {1, 2, 3, 4, 5} in pairs. 
 If the array has an odd length, leave the last element as is.
 Example: Resulting array should be {2, 1, 4, 3, 5}.
 */
public class SwapingPairElements {

	public static void swappingPair(int [] arr) {
		for(int i=0;i<arr.length;i+=2) {
			if((i+1)<arr.length) {
				int temp = arr[i];
				arr[i]= arr[i+1];
				arr[i+1] = temp;
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the "+size+" elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Output is :");
		
		swappingPair(arr);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
