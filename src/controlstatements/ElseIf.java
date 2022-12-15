package controlstatements;

public class ElseIf 

{

	public static void main(String[] args) 
	{
		float marks=2f;
		if(marks>=66.66)
		{
		System.out.println("I am in Dist");
		}
		else if (marks>=60) 
		{
		System.out.println("I am in 1st class");
		}
		else if (marks>=50)
		{
		System.out.println("I am in 2nd class");
		}
		else if (marks>=40)
		{
		System.out.println("I am just pass");
		}
		// else if (marks<40) 
		// {
		// System.out.println("I am fail");
		// }
		else
		{
		System.out.println("I am fail");
		}


	}

}
