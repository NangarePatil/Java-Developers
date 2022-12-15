package loops;

public class WhileLoop2 

{

	public static void main(String[] args) 
	
	{
		// I want table of 9
		//start-->9 condition--> <=90 updation-->i=i+9
		int i=9;
		while(i<=90)
		{
		System.out.println(i);
		i=i+9;
		}
		System.out.println("============");
		//// I want table of 9 in reverse order
		//start-->90 condition--> >=9 updation-->i=i-9
		int j=90;
		while(j>=9)
		{
		System.out.println(j);
		j=j-9;
		}

	}

}
