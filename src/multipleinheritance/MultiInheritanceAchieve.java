package multipleinheritance;

public class MultiInheritanceAchieve implements Interface3,Interface4

{

	public static void main(String[] args) 
	
	{
		MultiInheritanceAchieve i2= new MultiInheritanceAchieve();
		i2.demo1();
		i2.demo2();
		i2.demo3();
		i2.demo4();


	}

	@Override
	public void demo3() 
	{
		System.out.println("Demo3 from Interface4");
		
	}

	@Override
	public void demo4() 
	{
		System.out.println("Demo4 from Interface4");
		
	}

	@Override
	public void demo1() 
	{
		System.out.println("Demo1 from Interface3");
		
	}

	@Override
	public void demo2() 
	{
		System.out.println("Demo2 from Interface3");
		
	}

}
