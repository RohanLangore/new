package Arrey;

public class Duplicate1 {
	public static void main(String[] args) {
		/*
		 * int arr[]= {1,2,1,3,2,1,4,2,1,1,2,2};
		 *  int i,j;
		 * for( i=0;i<arr.length;i++)
		 *  { int count=0; for( j=i+1;j<arr.length;j++) {
		 * if(arr[i]==arr[j] )
		 *  { count++; //1 2 0 3 2 0 4 2 0 0 2 2 arr[j]=0; } }
		 * if(arr[i]!=0 && count>1)
		 *  { System.out.println(arr[i]+"--->"+count); } }
		 */

		int arr[] = { 1, 2, 1, 3, 1, 3, 5 };
		boolean visited;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			visited = false;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					visited = true;
					count++;

				}
			}

			if (visited == true && count > 0) {
				System.out.println(arr[i] + "--->" + count);
			}
		}

	}
}
