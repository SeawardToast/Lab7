package Lab7;

public class PalindromeInteger {

	public static void main(String[] args) {
		System.out.println(reverse(32222222));
	}
	
	public static int reverse(int number) {
		String s = Integer.toString(number);
		
		String v = "";
		
		for (int i = s.length(); i >= 0; i--) {
			char x = s.charAt(i);
			String y = Character.toString(x);
			v = v.concat(y);
			
		}
		
		int u = Integer.parseInt(v);
		return u;
	}
	
//	public static boolean isPalindrome(int number) {
//		return;
//	}
	
	
}
