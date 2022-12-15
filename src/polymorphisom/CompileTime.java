package polymorphisom;

public class CompileTime 

{

	//Declaring multiple methods with same method name but with different argument in a 
	//same class is called method overloading
	public static void main(String[] args)
	
	{
		CompileTime c= new CompileTime();// created object of a class
		c.add();
		c.add(12, 23);

	}

	public void add()// method with same name with no parameter
	{
	int a=10;
	int b=100;
	int sum=a+b;
	System.out.println("Sum is "+sum);
	}
	public void add(int a, int b)// method with same name diff parameter
	{
	int sum=a+b;
	System.out.println("Sum is "+sum);
	}
}
