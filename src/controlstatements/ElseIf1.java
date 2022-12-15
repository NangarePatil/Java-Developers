package controlstatements;

public class ElseIf1 
{

	public static void main(String[] args)
	
	{
		float percentile=8.3f;
		
		if(percentile>=8 & percentile<=10)
		{
		System.out.println("A grade");
		}
		else if (percentile>=6 & percentile<8)
		{
		System.out.println("B grade");
		}
		else if (percentile>=4 & percentile<6)
		{
		System.out.println("C grade");
		}
		// else if (percentile<4)
		// {
		// System.out.println("D grade");
		// }
		else
		{
		System.out.println("D grade");
		}


	}

}
