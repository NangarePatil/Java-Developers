package logical;

import java.util.Scanner;

public class ReverseTheNumberUsingString 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int orgNumber = sc.nextInt();
		String orgString = Integer.toString(orgNumber);
		String revString="";
		for(int i=orgString.length()-1;i>=0;i--)
		{
		char t = orgString.charAt(i);
		revString=revString+t;
		}
		System.out.println(revString);
		int revNumber = Integer.parseInt(revString);
		System.out.println("Given number is "+orgNumber);
		System.out.println("Reverse number is "+revNumber);


	}

}
