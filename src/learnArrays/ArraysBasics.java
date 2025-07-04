package learnArrays;

public class ArraysBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration of arrays
		int rollNo[] = new int[5];
		rollNo[0] = 10;
		System.out.println(rollNo[1]);
		rollNo[4] = 20;
		System.out.println(rollNo[4]);

		// ArrayIndexOutOfBoundsException
		// rollNo[5] = 9;
		System.out.println(rollNo.length);

	}

}
