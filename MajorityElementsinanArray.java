package array;

public class MajorityElementsinanArray {
	
	public static int majorNumber(int nums[]) {
		int ansInd = 0 ,count = 1;
		for(int i = 0 ; i< nums.length; i++) {
			if(nums[i] == nums[ansInd]) {
				count++;
			}else count--;
			
			if(count == 0 ) {
				ansInd = i ;
				count =1;
			}
		}
		int k = 0 ;
		for(int i = 0 ; i< nums.length; i++) {
			if(nums[i] == nums[ansInd]) {
				k++;
			}
		}
		if(k>nums.length/2) {
			return nums[ansInd];
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		int nums[] = {2,3,2,3,3};
		System.out.println(majorNumber(nums));
	}

}
