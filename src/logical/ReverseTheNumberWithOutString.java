package logical;

public class ReverseTheNumberWithOutString 
{

	public static void main(String[] args)
	{
		int orgNumber=1234;
		int revNumber=0;
		// System.out.println(orgNumber/10);
		// System.out.println(orgNumber%10);
		for(int i=orgNumber;i>0;i=i/10)//1234,123,12,1
		{
		int rem = i%10;//4,3,2,1
		revNumber= revNumber*10+rem;
		//4=0*10+4
		//43=4*10+3
		//432=430+2
		//4321=4320+1
		// System.out.print(rem);
		}
		System.out.println(revNumber);


	}

}
