package day18;

public class TypeCastingObject3 {
	public static void main(String[] args) {
//e.g.1
//		Object o = new String("Welcome");// Valid
//		StringBuffer sb = (StringBuffer) o; //Rule 3 fails
//		
		// e.g.2
//		String s = new String("Welcome");
//		StringBuffer sb1 = (StringBuffer) s; // Rule 1 fails and gives compile time error

//		// e.g.3
//		Object o = new String("Welcome");
//		StringBuffer sb = (String) o;// Invalid Rule2 fails
//		// e.g.4
//		String s = new String("Welcome");
//		StringBuffer sb = (String) s; // Rule2 is failed

		// e.g.5
		Object o = new String("Welcome");
		String s = (String) o;// All Rules is followed
		System.out.println(s);

	}

}
