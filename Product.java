class Product
{
	int pcode,price;
	String pname;
	void read(int pc,int pr,String pn)
	{
		pcode=pc;
		price=pr;
		pname=pn;
	}
	void dis()
	{
		System.out.println(pcode+" "+price+" "+pname);
	}
	public static void main(String arg[])
	{
		Product ob1=new Product();
		ob1.read(1,30000,"Realme");
		ob1.dis();
		Product ob2=new Product();
		ob2.read(2,50000,"Iphone");
		ob2.dis();
		Product ob3=new Product();
		ob3.read(3,15000,"Samsung");
		ob3.dis();
		if(ob1.price<ob2.price && ob1.price<ob3.price)
		{
			System.out.println("realme has low price");
		}
		else if(ob2.price<ob3.price)
		{
			System.out.println("iphone has low cost");
		}
		else
		{
			System.out.println("samsung has low cost");
		}
	}
}
