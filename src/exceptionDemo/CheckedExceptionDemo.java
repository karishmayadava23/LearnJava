package exceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Program is started.");
		System.out.println("Program is Inprogress.");

		// Now I want to wait for 5secs and then execute my below code
//		try {
		// Thread.sleep(5000);}
//		try {
//			FileInputStream fis = new FileInputStream("C:\\TEXT.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// Thread is Java class and we have built in method sleep which take time in ms.

		// using throws keyword
		Thread.sleep(5000);
		FileInputStream fis = new FileInputStream("C:\\TEXT.txt");
		System.out.println("Program is Completed.");
		System.out.println("Program is exited.");

	}

}
