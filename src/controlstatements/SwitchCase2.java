package controlstatements;

public class SwitchCase2 

{

	public static void main(String[] args) 
	
	{
		//1--->Welcome to 1st year engg
		//2-->Welcome to 2nd year engg
		//3-->Welcome to 3rd year engg
		//4-->Welcome to 4th year engg
		// default-->
		int year=1;
		switch (year) 
		{
		case 1:System.out.println("Welcome to 1st year engg");
		break;
		case 2:System.out.println("Welcome to 2nd year engg");
		break;
		case 3: System.out.println("Welcome to 3rd year engg");
		break;
		case 4: System.out.println("Welcome to 4th year engg");
		break;
		default: System.out.println("Please enter value between 1-4");
		break;
		}


	}

}
