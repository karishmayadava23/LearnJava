package day8String;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {

		// 2 Different way of creating string

		String s = "Welcome"; // 1st approach most preferred //Normay Way

//		String s1 = new String("Welcome2"); // 2nd Approach //Create String Class Object

//		System.out.println(s);
//		System.out.println(s1);

		// length -return number of characters in the string
		System.out.println(s.length());
		System.out.println("WelcomeKa".length());

		// concat() - Joining strings
		String s1 = "Welcometo";
		String s2 = "Java";
		String s3 = "class";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1 + s2 + s3);
		System.out.println(s1.concat(s2).concat(s3));

		System.out.println("Welcome".concat("Class"));
		System.out.println(s1.concat(s2));

		// trim - remove spaces right and left side
		String s4 = "  AXA  ";
		System.out.println(s4.length());
		System.out.println((s4.trim()).length());

		// charAt- returns a character from a string based on index
		System.out.println(s4.charAt(0)); // whitespace
		System.out.println((s4.trim()).charAt(0));

		// contains() returns true and check any string is part of main string
		// It is case sensitive
		// use for validation
		System.out.println((s4.trim()).contains("Ax"));
		System.out.println((s4.trim()).contains("AX"));

		// equals(), equalsIgnoreCase() - compare strings
		String sw = "Welcome";
		String sx = "Welcome";
		System.out.println(sw == sx);
		System.out.println(sw.equals(sx));
		System.out.println(sw.equals("welcome"));
		System.out.println(sw.equalsIgnoreCase("welcome"));

		// replace - replace single/multiple(sequence) of characters in a string
		s4 = "Welcome to Java";
		System.out.println(s4);
		System.out.println((s4.replace('a', 'e')));
		System.out.println(s4.replace("Java", "Cypress"));

		// substring -extract substring from the main string
		// starting index - 0
		// ending index - 1
		s = "Selenium";
		System.out.println(s.substring(1, 5));
		// elen
		// extract nium
		System.out.println(s.substring(4, 8));

		// toUpperCase toLowerCase
		s = "Welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		// split - split the string into multiple parts based on delimiter
		s = "abc@gmail.com";
//		String a[] = s.split("@");// retrun string array
//		System.out.println(a[0]);
		System.out.println(s.split("@")[0]);
		System.out.println(Arrays.toString(s.split("@")));

		// ex1
		String amount = "$15,20,55";
		// print 152055
		System.out.println(amount.replace("$", "").replace(",", ""));

		// ex2
		String sd = "abc,123@xyz";
		String arr1[] = sd.split(",");
		System.out.println(Arrays.toString(arr1));

		String arr2[] = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));

		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		// every symbol cannot be used as delimiter * % ^ ( ) - you cannot use these as
		// delimiter

		// ex4
		String name = "John Keneddy";
		System.out.println(name.contains("John"));
		System.out.println(name.replace('J', 'j').contains("john"));
		System.out.println(name.toLowerCase().contains("john"));

	}

}
