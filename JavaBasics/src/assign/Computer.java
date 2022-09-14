package assign;

public class Computer {
	String cBrand;
	int price;
	Printer p;//ox2000
	
	Computer(String cBrand,int price,Printer p)
	{
		this.cBrand=cBrand;
		this.price=price;
		this.p=p;
	}
	
	void display()
	{
		System.out.println("computer brand "+cBrand);
		System.out.println("price is... "+price);
		p.show();
	}

	public static void main(String[] args) {
		Printer p=new Printer("Epson","black",8000);//0x200
		Computer c=new Computer("DeLL",45000,p);
		c.display();
	}

}
