package ArrayPrograms;

import java.util.Arrays;

public class Copyarrayanother {

	public static void main(String[] args) {
		
		

//To copy all elements of array into another
		
		//int arr[]=  new int[5];
		int arr[]=new int[] {2,6, 9};
		int arr2[]= new int[arr.length];
		
		for(int i=0;i<arr.length; i++)
		{
			arr2[i]= arr[i];
		}
		
		System.out.println("New Values");
		
		for(int i=0;i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
				}
		
System.out.println("Original Values");
		
		for(int i=0;i<arr.length; i++)
		{
			System.out.println(arr[i]);
				}
		
		
		System.out.println("---------------");
		///array copy method
		int copy[]= Arrays.copyOf(arr2, 10);
		
		for(int num:copy)
		{
			System.out.println(num);
		}
		
		

}
}
