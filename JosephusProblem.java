package recursion;

public class JosephusProblem {
	// n people in the circle after k person people kill
		public static int jos(int n , int k ) {
			if(n ==1 ) return 0 ;
			return (jos((n-1),k) + k)%n;
		}
		public static void main(String[] args) {
			 System.out.println(jos(5, 3));
		}
}
