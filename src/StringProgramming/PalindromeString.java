package StringProgramming;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		/**
		 * Palindrome String - It is string that remains the same when its characters
		 * are reversed for e.g. - MADAM
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");

		String str = sc.next(); // User Provide Input string
		/*
		 * created another string to store the value to draw comparison between original
		 * and reversed string value
		 */
		String originalString = str;
		String revString = "";
		int stringLength = str.length();
		for (int i = stringLength - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
			revString = revString + str.charAt(i);

		}

		System.out.println(revString);

		if (originalString.equals(revString)) {
			System.out.println(originalString + " is Palindrome");
		} else {
			System.out.println(originalString + " is not Palindrome");
		}

	}

}
