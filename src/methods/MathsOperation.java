package methods;

public class MathsOperation 

{

	public static void main(String[] args) 
	
	{
		MathsOperation mo= new MathsOperation();//created object of a class
		mo.addition();
		mo.substraction();
		addition1();
		substraction1();


	}

	public void addition()
	{
	int a=90;
	int b=10;
	int sum=a+b;
	System.out.println("Addition is "+sum);
	}
	public void substraction()
	{
	int a=90;
	int b=10;
	int sub=a-b;
	System.out.println("Substraction is "+sub);
	}
	public static void addition1()
	{
	int a=0;
	int b=10;
	int sum=a+b;
	System.out.println("Addition is "+sum);
	}
	public static void substraction1()
	{
	int a=0;
	int b=10;
	int sub=a-b;
	System.out.println("Substraction is "+sub);
	}

}
