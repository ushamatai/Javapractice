package PracticePrograms;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		

		int array[] = { 12, 45, 1,  4,  23, 100, 0};
		
		
		System.out.println("---Below fxn will find the smallest and largest num----" );
		
		
		int smallest = 12;
		int largest= 45;
		
		for(int i=1;i<array.length; i++) {
			
			if(array[i]<smallest) {
				
				smallest=array[i];
			}else if(array[i]>largest) {
				largest=array[i];
				
			}
		}
		
		System.out.println(smallest);
		System.out.println(largest);
		
		System.out.println("------------SORTING---------------------------------- " );
		
		System.out.println("array before sorting is " );
		
		for(int e:array) {
			System.out.println(e);
		}
		
		
		//to sort array using loop
		for(int i=0;i<array.length; i++) {
			for(int j=i+1;j<array.length;j++) {
				int temp=0;
				
				
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]= temp;
				}
				
				
				
			}
			
		}
		
		//To sort array using inbuilt function
		
		Arrays.sort(array);
		
		
		System.out.println("--------array after sorting is------ " );
		
		for(int e:array) {
			System.out.println(e);
		}
		
		
		System.out.println("Second largest element in array is : : "  + array[array.length-2]);
		System.out.println("Second smallest element in array is : : "  + array[1]);


		
		
		
		
		
		

	}

}
