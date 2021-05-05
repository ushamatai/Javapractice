package ArrayPrograms;

import java.util.Arrays;

public class missingnos0 {
	
	
	public static int  missingNo(int [] nums) {
		
		Arrays.sort(nums);
		//if 0 is missing
		if (nums[0]!=0)
		{
			return 0;
			
		}
		//if last no is missing
		else if(nums[nums.length-1]!= nums.length)
			
		{
			return nums.length;
			
		}
		//if nos is between 1 to4 then
		else {
		
			for(int i=1; i<nums.length; i++)
			{
				int exp= nums[i-1]+1;
				if(nums[i]!=exp) {
					return exp;
				}	
			}
		
		
		}
	
		return -1;
			
		
		
		
	}

	public static void main(String[] args) {
		int arr[]= {4,3,2};
		System.out.println("Missing no is " + missingNo(arr));
		

	}

}
