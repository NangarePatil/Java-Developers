package exception;

public class ExceptionEg2 
{

	public static void main(String[] args) 
	{
		String s="Marul Have";
		
		try 
		{
			System.out.println(s.charAt(10));
		} 
		catch (NullPointerException e) 
		{
			System.out.println("we cant work on null values");
		}

		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("Please enter valid index");
		}
	}

}
