package constructor;

public class CC 

{

	int a;
	int b;
	public CC()//user defined constructor-with zero/no parameter
	{
	System.out.println("HI i am constructor");
	a=10;
	b=90;
	}
	public static void main(String[] args) 
	
	{
		CC c= new CC();// created object of a class
		c.addition();

	}

	// public CC()//default constructor-->provided by compiler at the compilation time
	// {
	// System.out.println("HI i am constructor");
	// }
	public void addition()
	{
	int sum=a+b;
	System.out.println("Addition is "+sum);
	System.out.println("Hi i am test method");
	}
}
