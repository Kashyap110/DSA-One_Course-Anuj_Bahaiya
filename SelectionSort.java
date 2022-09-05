package sortingtechnic;

public class SelectionSort {
	//We will find the min number in array add it to first then again see min after that add to next position
	public static void Swap(int arr[], int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void printArr(int num[]) {
		for(int i = 0 ; i< num.length ; i++) {
			System.out.print(num[i]+" ");
		}
	}
	public static int[] selectionSort(int nums[]) {
		int n = nums.length;
		for(int i = 0 ; i<n-1;i++) {
			int min = i; 
			for(int j = i+1 ; j< n ; j++) {
				if(nums[j]< nums[min]) 
					min = j;
			}
			if(min != i) {
				Swap(nums, min,i);
			}
		}
		printArr(nums);
		return nums;
	}
	public static void main(String[] args) {
		int n[] = {4,1,9,3,2,8};
		selectionSort(n);
 	}
}
