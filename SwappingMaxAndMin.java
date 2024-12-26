package logical_sections.day3;

import java.util.Scanner;
/*
 * Question 31: Swap Maximum and Minimum Elements
 Write a program to swap the maximum and minimum elements in an array 
 {3, 1, 4, 5, 2}.
 Example: Resulting array should be {3, 5, 4, 1, 2}.
 */
public class SwappingMaxAndMin {

	
	public static void swappingMaxAndMin(int [] arr) {
		
		
		int smallIndex =0;
		int bigIndex = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[smallIndex]>arr[i]) {
				
				smallIndex = i;
			}
			if(arr[bigIndex]<arr[i]) {

				bigIndex = i;
			}
		}
		
		int temp = arr[bigIndex];
		
		arr[bigIndex] = arr[smallIndex];
		arr[smallIndex] = temp;
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
		
		swappingMaxAndMin(arr);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
