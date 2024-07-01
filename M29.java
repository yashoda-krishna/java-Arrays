package arrays;

import java.util.Arrays;

public class M29 {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50,60};
		System.out.println("Initial content:" + Arrays.toString(nums));
		for(int i = nums.length - 1;i > 1; i--) {
			nums[i] = nums[i - 2];
		}
		System.out.println("Final content:" + Arrays.toString(nums));
	}
}
/*
Initial content:[10, 20, 30, 40, 50, 60]
Final content:[10, 20, 10, 20, 30, 40]
*/
