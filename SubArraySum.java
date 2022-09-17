package Hashing;

import java.util.HashMap;

public class SubArraySum {
	
	public static void subArraySumIndex(int a[], int sum) {
		int curSum = 0;
		int start = 0 ; 
		int end = -1;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i<a.length; i++) {
			curSum += a[i];
			if(curSum - sum == 0) {
				start = 0; end =i;
				break;
			}
			if(map.containsKey(curSum - sum)) {
				start = map.get(curSum-sum)+1;
				end = i ;
				break;
			}
			map.put(curSum, i);
		}
		if(end == -1) {
			System.out.println("No sum exist");
		}else {
			System.out.println("Start = "+start+" "+"End = "+end);
		}
	}
	public static void main(String[] args) {
		int arr[] ={10,15,-5,15,-10,5};
		int sum = -5;
		subArraySumIndex(arr, sum);
	}
}
