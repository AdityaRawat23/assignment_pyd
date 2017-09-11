
class add1
{
	void add(int y, int z)
	{System.out.println("addition    "+(y+z));}
}
class sub1
{
	void sub(int y,int z)
	{System.out.println("substaction "+(y-z));}
}
class mul1
{
	void mul(int y,int z)
	{System.out.println("substaction "+(y*z));}
}
class div1
{
	void div(int y,int z)
	{System.out.println("substaction "+((double)y/z));}
}
public class Assignment8 {

	public static void main(String args[])
	{

		System.out.println("enter the digits you want to perform operation on");
		int y=5;
		int z=6;
		System.out.println(y);
		System.out.println(z);
		add1 ob1=new add1();
		sub1 ob2=new sub1();
		mul1 ob3=new mul1();
		div1 ob4=new div1();
		ob1.add(y, z);
		ob2.sub(y, z);
		ob3.mul(y, z);
		ob4.div(y, z);
	}
}

