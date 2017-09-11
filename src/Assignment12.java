
public class Assignment12 {

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

				continue;

			else if(arr[i]>='x')

				continue;
			else
				System.out.println(arr[i]);
		}

	}
}
