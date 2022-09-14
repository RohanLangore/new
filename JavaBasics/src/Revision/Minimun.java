package Revision;

public class Minimun {

	public static void main(String[] args) {
		//45612
		int num=45612;
		int rem,min=num%10;
		num=num/10;
		
		while(num>0) {
			rem=num%10;
			num/=10;
			if(rem<min) {
				min=rem;
			}
		}
		
		
		System.out.println(min);
	}

}
