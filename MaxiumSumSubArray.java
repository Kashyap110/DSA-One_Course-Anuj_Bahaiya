package array;

public class MaxiumSumSubArray {
	//Kaden's Algorithm
	public static int MaxSubArraySum(int nums[]) {
		int maxsum = 0 ;
		int cursum = 0 ;
		for(int i = 0; i< nums.length; i++) {
			cursum += nums[i];
			if(cursum>maxsum) {
				maxsum = cursum;
			}
			if(cursum<0) {
				cursum = 0;
			}
		}
		return maxsum;
	}
	public static void main(String[] args) {
		int n [] = {-5,4,6,-3,4,-1};
		System.out.println(MaxSubArraySum(n));
	}

}
