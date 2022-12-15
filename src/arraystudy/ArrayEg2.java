package arraystudy;

import java.util.Arrays;

public class ArrayEg2 

{

	public static void main(String[] args) 
	
	{
		//int rollNum[]=new int[6];//old type
		int rollNum[]= {60,10,30,40,20,50};//new type
		// char grade[]= {'A','B','C','D'};
		System.out.println("============================");
		for(int i=0;i<=rollNum.length-1;i++)
		{
		System.out.println(rollNum[i]);
		}
		System.out.println("============================");
		//======================================================
		//how to sort Array
		Arrays.sort(rollNum);
		System.out.println("Array in ascending order");
		for(int i=0;i<=rollNum.length-1;i++)
		{
		System.out.println(rollNum[i]);
		}
		System.out.println("============================");
		System.out.println("Array in descending order");
		for(int i=rollNum.length-1;i>=0;i--)
		{
		System.out.println(rollNum[i]);
		}
		System.out.println("============================");
		
		
		String animalNames[]= {"Zebra","Elephant","Eagle","Loin","Tiger"};
		Arrays.sort(animalNames);
		for(int i=0;i<=animalNames.length-1;i++)//0,1,....4,5
		{
		System.out.println(animalNames[i]);
		}
		System.out.println("============================");


	}

}
