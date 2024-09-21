package PracticePrograms;

import java.util.Arrays;

public class SmallLargestArray {

	public static void main(String[] args) {
	
		
		
		int nums[]= {4, 6, 7, -24, -10, 98266, -8, 89};
		
		int smallest_no= 4;
		int largest_no=6;
		
		for(int i=1; i<nums.length;i++) {
			
			if (nums[i]<smallest_no) {
				
				smallest_no = nums[i];
				
			}
			
			else if(nums[i]>largest_no) {
				largest_no = nums[i];		
				
			}
			
		}
		
		System.out.println("Smallest no is ::  " + smallest_no);
		System.out.println("Largest no is ::  " + largest_no);
		
		
		Arrays.sort(nums);
		
		System.out.println("Smallest no is ::  " + nums[0]);
		System.out.println("Largest no is ::  " + nums[nums.length-1]);
		

	}

}
