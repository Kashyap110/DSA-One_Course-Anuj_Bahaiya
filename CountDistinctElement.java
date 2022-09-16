package Hashing;

import java.util.HashSet;

public class CountDistinctElement {
	static int numoFDistinct(int nums[]) {
		HashSet <Integer> set = new HashSet<>();
		for(int i = 0 ; i< nums.length ; i++) {
			set.add(nums[i]);
		}
		System.out.println(set);
		return set.size();
	}
	public static void main(String[] args) {
		int arr[] = {4,2,4,2,6,4,3};
		System.out.println(numoFDistinct(arr));
	}
}
