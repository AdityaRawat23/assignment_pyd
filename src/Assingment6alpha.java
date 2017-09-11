
public class Assingment6alpha {

	public static void main(String args[])
	{
		char arr[]=new char[26]; int j=0;
		for(int i=97;i<=122;i++)
		{
			arr[j]=(char)i;
			j++;
		}
		for(int i=0;i<26;i++)
		{
			if(arr[i]=='p'||arr[i]=='v')
			//{System.out.println("");}
				continue;
			//else if(arr[i]=='x'||arr[i]=='y'||arr[i]=='z')
			else if(arr[i]>='x')
			//{System.out.println("");}
				continue;
			else
			System.out.println(arr[i]);
		}
		
	}
}
