package exceptionDemo;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("Program is starting...");
		String s = null;
		try {
			System.out.println(s.length());
		}
		// 1. Exception occured,Catch Handles the exception
//		catch (NullPointerException e) {
//			System.out.println(e.getMessage());
//	} 
		// 2. Exception occured,Catch does not Handles the exception //other statement
		// do not execute after exception not handled
		// But finally block will execute
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());

		}
		// 3. Exception does not occur, catch ignores and finally will occur

		finally {
			System.out.println("You enter finally block.");

		}

		System.out.println("Program is finished...");

	}

}
