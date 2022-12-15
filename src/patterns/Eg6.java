package patterns;

public class Eg6 
{

	public static void main(String[] args)
	{
		//    *
		//   * *
		//  * * *
		// * * * *
		//rows-->4 star-->1 space-->3

		int star=1;
		int space=3;
		
		int star1=4;
		int space1=0;

		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=space;j++)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
		System.out.print("* ");
		}
		System.out.println();
		star++;
		space--;
		}

		// * * * *
		//  * * *
		//   * *
		//    *
		//rows-->4 star-->4 space-->0
		
		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=space1;j++)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=star1;k++)
		{
		System.out.print("* ");
		}
		System.out.println();
		star1--;
		space1++;
		}

	}

}
