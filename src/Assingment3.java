
class Calculatorr
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


public class Assingment3 {

	public static void main(String args[])
	{
		 System.out.println("enter the operation you want to do");
		 System.out.println("press 1 for ADDITION");
		 System.out.println("press 2 for SUBSTRACTION");
		 System.out.println("press 3 for MULTIPLICATION");
		 System.out.println("press 4 for DIVISION");
		 
		 
		
		 
		 int x=3;
		 if(x>=5)
		 {
			 System.out.println("wrong selection");
			 System.exit(0);
		 }
		 System.out.println("enter the digits you want to perform operation on");
		 double y=6;
		 double z=7;
		 System.out.println(y);
		 System.out.println(z);
		 Calculatorr ob1=new Calculatorr();
		 switch(x)
		 {
		 case 1:
			 ob1.add(y,z);
			 break;
		 case 2:
			 ob1.sub(y,z);
			 break;
		 case 3:
			 ob1.mul(y,z);
			 break;
		 case 4:
			 ob1.div(y,z);
			 break;	
		 }
	}
}
