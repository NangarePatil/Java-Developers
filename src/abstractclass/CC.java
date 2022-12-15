package abstractclass;

public class CC extends Test
{

	public static void main(String[] args) 
	
	{
		//create object of concrete class
		CC c= new CC();//created object of concrete class
		c.demo();
		c.demo1();
		c.demo2();

		
		
		
	}

	private void demo2() 
	{
		System.out.println("Demo2 method from concrete class");

		
	}

	@Override
	public void demo() 
	{
		System.out.println("Demo method completed in concrete class");

		
	}

	@Override
	public void demo3() 
	{
		System.out.println("Demo3 method completed in concrete class");

		
	}

}
