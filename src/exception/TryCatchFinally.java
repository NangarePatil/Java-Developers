package exception;

public class TryCatchFinally 
{

	public static void main(String[] args) 
	{
		String s="ak";
		try
		{
		System.out.println(s.charAt(3));
		} 
		catch (NullPointerException e)
		{
		System.out.println("We cant work on null values");
		}
		catch (StringIndexOutOfBoundsException e) 
		{
		System.out.println("you enter value less than"+s.length());
		}
		finally
		{
		System.out.println("Hi Good Evening ");
		}


	}

}
