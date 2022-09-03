package mathemathicsAndNumAlgo;

import java.util.Scanner;
//12521
public class GivenIntPalindrome {
	public static int[] count(int n) {
		int i = 0;
		int arr [] = new int[String.valueOf(n).length()];
		while(n>0) {
			arr[i] = n%10;
			n = n/10;
			i++;
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		int count[] = count(n);
		int a = String.valueOf(n).length();
		int l = 0;
		int r = a-1;
		while (l<=r) {
			if(count[l] != count[r]) {
				flag = true;
			}
			l++;r--;
		}
		if(flag) {
			System.out.println("Not palidrome");
		}else {
			System.out.println("Palidrome");
		}
		

		
//		for(int i = 0 ;i< a;i++) {
//			System.out.print(count[i]+" ");
//		}
//		
	}
}
