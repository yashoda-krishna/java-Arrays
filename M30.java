package arrays;

import java.util.Arrays;

public class M30 {
public static void main(String[] args) {
	int[] nums = {10,20,30,40,50,60};
	System.out.println("Initial content:" + Arrays.toString(nums));
	int t1 = nums[nums.length - 1];
	int t2 = nums[nums.length - 2];
	for(int i = nums.length - 1;i > 1; i--) {
		nums[i] = nums[i - 2];
	}
	nums[1] = t1;
	nums[2] = t2;
	System.out.println("Final content:" + Arrays.toString(nums));

}
}

/*
Initial content:[10, 20, 30, 40, 50, 60]
Final content:[10, 60, 50, 20, 30, 40]

*/
