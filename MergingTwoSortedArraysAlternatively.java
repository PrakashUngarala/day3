package logical_sections.day3;

import java.util.Scanner;

/*
 * Question 33: Merge Two Arrays Alternately
 Write a program to merge two arrays {1, 2, 3} and {4, 5, 6}
 alternately.
 Example: Resulting array should be {1, 4, 2, 5, 3, 6}
 */
public class MergingTwoSortedArraysAlternatively {

	public static int[] mergingTwoSortedArraysAlternatively(int [] arr1,int [] arr2) 
	{
		int [] anotherArr = new int[arr1.length+arr2.length];
		int i =0;
		int countArr1 = 0;
		int countArr2 = 0;
		while(i<anotherArr.length) {
			if(countArr1<arr1.length) {
				anotherArr[i++] = arr1[countArr1++];
			}
			if(countArr2<arr2.length) {
				anotherArr[i++] = arr2[countArr2++];
				
			}
			
		}
		return anotherArr;
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
		
		int [] res = mergingTwoSortedArraysAlternatively(arr1, arr2);
		
		for(int i=0;i<res.length;i++) {
			
			System.out.print(res[i]+" ");
		}
		
		
	}

}
