package controlstatements;

public class SwitchCase 
{

	public static void main(String[] args) 
	
	{
		//A-->8-10
		//B-->6-8
		//C-->4-6
		//fail
		char grade='Z'; 
		switch (grade) 
		{
		case 'A':System.out.println("Your marks range is 8-10");
		break;
		case 'B':System.out.println("Your marks range is 6-8");
		break;
		case 'C': System.out.println("Your marks range is 4-6");
		break;
		default:System.out.println("You are fail");
		break;
		}


	}

}
