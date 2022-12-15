package thisandsuperkeyword;

public class ThisUse 

{

	int a=100;//global variable
	static int b=10;
	
	public static void main(String[] args) 
	
	{
		ThisUse t= new ThisUse();
		t.test();
		System.out.println(t.a);


	}

	public void test()
	{
	int a=10;//local variable
	System.out.println("Local variable a value is "+a);
	System.out.println("Gobal variable a vlaue is "+this.a);
	int sum=10+this.a;// using global value of a
	System.out.println("sum is "+sum);
	int sum1=10+a;// using local value of a
	System.out.println("Sum is "+sum1);
	}
}
