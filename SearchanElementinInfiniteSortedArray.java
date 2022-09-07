package binarySearch;

public class SearchanElementinInfiniteSortedArray {
	
		public static int searchInfinite(int nums[], int key) {
			int low = 0 ; 
			int high = 1; 
			while(nums[high]<=key) {
				low = high;
				high = 2*high;
			}
			return binarySearch(nums, low ,high , key);
		}
		
		public static int binarySearch(int nums[], int low , int high , int key) {
			while(low<=high) {
				int mid = (low+high)/2;
				if(nums[mid] == key) return mid;
				else if(nums[mid]<key) {low = mid+1;}
				else {high = mid -1;}
			}
			return -1;
		}
	
	
		public static void main(String[] args) {
			int a [] = {1,2,4,7,8,12,58,71,233,342};//lets say its infite
			System.out.println(searchInfinite(a, 51));
		}
}
