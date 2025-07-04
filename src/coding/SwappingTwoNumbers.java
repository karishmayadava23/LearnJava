package coding;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		/**
		 * we have two inputs a = 40 and b = 30 And our expected output should be a = 30
		 * and b = 40 Let's start
		 */
		// Input
		int a = 40;
		int b = 30;

		System.out.println("Before swapping values:" + "a= " + a + " and b= " + b);

//		// Logic1 - Using 3rd Variable
//		int c = a;
//		a = b;
//		b = c;
//		System.out.println("After swapping values:" + "a= " + a + " and b= " + b);

		// Logic2 - Using + and - operator i.e. without using 3rd variable
//		a = a + b; // 40+30 = 70
//		b = a - b; // 70 - 30 = 40
//		a = a - b; // 70 - 40 = 30
//		System.out.println("After swapping values:" + "a= " + a + " and b= " + b);

		// Logic3 - Using * and / operatore i.e. without using 3rd variable
		/*
		 * This logic works only when a and b value is not zero. As any number divded by
		 * 0 will give Airthmetic Exception
		 */
		a = a * b; // 40*30 = 1200
		b = a / b;// 1200/30 = 40
		a = a / b; // 1200/40 = 30;
		System.out.println("After swapping values:" + "a= " + a + " and b= " + b);

	}

}
