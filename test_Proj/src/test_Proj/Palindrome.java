package test_Proj;

public class Palindrome {
	
	public static boolean isPalindrome(String word) {
		int n = word.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (word.charAt(i) != word.charAt(n - i - 1)) {
		         return true;
		     }
		  }

		  return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("Deleveled"));
	}
}
