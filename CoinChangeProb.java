package dp;

import java.util.Arrays;
//Run on O(n*m) m = coins 
public class CoinChangeProb {
	static int minCoin(int n , int arr[], int dp[]) {
		
		if(n == 0 ) return 0;
		
		int ans = Integer.MAX_VALUE;
		
		for(int i = 0 ;i<arr.length; i++) {
			if(n-arr[i]>=0) {
				int subAns = 0;
				if(dp[n-arr[i]] != -1) {
					subAns = dp [n-arr[i]];
				}else {
					subAns = minCoin(n-arr[i], arr,dp);
				}
				if(subAns+1<ans && subAns != Integer.MAX_VALUE) {
					ans = subAns+1;//as we add 1 here because we use one coin before enter in  loop
				}
			}
		}
		return dp[n]= ans;
	}

	public static void main(String[] args) {
		int n = 18; int coin[] = {7,5,1};
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;//we have assign because we have return from the loop 
		System.out.println(minCoin(n, coin,dp));
		
		for(int x : dp) {
			System.out.print(x+" ");//calculate coin require to each money
		}
	}

}
