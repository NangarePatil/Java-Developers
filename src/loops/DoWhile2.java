package loops;

public class DoWhile2 

{

	public static void main(String[] args) 
	
	{
		// Write table of 8
		//start -->8 condition--> <=80 updation-->i=i+8
		int i=8;
		do
		{
		System.out.println(i);
		i=i+8;
		}
		while(i<=80);
		System.out.println("=============");
		// Write table of 8 in reverse order
		//start-->80 condition--> >=8 update-->j=j-8
		int j=80;
		do
		{
		System.out.println(j);
		j=j-8;//72
		}
		while(j>=8);

	}

}
