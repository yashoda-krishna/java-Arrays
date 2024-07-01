package arrays;

import java.util.Scanner;

public class M21 {
public static void main(String[] args) {
	int [] nums = {1,5,20,40,11,25,90,24};
	Scanner sc = new Scanner(System.in);
	System.out.println("enter one number");
	int num = sc.nextInt();
	boolean flag = false;
	for(int i = 0;i < nums.length;i++) {
		if(nums[i] == num) {
			flag = true;
			break;
		}
	}
	System.out.println(num + " "+ (flag ? "is available" : "not Available"));
}
}
/*
enter one number
123
123 not Available
*/
