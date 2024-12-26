package logical_sections.day3;

import java.util.Scanner;
/*
 *  Q. Implement a Java program to find the index number of an element 
 in an int array from a given range by using binary searching and 
 display the results.
 
 int[] nums = {3,4,5,6,7,8,12,13};
 Enter the starting index : 3
 Enter the ending index : 6
 Enter the element: 7
 */
public class FindIndexUsingBinarySearchStartAndEnd {

	
	public static int  usingBinarySearchStartAndEnd(int [] arr,int ele, int str,int ed) {
		
		int start = str;
		int end = ed;
		
		while(start<= end) {
			int mid = (start+end)/2;
			if(ele == arr[mid]) {
				return mid;
			}else if(ele>arr[mid]) {
				start = mid+1;
			}else if(ele<arr[mid]) {
				end = mid-1;
			}
		}
		
		return -1;
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
		
		System.out.println("Enter the starting index : ");
		
		int start = sc.nextInt();
		System.out.println("Enter the ending index :");
		int end = sc.nextInt();
		
		System.out.println("Enter the element : ");
		int ele = sc.nextInt();
		
		System.out.println("Output is :");
		
	    System.out.println(ele+ " element present in the Index of : " +usingBinarySearchStartAndEnd(arr, ele, start, end));

	}

}
