package recursion;

public class Permuatation {
	
	public static void permu(String s , String result) {
		if(s.length() == 0) {
			System.out.print(result+" ");
			return ;
		}
		for(int i  = 0 ; i< s.length() ; i++) {
			char ch = s.charAt(i);
			
			String res = s.substring(0, i)+s.substring(i+1);
//			System.out.print(res+" ");
			permu(res, result+ch);
		}
	}
	
	
	public static void main(String[] args) {
		permu("abc", "");

	}

}
