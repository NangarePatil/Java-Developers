package controlstatements;

public class NestedIfElse 

{

	public static void main(String[] args) 
	
	{
		String UID="Velocity";
		String PWD="Velocity@123";
		if(UID=="Velocity")
		{
		System.out.println("correct user ID");
		if(PWD=="Velocity@123")
		{
		System.out.println("correct password-->login successful");
		}
		else
		{
		System.out.println("please check you password,unable to login");
		}
		}
		else
		{
		System.out.println("incorrect user ID");
		}

	}

}
