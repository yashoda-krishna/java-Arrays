package arrays;

public class M22 {
public static void main(String[] args) {
	int [] nums = {3,5,2,7,1,8,4,0,4,6,2,8};
	for(int i =0;i < nums.length - 2;i++) {
		if(nums[i] + nums[i + 1] == nums[i +  2]) {
			System.out.println(nums[i] + ", " + nums[i + 1] + ", " + nums[i + 2]);
		}
	}
}
}
/*

5, 2, 7
7, 1, 8
4, 0, 4
6, 2, 8

*/
