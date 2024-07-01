package arrays;

import java.util.Arrays;

public class M28 {
public static void main(String[] args) {
	int [] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
	System.out.println("Initial content:" + Arrays.toString(nums));
    int t1 = nums[0];
    int t2 = nums[1];
    for(int i=0;i< nums.length - 2; i++) {
    	nums[i] = nums[i + 2];
    	
    }
    nums[nums.length - 2] = t1;
    nums[nums.length - 1] = t2;
    System.out.println("Final content:" + Arrays.toString(nums));
}
}

/*

Initial content:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Final content:[3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2]
*/
