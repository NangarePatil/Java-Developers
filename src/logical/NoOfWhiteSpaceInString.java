package logical;

public class NoOfWhiteSpaceInString 
{

	public static void main(String[] args)
	{
		String a="P u ne";
		int count=0;
		for(int i=0;i<=a.length()-1;i++)//0,1
		{
		char t = a.charAt(i);//p
		char space=' ';
		if(t==space)
		{
		count++;//0,1
		}
		}
		System.out.println("Number of blank spaces in String are "+count);


	}

}
