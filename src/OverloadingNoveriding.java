class classdemo
{
	void fun(int i,int j,int k)
	{
		System.out.println("inside first");
		System.out.println(i+j+k);
	}
	void fun(int i,int j)
	{
		System.out.println("inside second");
		System.out.println(i+j);
	}
	void fun(double i)
	{
		System.out.println("inside third");
		System.out.println(i);
	}

}
class parent
{
	void fun2()
	{
		System.out.println("parent class");
	}
}
class child extends parent
{
	void fun2()
	{
		System.out.println("over riden");
	}
}
public class OverloadingNoveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		classdemo obj1=new classdemo();
		obj1.fun(1,2);
		obj1.fun(2,3,4);
		obj1.fun(1.1);
		
		child obj2=new child();
		obj2.fun2();
	}

}
