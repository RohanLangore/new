package Arrey;

import java.util.Arrays;

public class RREvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 12, 34, 45, 9, 8, 90, 3 };
		int leftSide = 0;
		int rightSide = array.length - 1;
		
		while (rightSide >= leftSide) {
			
			if (array[leftSide] % 2 == 1 && array[rightSide] % 2 == 0) {
				// swapping as soon as we find even and odd combination
				
				int temp = array[leftSide];
				array[leftSide] = array[rightSide];
				array[rightSide] = temp;

				leftSide++;
				rightSide--;
			}  
			else {
						if (array[leftSide] % 2 == 0) {
							leftSide++;
						}
						if (array[rightSide] % 2 == 1) {
							rightSide--;
						}
					}
		}
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
	}
}
