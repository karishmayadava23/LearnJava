package learnArrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a[] = { 'A', 100, 23.14, "Jack" };

		System.out.println("using normal for loop");
		// using normal for loop
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}

		System.out.println("Using Enhanced for loop.");
		// using enhanced for loop
		for (Object x : a) {
			System.out.println(x);
		}

	}

}
