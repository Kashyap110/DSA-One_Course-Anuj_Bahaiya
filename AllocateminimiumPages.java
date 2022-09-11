package binarySearch;

public class AllocateminimiumPages {
	//k is the student
	public static int minPage(int nums[], int k ) {
		int min =Integer.MIN_VALUE;//max value of array
		int max = 0 ; //sum of array
		int res =0;
		for(int i = 0 ; i< nums.length; i++ ) {
			max +=nums[i];
			if(min<nums[i]) {
				min = nums[i];
			}
		}
		while(min<=max) {
			int mid = (min+max)/2;
			if(isFeasible(nums, k, mid)) {
				res = mid;
				max = mid -1;
			}else {
				min = mid+1;
			}
		}
		return res;
	}
	public static boolean isFeasible(int arr[], int k  ,int res) {
		int student = 0,sum = 0; 
		for(int i = 0 ; i< arr.length; i++) {
			if(sum +arr[i]>res) {
				student++;
				sum = arr[i];
			}else {
				sum += arr[i];
			}
		}
		return student <= k;
	}
	public static void main(String[] args) {
		int arr[] = {10, 20,30,40};
		System.out.println(minPage(arr, 2));
	}

}
