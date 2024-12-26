package logical_sections.day3;

import java.util.Scanner;


class ArrayAndSize{
	int size;
	int [] arr;
	public ArrayAndSize(int size, int[] arr) {
		super();
		this.size = size;
		this.arr = arr;
	}
	
	
}
public class CopyingCommonElementsBetweenTwoArrays {

	
	
	public static ArrayAndSize commonElements(int [] arr1,int [] arr2) {
		
		int [] commonEle = new int [arr1.length];
		int commonEleCount =0;
		
		for(int arr1Value : arr1) {
			for(int arr2Value : arr2) {
				if(arr1Value == arr2Value) {
					commonEle[commonEleCount++] = arr1Value;
				}
			}
		}
		
		return new ArrayAndSize(commonEleCount, commonEle);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array :");
		int size1 = sc.nextInt();
		int [] arr1 = new int[size1];
		System.out.println("Enter the "+size1+" elements in first Array :");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of the second array :");
		int size2 = sc.nextInt();
		int [] arr2 = new int[size2];
		System.out.println("Enter the "+size2+" elements in first Array :");
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		
		
		System.out.println("Output is :");
		ArrayAndSize as = commonElements(arr1, arr2);
		for(int i=0;i<as.size;i++) {
			System.out.println(as.arr[i]);
		}
	}

}
