package logical;

import java.util.Scanner;

public class FactorialOfNumber
{

	public static void main(String[] args)
	{
		//3!=3*2*1=6
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();
		int mul=1;
		for(int i=number;i>=1;i--)//3,2,1,0
		{
		mul=mul*i;
		//3=1*3
		//6=3*2
		//6=6*1
		}
		System.out.println("Factorial of "+number+" is "+mul);
		


	}

}
