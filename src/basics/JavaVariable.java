package basics;

public class JavaVariable {
	public static void main(String[] args) {
		int age = 18; // age is a local variable
		String message = "Voting Rights"; // message is a local variable

		System.out.println("age is :" + age);
		System.out.println("message is :" + message);

		if (age > 18) {
			String result = "You can vote"; // result is local variable
			System.out.println(result);
		}
		// System.out.println(result); // Uncommenting the line will result in a
		// compile-time error

		for (int index = 0; index < 3; index++) {
			String indexMessage = "Loop " + index;
			// indexMessage is a local variable
			System.out.println(indexMessage);
		}
		// System.out.println(indexMessage);// Uncommenting the line will result in a
		// compile-time error
	}
}
