package arrays;

public class M14 {
	public static void main(String[] args) {
		int[] nums = {4,2,9,6,1,0,5,6};
		for(int i=nums.length - 1;i>=0;i-=2) {
			System.out.println(nums[i]+",");
		}
	}
}