package patterns;

public class Eg3 
{

	public static void main(String[] args) 
	{
		// *
		// **
		// ***
		// ****
		// *****
		//rows-->5, 1st row condition star=1
		
		int star=1;
		int star1=5;
		
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}

		// *****
		// ****
		// ***
		// **
		// *

		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=star1;j++)//5
		{
		System.out.print("*");
		}
		System.out.println();
		star1--;
		}
	}

}
