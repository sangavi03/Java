import java.util.Scanner;
class Palindrome{
	void checkForPalindrome() {

		String word, reverse = "";
	      Scanner scan = new Scanner(System.in);
	 
	      System.out.println("Enter a word to check if it is Palindrome:");
	      word = scan.nextLine();
	 
	      int numOfLetters = word.length();
	 
	      for ( int i = numOfLetters - 1; i >= 0; i-- )
	         reverse = reverse + word.charAt(i);
	 
	      if (word.equals(reverse))
	         System.out.println(word+" True");
	      else
	         System.out.println(word+" False");
	}
	}

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome palindrome = new Palindrome();
		palindrome.checkForPalindrome();
	}
}
