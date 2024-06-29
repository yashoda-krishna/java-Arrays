package arrays;

public class M12 {
		public static void main(String[] args) {
			int[] nums = {4,2,9,6,1,0,5,6};
			for(int i=nums.length - 1;i>=(nums.length / 2);i--) {
				System.out.println(nums[i]+",");
			}
		}

	}
