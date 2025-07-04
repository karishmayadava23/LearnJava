package learnArrays;

public class SingleDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration of Arrays

		// 1. First Approach
		int empId[] = new int[5];
		// store values
		empId[0] = 10;
		empId[1] = 20;
		empId[2] = 30;
		empId[3] = 40;

		// 2. Second Approach
		int machineId[] = { 10, 20, 30, 40 };

		// find length - length -> how many values we have stored.

		System.out.println("Length of an array:" + machineId.length);
		int a[] = {};
		System.out.println(a.length); // 0

		// Read single Value from array
		System.out.println(machineId[3]);

		System.out.println("Read array data from position 0 to 4");
		// Read all the values from an array
		for (int i = 0; i <= machineId.length - 1; i++) {
			System.out.println("value at index " + i + " : " + machineId[i]);
		}

		System.out.println("Read array data from position 4 to 0");
		// Let's read array data from backward such that at position from 4 to position0
		for (int i = machineId.length - 1; i >= 0; i--) {
			System.out.println("value at index " + i + " : " + machineId[i]);
		}

	}

}
