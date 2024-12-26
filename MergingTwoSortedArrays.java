package logical_sections.day3;

import java.util.Scanner;

/*
 * Question 32: Merge Two Sorted Arrays.

 Write a program to merge two sorted arrays {1, 3, 5} 
 and {2, 4, 6} into a single sorted array.
 Example: Resulting array should be {1, 2, 3, 4, 5, 6}.

 */
public class MergingTwoSortedArrays {

	public static int[] mergingTwoSortedArrays(int [] arr1,int [] arr2) {
		
		int [] sortedArr = new int[arr1.length+arr2.length];
		int sortedArrayCount =0;
		for(int i =0;i<arr1.length;i++) {
			sortedArr[sortedArrayCount++]=  arr1[i]; 
		}
		for(int i =0;i<arr2.length;i++) {
			sortedArr[sortedArrayCount++]=  arr2[i]; 
		}
		
		for(int i = 0;i< sortedArr.length;i++) {
			for(int j = i+1;j<sortedArr.length-1;j++) {
				if(sortedArr[i]>sortedArr[j]) {
					int temp = sortedArr[i];
					sortedArr[i] = sortedArr[j];
					sortedArr[j] = temp;
				}
			}
		}
		return sortedArr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array1 :");
		int size1 = sc.nextInt();
		int [] arr1 = new int[size1];
		System.out.println("Enter the "+size1+" elements in array 1 :");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of the array2 :");
		int size2 = sc.nextInt();
		int [] arr2 = new int[size2];
		System.out.println("Enter the "+size2+" elements in array 2 :");
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Output is :");
		
		int [] res = mergingTwoSortedArrays(arr1, arr2);
		
		for(int i=0;i<res.length;i++) {
			
			System.out.print(res[i]+" ");
		}
		
		
	}
}
