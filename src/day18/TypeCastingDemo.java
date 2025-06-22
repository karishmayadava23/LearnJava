package day18;

public class TypeCastingDemo {
	public static void main(String[] args) {
		// Upcasting
		int intValue = 100;
		long longValue = intValue;
		System.out.println(longValue);

		float floatValue = 10.1f;
		double doubleValue = floatValue;
		System.out.println(floatValue);
		System.out.println(doubleValue);

		// downcasting
		long longValue1 = 10000;
		System.out.println(longValue1);
		// int intValue1 = longValue1; // not possible we need to downcast
		int intValue1 = (int) longValue1;
		System.out.println(intValue1);

		double doubleValue1 = 1258999999999900.55;
		System.out.println(doubleValue1);
		float floatValue1 = (float) doubleValue1;
		System.out.println(floatValue1);

		System.out.println("some example");
		int i = 12;
		double d = i;// upcasting and double can hold integer value but integer cannot hold double
						// value
		System.out.println(d);

		double d1 = 12.33;
		// int i1 = d1;//throw compiletime error
		int i1 = (int) d1; // issue is that decimal part will be gone
		System.out.println(i1);

	}

}
