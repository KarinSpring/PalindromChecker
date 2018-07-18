package ch.csbe.small;

public class PalindromChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "asfasde";
		System.out.println(isPalindrom(text));
		System.out.println(isPalindromRek(text, 0, text.length()-1));
	}
	
	public static boolean isPalindromRek(String text, int i, int j) {
		if(j <= i)
			return true;
		
		if(text.charAt(i) != text.charAt(j))
			return false;
		
		return isPalindromRek(text, ++i, --j);
	}
	
	public static boolean isPalindrom(String text) {
		for(int i = 0 ; i < text.length()/2 ; i++) {
			if(text.charAt(i) != text.charAt(text.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

}
