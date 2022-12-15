package methods;

public class Revision 

{

	public static void main(String[] args) 
	
	{
		Revision r= new Revision();// created object of same class
		r.test1();// calling non-static method from same class 
		test2();// calling static method from same class
		//to call non static method from class--> create object of that class
		Revision1 r1= new Revision1();// created object of another class
		r1.test3();// calling non static method from another class
		Revision1.test4();// calling static method from another class
		}
		// non static regular method
		public void test1()
		{
		System.out.println("hi am Test1 non static method from same class");
		}
		// static regular method
		public static void test2()
		{
		System.out.println("hi am Test2 static method from same class");
		}

	}


