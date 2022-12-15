package thisandsuperkeyword;

public class B extends A

{

	int x=9;//global value of x form B class
	public static void main(String[] args) 
	
	{
		B b = new B();
		b.demo();


	}

	public void demo()
	{
	int x=900;//local value of x form B class
	System.out.println("Local value of x "+x);
	System.out.println("Global value of x from class B "+this.x);
	System.out.println("Global value of x from super class A "+super.x);
	System.out.println("Local value of y "+y);
	}
}
