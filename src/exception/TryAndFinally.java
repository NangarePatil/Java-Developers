package exception;

public class TryAndFinally 
{

	public static void main(String[] args)
	{
		String s="Maharashtra";//null
		try
		{
		System.out.println(s.charAt(4));
		} 
		finally
		{
		System.out.println("Hi Good evening");
		}
	}

}
