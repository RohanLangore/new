package Arrey;
import java.util.Arrays;
public class DDZerosFromNonZero {
	
	static void moveZerostofront(int inputArray[]) {
		int counter = 0;
		
		// Traversing inputArray from left to right
		for (int i = 0; i < inputArray.length; i++) {
			// If inputArray[i] is non-zero
			if (inputArray[i] != 0) {
				// Assigning inputArray[i] to inputArray[counter]
				inputArray[counter] = inputArray[i];
				// Incrementing the counter by 1
				counter++;
			}
		}
		// Assigning zero to remaining elements
		while (counter < inputArray.length) {
			inputArray[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(inputArray));
	}

	public static void main(String[] args) {
		moveZerostofront(new int[] { 12, 0, 7, 0, 8, 0, 3 });

	}
}
