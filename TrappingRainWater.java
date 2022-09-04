package array;

public class TrappingRainWater {
	
	public static int numberBoxFill(int nums[]) {
		int n = nums.length;
		int leftMax[] = new int [n];
		int rightMax[] = new int [n];
		int r = n-1;
		int left = nums[0];
		int right = nums[r];
		for(int i = 0 ; i<n; i++) {
			left = Math.max(left, nums[i]);
			leftMax[i] = left;
//			System.out.print(leftMax[i]);
		}
//		System.out.println();
		for(int i = n-1 ; i>= 0 ; i--) {
			right =Math.max(right, nums[i]);
			rightMax[i] = right;
//			System.out.print(rightMax[i]);
		}
		int amountbox = 0;
		for(int i = 0 ; i< n ;i++) {
			amountbox += Math.min(leftMax[i], rightMax[i]) - nums[i];
		}
		return amountbox;
	}
	public static void main(String[] args) {
		int a[] = {3,1,2,4,0,1,3,2};
		System.out.println(numberBoxFill(a));
	}
}
