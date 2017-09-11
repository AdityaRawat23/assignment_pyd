
class abc
{
	void dce(int d)
	{
		if(d>=3)
		{
			System.out.println("wrong option");
			System.exit(0);
		}
		switch(d){

		case 1:System.out.println("let the initial amount be Rs.30");

		int acc_bal=30;

		int tranfer_money=0;
		while(tranfer_money<50000)
		{
			acc_bal=acc_bal+10000;
			tranfer_money=tranfer_money+10000;
			System.out.println(acc_bal);
		}		
		break;

		case 2:
			System.out.println("let the initial value be Rs.40");
			acc_bal=40;

			tranfer_money=0;
			do
			{
				acc_bal=acc_bal+10000;
				tranfer_money=tranfer_money+10000;
				System.out.println(acc_bal);
			}while(tranfer_money<50000);

			break;
		default:
			System.out.println("this is the default section");
		}
	}
}
public class Assignment13 {

	public static void main(String args[])
	{
		System.out.println("press 1 for while loop and 2 for do-while loop");
		int d=1;

		abc ob1=new abc();
		ob1.dce(d);
		d=2;
		ob1.dce(d);




	}
}

