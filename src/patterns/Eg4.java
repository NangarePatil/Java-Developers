package patterns;

public class Eg4 {

	public static void main(String[] args)
	{
		// *****
		// ****
		// ***
		// **
		// *
		
		//rows-->5 star-->5 space-->0

		int star=5;
		int space=0;
		
		int space1=4;
		int star1=1;
		
		for (int i=1;i<=5;i++)
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
			space++;
			star--;
			
		}
		// *
		// **
		// ***
		// ****
		// *****
		//rows-->5 space-->4; star-->1
		
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=space1;j++)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=star1;k++)
		{
		System.out.print("*");
		}
		System.out.println();
		space1--;
		star1++;
		}
	}

}
