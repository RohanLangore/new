package Arrey;

public class SumOfRowCol2d {

	public static void main(String[] args) {
		int arr[][] = { { 0, 5, 0 },
						{ 0, 0, 6 },
						{ 7, 0, 6 } };
		int row, col;
		int rowSum[] = new int[3];
		int colSum[] = new int[3];
		for (row = 0; row < 3; row++) {
			for (col = 0; col < 3; col++) {
				rowSum[row] += arr[row][col];
				colSum[row] += arr[col][row];
			}
		}
		System.out.println( "              -                 ");
		
		for (row = 0; row < 3; row++) {

			System.out.print("\n");
			for (col = 0; col < 3; col++) {
				System.out.print(arr[row][col] + " ");
			}
		}
		System.out.println( "             -                  ");
		
		for(row=0;row<3;row++)
        {
            System.out.print("\nSum of "+(row+1)+" row = "+rowSum[row]);
            System.out.print("\nSum of "+(row+1)+" column = "+colSum[row]);
        }
	}

}
