package exception;

public class ExceptionEg1 
{

	public static void main(String[] args) 
	{
	
		int a=10;
		int b=0;
		
		try 
		{
			System.out.println(a/b);//risky code
		} 
		
		catch (Exception e) 
		{
		System.out.println("We cant divide by zero");
		}

		System.out.println("Good Evening");
	}

}
