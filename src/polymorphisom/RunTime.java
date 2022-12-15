package polymorphisom;

public class RunTime 

{

	public static void main(String[] args) 
	
	{
		//Acquiring super class method into sub class with the help of extends 
		//keyword & changing implementation/definition according to subclass specification is 
		//called method overriding
		A a = new A();
		B b = new B();
		a.wish();
		b.wish();

	}

}
