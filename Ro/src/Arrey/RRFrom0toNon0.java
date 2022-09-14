package Arrey;

import java.util.Arrays;

public class RRFrom0toNon0 {
	public static void main(String[] args) {
		int inputArray[] = { 12, 0, 7, 0, 8, 0, 3 };
		int counter = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter++;
			}
		}
		while (counter < inputArray.length) {
			inputArray[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(inputArray));
	}
}
//https://github.com/RohanLangore/java.git