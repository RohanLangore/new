package Arrey;

public class SumOfDigonal2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum = 0;	
		
		int[][] arr = {		{10, 25, 35},
							{45, 10, 65},
							{75, 85, 10}};
	
		for (i = 0; i < arr.length; i++) {
			sum = sum + arr[i][i];
		}
		System.out.println("The Sum of the Diagonal Items = " + sum);

		//for (int j = arr.length - 1; j >= 0; j--) {
		//	sum = sum + arr[j][j];
		//}
		//System.out.println("The Sum of the Diagonal Items = " + sum);

	}

}
