package PracticePrograms;

import java.util.Iterator;

public class chintu_practice {

	public static void main(String[] args) {
		
		
		int arr[]= {1000, 7,3,8,4, -1, 600};
		
		

		for(int i=0;i<arr.length;i++) {
			for(int k=i+1;k<arr.length;k++ ) {
				
				int temp=0;

				if(arr[i]>arr[k]) {	
					temp=arr[k];
					arr[k]=arr[i];
					arr[i]= temp;
							
			}
				
			}
										
				
		}
		
		
		for(int e:arr) {
			System.out.println(e);
		}
				
		
	}}
		


