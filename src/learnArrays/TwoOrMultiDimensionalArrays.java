package learnArrays;

public class TwoOrMultiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare 2d-array

		// first approach
		int rollNo[][] = new int[3][2];
		// int [][]rollNo = new int[3][2]; This is also correct
		// int []rollNo[] = new int[3][2]; This is also correct
		// 3 is row and 2 is column and index for both row and col starts with index
		rollNo[0][0] = 100;
		rollNo[0][1] = 200;

		rollNo[1][0] = 100;
		rollNo[1][1] = 200;

		rollNo[2][0] = 100;
		rollNo[2][1] = 200;

		// 2nd Approach
		int machineId[][] = { { 100, 400 }, { 200, 300 }, { 300, 500 } };

		// find length of array
		System.out.println("length of rows: " + machineId.length);
		System.out.println("length of colum: " + machineId[0].length);

		// Find single value from array
		System.out.println("Value of the first row first col: " + machineId[0][0] + "," + machineId[0][1]);

		// Find multiple values from array
		for (int i = 0; i <= machineId.length - 1; i++) {
			for (int j = 0; j <= machineId[i].length - 1; j++) {
				System.out.println("Value of 2d-array: " + i + " " + j + ": " + +machineId[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("Using Enhanced for loop");
		// enhanced for loop
		for (int arr[] : machineId) {
			for (int x : arr) {
				System.out.println(x);
			}
		}
	}
}
