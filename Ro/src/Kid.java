

public class Kid {

		
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
			Kid k=new Kid();
			k.mul();
			k.squ(10);
			System.out.println(k.squ());
			System.out.println(k.mul(10));
			
	}

}
