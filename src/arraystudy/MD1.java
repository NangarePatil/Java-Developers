package arraystudy;

public class MD1 

{

	public static void main(String[] args) 
	
	{
		int rollNum[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(rollNum[1][1]);
		System.out.println("=================================");
		for(int i=0;i<=2;i++)
		{
		for(int j=0;j<=2;j++)
		{
		System.out.print(rollNum[i][j]+" ");
		}
		System.out.println();
		}
		System.out.println("=================================");
		char grade[][]= {{'a','b','c'},{'d','e','f'}};
		for(int i=0;i<=1;i++)
		{
		for(int j=0;j<=2;j++)
		{
		System.out.print(grade[i][j]+" ");
		}
		System.out.println();
		}

		
		

	}

}
