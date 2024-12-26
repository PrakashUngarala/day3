package logical_sections.day3;

import java.util.Scanner;

public class CopyEvenAndOdd {

	public static void EvenAndOdd(int [] arr) {
		int [] copyEven = new int [arr.length];
		int indexEven =0;
		int [] copyOdd = new int [arr.length];
		int indexOdd =0;
		for(int val : arr) {
			if(val%2 ==0) {
				copyEven[indexEven++]= val;
			}else {
				copyOdd[indexOdd++]= val;
			}
		}
		
		System.out.println("Even numbers are :");
		for(int i=0;i<indexEven;i++) {
			System.out.println(copyEven[i]);
		}
		System.out.println("Odd numbers are :");
		for(int i=0;i<indexOdd;i++) {
			System.out.println(copyOdd[i]);
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
		
		EvenAndOdd(arr);

	}
}
