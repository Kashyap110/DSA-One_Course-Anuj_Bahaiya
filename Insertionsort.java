package sortingtechnic;

public class Insertionsort {
	// In these sort we take two part sorted and unsorted take an element add it to the sorted array
	public static int[] insertionSort(int nums[]) {
		for(int i = 1 ; i<nums.length ;i++) {
			int temp = nums[i];
			int j = i - 1;
			while(j>=0 && nums[j]>temp) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = temp;
		}
		for(int i = 0 ; i< nums.length ; i++) {
			System.out.print(nums[i]+" ");
		}
		return nums;
	}
	public static void main(String[] args) {
	    	int n[] = {8,4,1,5,9,2};
	    	System.out.println(insertionSort(n));
	}
}
