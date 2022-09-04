package array;

public class BestTimeToBuyAndSell {
	public static int maxProfit(int nums[]) {
		//Best method
		int min = Integer.MAX_VALUE ;
		int maxprofit = 0;
		for(int i = 0 ; i< nums.length ; i++) {
			min = Math.min(min,nums[i]);
//			System.out.println(min);
			maxprofit = Math.max(maxprofit, nums[i]-min);
//			System.out.println(maxprofit);
		}
		return maxprofit;
		
		
		//Using space O (n)
//		int n = nums.length;
//		System.out.println(n);
//		int maxvalue[] = new int[n];
//		int maxval =nums[n-1];
//		int profit[] = new int[n];
//		for(int i = n-1 ; i>=0 ; i--) {
//			maxval = Math.max(nums[i], maxval);
//			maxvalue[i] = maxval;
////			System.out.println(maxvalue[i]);
//		}
//		int maxprofit = 0 ;
//		for(int i = 0 ; i< n ; i++) {
//			maxprofit = Math.max(maxprofit, maxvalue[i]-nums[i]);
//		}
//		return maxprofit;
//		
	}
	public static void main(String[] args) {
		int a []= {3,2,1}; 
		System.out.println(maxProfit(a));
	}
}
