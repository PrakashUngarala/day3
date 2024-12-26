package logical_sections.day3;

import java.util.Scanner;

/*
 * Question 26: Copy Elements Skipping Every Second Element
 Write a program to copy the elements of an array {1, 2, 3, 4, 5, 6}
 into a new array, skipping every second element. 
 The resulting array should be {1, 3, 5}.

 */
public class CopingEleBySkipingsecondEle {

	public static int[] copingEleSkipSecondEle(int [] arr) {
		
		int [] copyArr = new int[(arr.length+1)/2]; 
		int count=0;
		for(int i =0;i<arr.length;i+=2) {
			copyArr[count++] = arr[i];
		}
		
		return copyArr;
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
		int [] res = copingEleSkipSecondEle(arr);
		for(int i =0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		
	}

}
