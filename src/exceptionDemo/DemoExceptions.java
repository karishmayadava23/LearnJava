package exceptionDemo;

import java.util.Scanner;

public class DemoExceptions {
	public static void main(String[] args) {
		System.out.println("Program is started.");
		Scanner sc = new Scanner(System.in);

		// Arithmetic Exception
//		System.out.println("Enter a number: ");
//		int num = sc.nextInt();
//		System.out.println(100 / num); // ArithmeticException

		// e.g. ArrayIndexOutOfBoundsException
//		int a[] = new int[5];
//		System.out.println("Enter the position(0-4):");
//		int pos = sc.nextInt();
//
//		System.out.println("Enter a value:");
//		int value = sc.nextInt();
//
//		a[pos] = value;
//
//		System.out.println(a[pos]);// when 5 position is given and tried to get the value we get
		// ArrayIndexOutOfBoundException

		// example 3
//		String s = "12345";
//		String s1 = "Welcome";
//		int num = Integer.parseInt(s);
//		System.out.println(num);
//		int num1 = Integer.parseInt(s1);// this will give NumberFormatException
//		System.out.println(num);

		// Example 4
//		String s = null;
//		System.out.println(s.length()); //null pointer exeception
		String s1 = "";
		System.out.println(s1.length());

		String s2 = "0";
		System.out.println(s2.length());

		String s3 = "Welcome";
		System.out.println(s3.length());

		System.out.println("Program is Completed.");
		System.out.println("Program is exited.");

	}

}
