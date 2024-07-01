package arrays;

public class M18 {
public static void main(String[] args) {
	int sum = 0;
	int[] nums = {4,2,9,6,1,0,5,6};
	int len = nums.length;
	for(int i=0;i<nums.length;i++) {
		sum += nums[i];
}
	double s1 = (double) sum/len;
	System.out.println(sum);
	System.out.println(s1);

}
}
/*

33
4.125
*/
