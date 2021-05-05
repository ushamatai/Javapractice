package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class addingnum {
	
	
	public static void findPairs(int [] arr, int sum) {
		
		Set<Integer> set= new HashSet();
		//Searching using for loop
		for(int i =0;i<arr.length; i++)
		{
			int temp= sum-arr[i];
			if(set.contains(temp)) {
				
				System.out.println("Pair of " + sum + " is : " + "(" + temp+ ", " + arr[i] + ")");
			}
			set.add(arr[i]);
			
		}
	}

	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8, 9, 7 };
        int n = 16;
        findPairs(A, n);



	}

}
