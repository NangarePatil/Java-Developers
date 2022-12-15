package arraystudy;

public class ArrayEg1 

{

	public static void main(String[] args) 
	
	{
		//I want to store player names
		//1. array declaration 
		String pNames[]=new String[6];
		//2. array initialization
		pNames[0]="Sachin";
		pNames[1]="Virendra";
		pNames[2]="Rahul";
		pNames[3]="MSD";
		//3. array usage
		System.out.println("========================");
		System.out.println(pNames[0]);
		System.out.println(pNames[1]);
		System.out.println(pNames[2]);
		System.out.println(pNames[3]);
		System.out.println(pNames[4]);
		//System.out.println(pNames[-1]);//ArrayIndexOutOfBoundsException
		//System.out.println(pNames[14]);//ArrayIndexOutOfBoundsException
		System.out.println("========================");
		System.out.println("Array travesing using static for loop");
		//use of for loop for array traversing
		for(int i=0;i<=4;i++)
		{
		System.out.println(pNames[i]);
		}
		System.out.println("========================");
		System.out.println("Array travesing using dynamic for loop");
		//use of for loop for array traversing
		for(int i=0;i<=pNames.length-1;i++)
		{
		System.out.println(pNames[i]);
		}
		System.out.println("========================");
		System.out.println("Array travesing in reverse orderusing dynamic for loop");
		//use of for loop for array traversing
		for(int i=pNames.length-1;i>=0;i--)
		{
		System.out.println(pNames[i]);
		}
		System.out.println("========================");
		//====================================================================


	}

}
