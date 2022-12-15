package variabletypes;

public class LocalAndGlobalVariable 

{

	int a=100;//non-static global variable
	static int c=18;//static global variable

	public static void main(String[] args)
	
	{
		test1();//calling static method from same class
		LocalAndGlobalVariable lg= new LocalAndGlobalVariable();//created object of a class
		lg.test();////calling non-static method from same class
		System.out.println("Global value of a is "+lg.a);//calling non-static global variable from same class
		
		int sum=10+lg.a;//used non-static global variable from same class
		System.out.println("Sum is "+sum);
		System.out.println("Global value of c is "+c);//calling static global variable from same class
		int sub=90-c;//used static global variable from same class
		System.out.println("sub is "+sub);
		
		//=======================================================
		//calling global variables from another class
		//creating object of another class
		
		Demo d= new Demo();// created object of demo class
		//calling non static global variable from another
		System.out.println("calling non static global variable from another class "+d.x);
		int mul=10*d.x;//used non static global variable from another class
		System.out.println("Multiplication is "+mul);
		//calling static global variable from another
		System.out.println("calling static global variable from another class "+Demo.y);
		int div=100/Demo.y;//used static global variable from another class
		System.out.println("Div is "+div);
		}
	
		public void test()
		{
		int a=188;
		int b=90;//local variable
		System.out.println(a);
		System.out.println("Running non-static method test");
		}
		public static void test1()
		{
		//static int c=90;
		System.out.println("Running static method test1");
		}

	}


