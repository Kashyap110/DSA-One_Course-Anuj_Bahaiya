package binarySearch;

public class SearchKeyInSortedAndRotatedArray {
	 public static int searchIndex(int nums[], int key) {
		 int low = 0;
		 int high = nums.length-1;
		 while(low<= high) {
			 int mid = low+(high-low)/2;
			 if(nums[mid]== key) return mid;
			 if(nums[low]< nums[mid]) {
				 if(nums[low]<=key && nums[mid-1]>= key) {
					 high = mid - 1;
				 }else {
					low = mid + 1;
				}
			 }else {
				 if(nums[mid+1]<=key && nums[high]>=key ) {
					 low = mid+1;
				 }else {
					 high = mid-1;
				 }
			 } 
		 }
		 return -1;
	 }
		public static void main(String[] args) {
			int a[] = {20,30,40,50,60,5,10};
			int t = 30;
			System.out.println(searchIndex(a, t));
		}
}
