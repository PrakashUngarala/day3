package logical_sections.day3;
/*
 * Question 28: Replace Elements with the Sum of Neighbors
 Write a program to replace each element in an array {1, 2, 3, 4, 5} 
 with the sum of its neighbors.
 Example: Resulting array should be {2, 4, 6, 8, 4}.
 
 * 
 */
import java.util.Scanner;

public class SumOfNeighbours {

	public static int[] sumOfNeighbours(int [] arr) {
	    int [] sumArray = new int [arr.length];
	   
	    
	    for(int i=0;i<arr.length;i++) {
	    	int previous =0;
	    	int next =0;
	    	if(i>0) {
	    		previous = arr[i-1];
	    	}
	    	
	    	if(i<arr.length-1) {
	    		next = arr[i+1];
	    	}
	    	
	    	sumArray[i]= previous+next;
	    	
	    	
	    	
	    }
	    
	    return sumArray;
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
		
		int[] res = sumOfNeighbours(arr);
		for(int i=0;i<res.length;i++) {
			
			System.out.print(res[i]+" ");
		}
		
		
	}

}
