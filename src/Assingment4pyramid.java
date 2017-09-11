import java.io.*;
 

public class Assingment4pyramid
{
    
    public static void printTriangle(int n)
    {
      	for(int i=0;i<n;i++)
      	{
      		for(int j=n;j>i;j--)
      		{
      			System.out.print(" ");
      		}
      		for(int j=0;j<i;j++)
      		{
      			System.out.print("*");
      		}
      		System.out.println("");
      	}
      	
    }
    public static void main(String args[])
    {
    	printTriangle(6);
    }
    }
