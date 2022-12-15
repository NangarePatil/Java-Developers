package stringmethods;

public class ReverseString 
{

	public static void main(String[] args) 
	
	{
		String s= "nitin";
		String temp="";
		for(int i=s.length()-1;i>=0;i--)//7,6,5---,0
		{
		temp=temp+s.charAt(i);
		//temp=""+y-->y
		//yt=y+t
		//yti=yt+i
		}
		System.out.println(temp);
		if(temp.equals(s))
		{
		System.out.println("String is palindrome");
		}
		else
		{
		System.out.println("String is not palindrome");
		}

	}

}
