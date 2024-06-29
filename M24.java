package arrays;

import java.util.Arrays;

public class M24 {
public static void main(String[] args) {
	int[] nums = {10,20,30,40,50,60};
	System.out.println("Initial content:" + Arrays.toString(nums));
	int temp = nums[0];
	for(int i = 0;i < nums.length - 1; i++) {
		nums[i] = nums[i + 1];
	}
	nums[nums.length - 1] = temp;
	System.out.println("Final content:" + Arrays.toString(nums));
     /* Initial content:[10, 20, 30, 40, 50, 60]
		Final content:[20, 30, 40, 50, 60, 10]




*/
}
}