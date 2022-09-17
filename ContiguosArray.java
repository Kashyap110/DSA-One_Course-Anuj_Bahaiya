package map;

import java.util.HashMap;

public class ContiguosArray {
	public static int findMaxLength(int[] nums) {
		int sum = 0; 
		int max = 0;
		for(int i = 0 ;i<nums.length; i++) {
			if(nums[i] == 0 ) nums[i] = -1;

		}
		HashMap< Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		for(int i = 0 ; i< nums.length; i++) {
			sum += nums[i];
			if(map.containsKey(sum)) {
				int last = map.get(sum);
//				System.out.print(last+" ");
				max = Math.max(max,i-last);
			}else {
				map.put(sum , i);
			}
			
		}
//		System.out.println(map);
		return max;
	}
	public static void main(String[] args) {
		int n[]= {0,0,0,1,1,1};
		System.out.println(findMaxLength(n));
	}
}
/*Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray 
with an equal number of 0 and 1.*/
