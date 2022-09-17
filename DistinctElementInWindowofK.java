package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctElementInWindowofK {
	public static int[] distintElementInInterval(int nums[], int k) {
		//O(n)
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i<k; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		list.add(map.size());
		for(int i = k ; i< nums.length; i++) {
			if(map.get(nums[i-k]) == 1) {
				map.remove(nums[i-k]);
			}else {
				map.put(nums[i-k],map.get(nums[i-k])-1);
			}
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			list.add(map.size());
		}
		System.out.println(list);
		
		return null;
		//O(N^2)
//		ArrayList<Integer> list = new ArrayList<>();
//		for(int i = 0 ; i<=nums.length-k; i++) {
//			HashSet< Integer> set = new HashSet<>();
//			for(int j = 0 ;j<k ; j++) {
//				set.add(nums[i+j]);
//			}
//			size = set.size();
//			list.add(size);	
//		}
//		System.out.println(list);
//		return null;
		
		
	}
	public static void main(String[] args) {
		int a[] = {1,2,2,1,3,1,1,3}; 
		distintElementInInterval(a, 4);
	}
}
