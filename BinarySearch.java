package binarySearch;
//Binary search works on the sorted array complex city is logN
public class BinarySearch {
	public static int binarySearch(int a[] , int target) {
		int low = 0 , high = a.length-1;
		while(low<=high) {
			int mid = (low+high)/2 ;
			if(a[mid] == target) return mid;
			else if (a[mid]<target) {low = mid+1;}
			else high = mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = {1,4,5,6,7,8,9};
		int t = 8;
		System.out.println(binarySearch(a, t));
	}

}
