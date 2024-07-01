package arrays;

import java.util.Arrays;

public class M20 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;//2147483647
		int[] nums = {4,2,9,6,1,0,5,6};
		System.out.println(max);
		int min1 = nums[0];
		int len = nums.length;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]> max) {
				max = nums[i];
			}
	}
		System.out.println(Arrays.toString(nums));
		System.out.println(max);

	}

}

/* 

-2147483648
[4, 2, 9, 6, 1, 0, 5, 6]
9


*/
