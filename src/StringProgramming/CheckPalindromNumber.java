package StringProgramming;

import java.util.Scanner;

public class CheckPalindromNumber {

	public static void main(String[] args) {
		/**
		 * Palindrome Number - A number that remains the same when its digits are
		 * reversed. for e.g 16461
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");

		int num = sc.nextInt();
		int orgNum = num;

		// reverse the number
		int revNum = 0;
		while (num != 0) {
			revNum = revNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(revNum);

		if (orgNum == revNum) {
			System.out.println("Number is palindrome number");
		} else {
			System.out.println("Number is not palindrome number");
		}

	}

}
