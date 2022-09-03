package recursion;

public class StringPalidrome {
	public static boolean isPalidrome(String s , int left , int right) {
		if(left >= right) return true;
		if(s.charAt(left) != s.charAt(right)) return false;
		return isPalidrome(s, left+1, right-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "abcba";
		int l = 0; int r = p.length()-1;
		System.out.println(isPalidrome(p, l, r));

	}

}
