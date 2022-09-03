package mathemathicsAndNumAlgo;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
//	public static long fac(int n) {
//		if (n==0) {
//			return 1;
//		}
//		return n*fac(n-1);
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger fac = BigInteger.ONE;
		for(int i = 1; i<= n; i++) {
			fac = fac.multiply(fac.valueOf(i));
		}
		System.out.println(fac);
//		int fatorial = 1;
//		if(n==0 || n==1) {
//			System.out.println("1");
//			return;
//		}
//		if(n >1) {
//			for(int i = 2 ; i<= n;i++) {
//				fatorial *= i;
//			}
//		}
//		System.out.println(fatorial);
//		System.out.println(fac(n));
	}
}
