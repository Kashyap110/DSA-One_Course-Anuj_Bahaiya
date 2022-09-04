package array;

public class BestTimeTOSelAndBuy2 {
	public static int maxProfitis(int nums[]) {
		int profit = 0 ;
		for(int i = 0;i< nums.length-1;i++) {
			if(nums[i]<nums[i+1]) {
				profit += nums[i+1] - nums[i]; // as we can hold only one stock 
												//we sell it as early as we buy
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		int a[] = {5,4,3,2,1};
		System.out.println(maxProfitis(a));
	}

}
