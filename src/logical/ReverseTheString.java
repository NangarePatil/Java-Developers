package logical;

import java.util.Scanner;

public class ReverseTheString 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a String");
		String original = sc.next();
		String rev="";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			char t = original.charAt(i);
			rev=rev+t;
		}
        System.out.println(original.length());
		System.out.println("Original string is "+original);
		System.out.println("Reverse String is "+rev);
		
	}

}
