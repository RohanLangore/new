package wrapper;

public class Convert {
	int a=20;
	/*	void accept(int a)
		{
			a=this.a+a;
			System.out.println(a);
		}

		public static void main(String[] args) {
			Convert a1=new Convert();
			a1.accept(50);
			System.out.println(a1.a);*/
		
		             //ox2000
						void accept(Convert a) {
							this.a = this.a + 50;
							System.out.println(a.a);
						}

						public static void main(String[] args) {
							Convert a1 = new Convert();// ox2000
							a1.accept(a1);// memory allocation
							System.out.println(a1.a);

							Convert a2 = new Convert();
							a2.accept(a2);
							System.out.println(a2.a);
		
		

		}
}
