package interfaceStudy;

public class IC1 implements Interface2

{

	public static void main(String[] args) 
	
	{
		IC1 i1= new IC1();//created object of implementation class
		i1.test1();
		i1.test2();
		i1.test3();
		i1.test4();

	}

	@Override
	public void test1() 
	{
		System.out.println("Test1 method from Interface1");
		
	}

	@Override
	public void test2() 
	{
		System.out.println("Test2 method from Interface1");
		
	}

	@Override
	public void test3() 
	{
		System.out.println("Test3 method from Interface2");
		
	}

	@Override
	public void test4() 
	{
		System.out.println("Test4 method from Interface2");
		
	}

}
