class class1
{
		static int a=0;
		int b=1;
		static int c=4;
		final int d=0;

		void fun()
		{
			System.out.println(a);
		}
		static void fun1()
		{
			//throws an error that b should be static
			//System.out.println(b);

			System.out.println(c);
		}
}
final class def
{
	static final String color="white";
	String size="asda";
}

//final class cannot be inherited
//class ghi extends def{}

public class StaticNfinal{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//throws an error that function should be static
		//StaticNfinal.fun();

		//class can be called without object creation
		class1.fun1();
		
		System.out.println(def.color);
		
		//shoes error that remove final from color so that it can be changed
		//def.color="white";
		
		def obj=new def();
		
		//final cannot be assigned a value
		//obj.color="blue";
		
		
	}
}