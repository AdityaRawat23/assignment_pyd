
class Calculator3
{
	int y=5,z=9;
	void cal(int x)
	{
		switch(x)

		{
		case 1:
			System.out.println(y+z);
			break;
		case 2:
			System.out.println(y-z);
			break;
		case 3:
			System.out.println(y*z);
			break;
		case 4:
			System.out.println((double)y/z);
			break;	
		}
	}
}


public class Assignment10 {

	public static void main(String args[])
	{
		System.out.println("enter the operation you want to do");
		System.out.println("press 1 for ADDITION");
		System.out.println("press 2 for SUBSTRACTION");
		System.out.println("press 3 for MULTIPLICATION");
		System.out.println("press 4 for DIVISION");



		System.out.println("enter the digits you want to perform operation on");


		Calculator3 ob1=new Calculator3();
		ob1.cal(1);
		ob1.cal(2);
		ob1.cal(3);		 	
		ob1.cal(4);
	}
}
