package logical;

import java.util.Scanner;

public class userInput 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a values");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		int c=a+b;
		System.out.println("sum is "+c);

		System.out.println("=====================");
		
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println("Your name is "+name);
	}

}
