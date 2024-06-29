package arrays;
// reverse only 1st half
public class M11 {
	public static void main(String[] args) {
		int[] nums = {4,2,9,6,1,0,5,6};
		for(int i=(nums.length / 2) - 1;i>=0;i--) {
			System.out.println(nums[i]+",");
		}
	}
}
