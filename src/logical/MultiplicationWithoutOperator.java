package logical;

public class MultiplicationWithoutOperator 
{

	public static void main(String[] args) 
	{
		int a=15;
		int b=20;
		int sum=0;
		//5+5+5 3+3+3+3+3
		for(int i=1;i<=b;i++)//1,2,3,4
		{
		sum=sum+a;
		//5=0+5;
		//10=5+5;
		//15=10+5;
		}
		System.out.println(sum);


	}

}
