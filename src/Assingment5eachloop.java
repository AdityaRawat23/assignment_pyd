import java.util.Scanner;

public class Assingment5eachloop {

	public static void main(String args[])
	{
		System.out.println("enter the number of employee ");
		Scanner sc1=new Scanner(System.in);
		 int x=sc1.nextInt();
		 
		String arr[]=new String[x];
		
		for(int i=0;i<x;i++)
		{
			arr[i]=sc1.nextLine();
		}
		
		for(String y:arr)
		{
			System.out.println(y);
		}
	}
}
