package arrays;

public class M4 {
public static void main(String[] args) {
	int [] nums = new int[10];
	System.out.println(nums[0]);
	System.out.println(nums[1]);
	System.out.println(nums[2]);
	System.out.println(nums[3]);
	System.out.println(nums[4]);
	System.out.println(nums[5]);
	nums[2] = 3;
	nums[4] = 30;
	nums[2] = 13;
	nums[1] = 32;
	
	
	System.out.println(nums[0]);
	System.out.println(nums[1]);
	System.out.println(nums[0]);
	System.out.println(nums[4]);
	System.out.println(nums[9]);
}
}
