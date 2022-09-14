package Arrey;

public class MinimumbyRow2D {

	//here j is row and we are going monimum row wise
		public static void main(String[] args) {
			
			
			int arr[][] = { { 22, 20, 19 },
					        { 21, 26, 18 },
					        { 12, 25, 16 } };

			for (int i = 0; i < 3; i++) {
			
				 int min = arr[i][0];
				for (int j = 1; j < 3; j++) {
				
					if (arr[i][j] < min) {
						min = arr[i][j];
					}
					
					
				}
				System.out.println(min);
			}

	}

}
