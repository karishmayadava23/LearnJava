package day8String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * We have provided String as "Automation" and We want to reverse the string and
		 * out output will be "noitamotuA"
		 */

		// String input = "Automation";
		// String rev = "";
		// Approach1
		/*
		 * for (int i = input.length() - 1; i >= 0; i--) { rev = rev + input.charAt(i);
		 * } System.out.println(rev);
		 */

		// Approach 2 we do not want to use charAt and length method of string.

		/*
		 * char a[] = input.toCharArray(); for (int i = a.length - 1; i >= 0; i--) { rev
		 * = rev + a[i]; } System.out.println(rev);
		 */

		// Approach 3
		// Using StringBuffer class
		/*
		 * StringBuffer sb = "Test"; cannot be created as StringBuffer and StringBuilder
		 * is mutable but String is immutable
		 */
		/*
		 * StringBuffer sb = new StringBuffer("Automation");
		 * System.out.println(sb.reverse());
		 */

		// Approach 4
		StringBuilder sb1 = new StringBuilder("Automation");
		System.out.println(sb1.reverse());
		// below way using rev variable
		/*
		 * String rev = sb1.reverse().toString(); System.out.println(rev);
		 */

	}
}