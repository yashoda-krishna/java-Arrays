package arrays;

import java.util.Arrays;

public class M23 {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50,60};
		System.out.println("Initial content:" + Arrays.toString(nums));
		for(int i = 0;i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];
		}
		System.out.println("Final content:" + Arrays.toString(nums));
}
}
