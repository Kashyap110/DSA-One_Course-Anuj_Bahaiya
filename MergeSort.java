package sortingtechnic;
//Time complecity is O(nlogn)
	//In merge sort we create new arry to sort 
	//the array here we want memory
public class MergeSort {
	
	public static void divide(int array[],int l, int r ) {	
		if(l<r) {
			int mid = l+(r-l)/2;
			divide(array, l, mid);
			divide(array, mid+1, r);
			merge(array, l ,mid,r );
		}
	}
	private static void merge(int[] array, int l, int mid, int r) {
		int temp[] = new int [r-l+1];
		int idx1 = l ; int k = 0 ;int idx2 = mid+1; 
		while(idx1<=mid && idx2<= r) {
			if(array[idx1]<= array[idx2]) {
				temp[k] = array[idx1];
				idx1++;k++;
			}else {
				temp[k] = array[idx2];
				idx2++;k++;
			}
			
		}
		while (idx1<=mid) {
			temp[k]= array[idx1];
			k++; idx1++;
		}
		while (idx2<=r) {
			temp[k] = array[idx2];
			k++; idx2++;	
		}
		for(int i = 0,j = l ; i<temp.length; i++,j++) {
			array[j] = temp[i];
		}
	}
	public static void main(String[] args) {
		int n[] = {-3,4,-8,2,-1,5,9};
		int m = n.length;
		divide(n, 0, m-1);
		for(int i = 0 ; i< m ; i++) {
			System.out.print(n[i]+" ");
		}
	}

}
