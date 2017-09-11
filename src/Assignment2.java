import java.util.Scanner;

public class Assignment2 {

	
	void add(double x,double y)
	{
		System.out.println(x+y);
	}
	void sub(double x,double y)
	{
		System.out.println(x-y);
	}
	void mul(double x,double y)
	{
		System.out.println(x*y);
	}
	void div(double x,double y)
	{
		System.out.println(x/y);
	}
	public static void main(String args[])
	{
		System.out.println("enter the two digits for operations to be performed");
		
		Scanner sc1=new Scanner(System.in);
		 
		Assignment2 ob2=new Assignment2();
		double x=sc1.nextInt();
	    double y=sc1.nextInt();
		ob2.add(x,y);
		ob2.sub(x,y);
		ob2.mul(x,y);
		ob2.div(x,y);
		
	}
}
