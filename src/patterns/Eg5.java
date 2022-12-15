package patterns;

public class Eg5 
{

	public static void main(String[] args)
	{
		// *******
		// *****
		// ***
		// *
		//rows-->4 star-->7 space-->0
		//outer for loop-->rows

		int space=0;
		int star=7;
		int star1=1;
		int space1=3;

		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space++;
		}
		
		// *
		// ***
		// *****
		// *******
		//rows--4; star-->1; space-->3
		
		for(int i=1;i<=4;i++)
		{
		//for loop for space
		for(int j=1;j<=space1;j++)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=star1;k++)
		{
		System.out.print("*");
		}
		System.out.println();
		star1=star1+2;
		space1--;
		}
	}

}
