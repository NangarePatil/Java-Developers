package interfaceStudy;

public class FinalUse 
{

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		final int b=88;
		//if we make any variable as a final
		//then that variable cant be re assigned
		System.out.println(b);
		//b=b+10;--> re assign is not possible because variable "b" is final
		System.out.println(b);

	}

	//if any method is final in class
	//then we cant override that method in any subclass
	public final void test()
	{
	System.out.println("HI");
	}

}
