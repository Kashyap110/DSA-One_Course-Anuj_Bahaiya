package array;

public class MaxiumSumSubArray {
	//Kaden's Algorithm
	public static int MaxSubArraySum(int nums[]) {
		int sum = 0 ;
		int maxsum = Integer.MIN_VALUE;
		for(int i = 0 ; i< nums.length ; i++) {
			sum += nums[i];
			maxsum = Math.max(sum, maxsum);
			if (sum<0) sum = 0 ;
		}
		return maxsum;
		//work in O(n) but not work for all negative
//		int maxsum = 0 ;
//		int cursum = 0 ;
//		for(int i = 0; i< nums.length; i++) {
//			cursum += nums[i];
//			if(cursum>maxsum) {
//				maxsum = cursum;
//			}
//			if(cursum<0) {
//				cursum = 0;
//			}
//		}
//		return maxsum;
	}
	public static void main(String[] args) {
		int n [] = {-5,-3,-4,-1};
		System.out.println(MaxSubArraySum(n));
	}

}
