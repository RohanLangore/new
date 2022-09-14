package assign;

public class Squre {
	
		void mul ()
		{int a=10;
	    	int b=a*a;
	    	System.out.println(b);
		}
	 	
		int squ ()
		{int a=10;
			return(a*a);}
		
	    void squ (int a)
		{int b=a*a;
		System.out.println(b);
		}
	    
		int mul (int a)
		{return(a*a);}
		
		
		public static void main(String[] args) {	
			Squre k=new Squre();
			k.mul();
			k.squ(10);
			System.out.println(k.squ());
			System.out.println(k.mul(10));

	}

}
