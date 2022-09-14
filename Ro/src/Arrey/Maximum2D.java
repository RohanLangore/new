package Arrey;

public class Maximum2D {
	//here j=column and we are going monimum coloum wise
	public static void main(String[] args) {
		
		int arr[][] = { { 22, 20, 19 },
				        { 12, 25, 16 } };
		
		for (int i = 0; i < 3; i++) {
			int max = arr[0][i];
			
			for (int j = 1; j < 2; j++) {
				
				if (arr[j][i] > max) {
					max = arr[j][i];
				}
			}
			System.out.println(max);
		}
		
		
		
	}

}
