import java.util.*;

class Calculator
{
	void add(double y, double z)
	{System.out.println(y+z);}
	
	void sub(double y,double z)
	{System.out.println(y-z);}
	
	void mul(double y,double z)
	{System.out.println(y*z);}
	
	void div(double y,double z)
	{System.out.println(y/z);}
	}


public class Assignment1 {

	public static void main(String args[])
	{
		 System.out.println("enter the operation you want to do");
		 System.out.println("press 1 for ADDITION");
		 System.out.println("press 2 for SUBSTRACTION");
		 System.out.println("press 3 for MULTIPLICATION");
		 System.out.println("press 4 for DIVISION");
		 
		 
		 Scanner sc1=new Scanner(System.in);
		 
		 int x=sc1.nextInt();
		 System.out.println("enter the digits you want to perform operation on");
		 double y=sc1.nextInt();
		 double z=sc1.nextInt();
		 
		 Calculator ob1=new Calculator();
		 if(x==1)
		 {
			 ob1.add(y,z);
		 }
		 else if(x==2)
		 {
			 ob1.sub(y,z);
		 }
		 else if(x==3)
		 {
			 ob1.mul(y,z);
		 }
		 else if(x==4)
		 {
			 ob1.div(y,z);
		 }
		 else
		 {
			 System.out.println("wrong input");
		 }
		 
		
	}
}
