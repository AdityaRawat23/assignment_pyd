
public class assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="WK17H019";

		int length=str.length();
		System.out.println(length);

		char arr2[] =new char[length];
		char arr[]=str.toCharArray();
		for(int l=0;l<length;l++)
		{
			System.out.print(arr[l]);
		}
		System.out.println("");

		//Reverse logic
		for(int i=length-1,k=0;k<length;i--,k++)
		{
			arr2[k]=arr[i];
		}

		for(int l=0;l<length;l++)
		{
			System.out.print(arr2[l]);
		}
		//1st way
		String b=new String(arr2);
		System.out.println("");

		//2nd way
		str=String.valueOf(arr2);
		System.out.println("use of valueOf");
		System.out.println(b);
		System.out.println("use of new string");
		System.out.println(str);

		//*******************************************************************************************************************//

		//fetch only the numeral of the string	

		str="WK17H019";
		String s2=str.replaceAll("[a-z,A-Z]","").trim();

		System.out.println("numeral part of the string is:- ");
		System.out.println(s2);
		//******************************************************************************************************************//

		//Increment the number
		System.out.println("\n");
		str="WK17H001";
		//str="WK17H021";
		//str="WK17H000";
		//str="WK17H111";

		int p=Integer.parseInt(str.substring(5));
		p++;
		String s=String.valueOf(p);
		if(str.substring(5).equals("000"))
		{
			String nstr=str.replace(str.substring(8),s);
			System.out.println(nstr);
			System.exit(0);
		}
		else if(str.substring(5,7).equals("00"))
		{
			String nstr=str.replace(str.substring(7),s);
			System.out.println(nstr);
			System.exit(0);
		}
		else if(str.substring(5,6).equals("0"))
		{
			String nstr=str.replace(str.substring(6),s);
			System.out.println(nstr);
			System.exit(0);
		}
		else
		{
			String nstr=str.replace(str.substring(5),s);
			System.out.println(nstr);
			System.exit(0);
		}

	}
}