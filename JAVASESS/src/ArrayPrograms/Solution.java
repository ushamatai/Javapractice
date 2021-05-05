package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public  class Solution {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        System.out.println(nums.length);
        System.out.println(nums[nums.length-1]);
     
    	

        // Ensure that n is at the last index
        if (nums[nums.length-1] != nums.length) {
        	
            return nums.length;
        }
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }

        // If we get here, then the missing number is on the range (0, n)
        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i-1] + 1;
            if (nums[i] != expectedNum) {
            	
                return expectedNum;
            }
        }

        // Array was not missing any numbers
        return -1;
    }
    
    public static void main(String[] args) {
		int num[]= {0,2,3};
		int x=missingNumber(num);
		System.out.println(x);
		

	}
}