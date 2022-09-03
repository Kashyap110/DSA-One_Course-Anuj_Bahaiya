package mathemathicsAndNumAlgo;

import java.util.Arrays;

//to check prime number
public class SieveOfEratosthenes {
	
	public static void main(String[] args) {
		boolean prime[]= isPrime(9);  
		for(int i = 0 ;i<=9;i++) {
			System.out.println(i+" "+prime[i]);
		}
	}	
	
	public static boolean[] isPrime(int n) {
		boolean prime[] = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for(int i = 2; i*i<=n ; i++) {
			for(int j = 2*i ; j<=n;j +=i ) {
				prime[j] =false;
			}
		}
		return prime;
	}
	
}
