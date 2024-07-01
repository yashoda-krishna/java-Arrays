package arrays;

import java.util.Arrays;

public class M19 {
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;//2147483647
		int[] nums = {4,2,9,6,1,0,5,6};
		int len = nums.length;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]< min) {
				min = nums[i];
			}
	}
		System.out.println(Arrays.toString(nums));
		System.out.println(min);

	}
}
/*
[4, 2, 9, 6, 1, 0, 5, 6]
0
*/
