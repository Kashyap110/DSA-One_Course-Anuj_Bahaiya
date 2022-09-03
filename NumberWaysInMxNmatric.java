package recursion;

public class NumberWaysInMxNmatric {
	 public static int NimOfWays(int m , int n) {
//		 if(m<=0 || n<= 0 ) return 0;
		 if(m == 1 || n == 1) return 1;
		 
		 return NimOfWays(m-1, n)+NimOfWays(m, n-1);
	 }
	 public static void main(String[] args) {
		 int m = 51;
		 int n = 9;
		System.out.println(NimOfWays(m, n));
	}
}
