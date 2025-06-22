package exceptionDemo;

import java.util.Scanner;

public class HandleException {
	public static void main(String[] args) {
		System.out.println("Program is started.");
		Scanner sc = new Scanner(System.in);

		// Arithmetic Exception
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		try {
			System.out.println(100 / num); // ArithmeticException
			String s = null;
			System.out.println(s.length());

		} catch (Exception e) {
			System.out.println("Invalid data..." + e);

		}
		System.out.println("Program is Completed.");
		System.out.println("Program is exited.");

	}

}
