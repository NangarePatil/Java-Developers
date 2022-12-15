package accessspecifiers;

public class Demo
{

	public static void main(String[] args)
	
	{
		Demo d= new Demo();
		d.test1();//calling private method within class
		d.test2();//calling default method within class
		d.test3();//calling protected method within class
		d.test4();//calling public method within class
		System.out.println("calling private data member "+d.a);
		System.out.println("calling default data member "+d.b);
		System.out.println("calling protected data member "+d.c);
		System.out.println("calling public data member "+d.d);

	}

	private int a=10;//private data member access-->within class only
	int b=20;//default data member access-->within package only
	protected int c=30;//protected data member-->within package and outside of package with inheritance concept
	public int d=40;//public data member-->access throught project 
	private void test1()
	{
	System.out.println("Private method Test1");
	}
	void test2()
	{
	System.out.println("default method Test2");
	}
	protected void test3()
	{
	System.out.println("protected method Test3");
	}
	public void test4()
	{
	System.out.println("public method Test4");
	}
}
