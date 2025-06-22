package exceptionDemo;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		System.out.println("Program is starting...");
		String s = null;
		try {
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println(e.getStackTrace());

		} catch (NullPointerException e) {
			// System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());

		} catch (NumberFormatException e) {
			System.out.println(e.getStackTrace());
			// System.out.println(e.getMessage());
			// System.out.println(e.getLocalizedMessage());

		}

		System.out.println("Program is finished...");

	}

}
