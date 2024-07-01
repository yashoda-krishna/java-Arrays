package arrays;

public class M15 {
	public static void main(String[] args) {
		int[] nums = {4,2,9,6,1,0,5,6};
		for(int i=nums.length - 1;i>=0;i-=2) {
			if(nums[i]  % 2 == 0) {
			System.out.println(nums[i]+",");
		}
	}
}
}
/*

6,
0,
6,
2,

*/
