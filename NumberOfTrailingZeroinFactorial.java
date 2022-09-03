package mathemathicsAndNumAlgo;

import java.util.Scanner;

public class NumberOfTrailingZeroinFactorial {
	// 11! = 1*2*3*4*5*6*7*8*9*10*11  so we multiply 5*2 we get zero at trail
	public static long fac(int n) {
		if (n==0) {
			return 1;
		}
		return n*fac(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int NumberOfZerotrail = 0;
		for(int i = 5 ; i<=n ; i=i*5) {
			NumberOfZerotrail += n/i;
		}
		System.out.println(NumberOfZerotrail);
//		System.out.println(fac(n));

	}

}
