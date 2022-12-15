package logical;

import java.util.Scanner;

public class Palindrome
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a String");
		String original=sc.next();
		String rev="";
		for(int i=original.length()-1;i>=0;i--)
		{
		char t = original.charAt(i);
		rev= rev+t;
		}
		System.out.println("Original String is "+original);
		System.out.println("Reverse String is "+rev);
		if(original.equals(rev))
		{
		System.out.println("String is Palindrome");
		}
		else
		{
		System.out.println("String is not Palindrome");
		}

	}

}
