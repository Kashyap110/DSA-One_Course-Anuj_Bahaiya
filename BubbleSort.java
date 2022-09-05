package array;

public class BubbleSort {
	public static void swap(int nums[],int a , int b ) {
		int temp = nums[a];
		nums[a] =nums[b] ;
		nums[b] = temp;
	}
	public static int[] bubbleSort(int nums[]) {
		int n = nums.length;
		for(int i = 0 ; i< n-1; i++) {
			for(int j = 0 ; j<n-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					swap(nums, j, j+1);
				}
			}
		}
		for(int i = 0 ;i< n ; i++) {
			System.out.println(nums[i]);
		}
		return nums;
	}

	public static void main(String[] args) {
		int num[] = {4,3,7,1,5};
		System.out.println(bubbleSort(num));
	}

}
