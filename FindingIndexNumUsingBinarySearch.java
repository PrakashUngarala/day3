package logical_sections.day3;
/*
 *  Q.  Implement a Java program to find the index number of an element 
 in an int array by using binary searching and display the results.
 
 */
import java.util.Scanner;

public class FindingIndexNumUsingBinarySearch {

	public static int searchingElemetUsingBinarySearch(int [] arr,int ele) {
		
		
		int start=0;
		int end = arr.length-1;
		while(start<=end) {
			
			int mid=(end+start)/2;
			
			int midEle = arr[mid];
			
			if(ele == midEle) {
				return mid;
			}
			else if(ele>midEle) {
				start = mid+1;
			}
			else if(ele<midEle) {
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
		
		System.out.println("Enter the element : ");
		int ele = sc.nextInt();
		
		System.out.println("Output is :");
		
	    System.out.println("Index of the element is :" +searchingElemetUsingBinarySearch(arr,ele));

	}


}
