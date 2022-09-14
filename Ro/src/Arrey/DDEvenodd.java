package Arrey;
import java.util.Arrays;
public class DDEvenodd {
	
	 static void evenOdd(int[] data) {
		int leftSide = 0;
		int rightSide = data.length - 1;

		while (rightSide >= leftSide) {
			
			if (data[leftSide] % 2 == 1 && data[rightSide] % 2 == 0) 
			{
				// swapping as soon as we find even and odd combination
				
				swappEvenOdd(data, leftSide, rightSide);
				leftSide++;
				rightSide--;
			}
			else 
			{
					if (data[leftSide] % 2 == 0) {
					leftSide++;
					}
					if (data[rightSide] % 2 == 1) {
					rightSide--;
					}
			}   
		}
	}

	 static void swappEvenOdd(int[] data, int left, int right) {
		// swapping even and odd numbers
		int temp = data[left];
		data[left] = data[right];
		data[right] = temp;
	}
	
public static void main(String args[]) {
		
		int[] array = { 12, 34, 45, 9, 8, 90, 3 };
		evenOdd(array);
		System.out.println(Arrays.toString(array));
	}
}