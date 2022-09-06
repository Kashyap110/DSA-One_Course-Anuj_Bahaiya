package sortingtechnic;

public class QuickSort {
	//It is run on O(NlogN)
	public static void quickSort(int nums[], int low , int high) {
		if(low < high) {
			int pidx = partition(nums, low,high);
			quickSort(nums, low, pidx-1);
			quickSort(nums, pidx, high);
		}
	}
	
	private static int partition(int[] nums, int low, int high) {
		//we take pivot as last element
		int pivot = nums[high];
		int i = low -1 ;
		for(int j = low; j<high ; j++ ) {
			if(nums[j]<pivot) {
				i++;
				//swap
				Swap(nums, i, j);	
			}
		}
		i++;
		Swap(nums, i, high);
		return i;
		//we get position of pivot
	}
	public static void Swap(int nums[] , int i , int j ) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static void main(String[] args) {
		int arr[] = {9,6,2,5,4,7,1,3};
		int n = arr.length;
		quickSort(arr, 0, n-1);
		for(int i=0; i<n ;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
