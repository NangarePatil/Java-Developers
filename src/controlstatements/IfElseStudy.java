package controlstatements;

public class IfElseStudy 

{

	public static void main(String[] args) 
	
	{
		// if marks greater than or equal 40 then i am Pass, else I am fail
		// if(condition)
		// {
		// //block of statements
		// }
		// else
		// {
		// //block of statements
		// }
		int marks=9;
		if(marks>=40)
		{
		System.out.println("I am pass");
		}
		else
		{
		System.out.println("I am fail");
		}
		//====================================================
		//if temp is greater than 28.9 turn on AC else turn of AC
		//if gender is M--> I am male else --> I am female
		//if City is Pune -->Visit ShanivarVada-->else you are not in Pune
		String city="Pune";
		if(city=="Pune")
		{
		System.out.println("Visit ShanivarVada");
		}
		else
		{
		System.out.println("you are not in Pune");
		}

	}

}
