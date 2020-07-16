package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
	//int  arr[]=new int[3];//valid
	//int arr[]=new int[3];//valid 
	
	
	
	public static void main(String[] args) {
		int[] arr=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int index=0;index <=arr.length-1;index++)
		{	int counter=index +1;
			System.out.print("enter the number  :-"+counter);
			arr[index]=sc.nextInt();
		}
		// for sorting of the array the methods are user in java.util package.
		
		Arrays.sort(arr);
//		// to print the arry with the for-each loop is that 4th loop into the java
		for (int element : arr)
			System.out.println(element);
		
		
//		for(int index=0;index <=arr.length-1;index++)
//			System.out.println(arr[index]);
	}

}
