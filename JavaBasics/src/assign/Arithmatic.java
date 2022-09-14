package assign;



public class Arithmatic {
	int a,b;
			int add (int a,int b)
			{
				return(a+b);
			}
			int sub (int a,int b)
			{
				return(a-b);
			}
			int mul (int a,int b)
			{
				return(a*b);
			}
			int div (int a,int b)
			{
				return(a/b);
			}
			
			public static void main(String[] args) {	
				Arithmatic k=new Arithmatic();
				System.out.println(k.add(10, 5));
				System.out.println(k.sub(10, 5));
				System.out.println(k.mul(10, 5));
				System.out.println(k.div(10, 5));

	}

}
