package constructor;

public class CC1 

{
	int c;//global variable declared
	int d;//global variable declared
	public CC1()// user defined zero parameter constructor
	{
	c=10;
	d=88;
	}
	public CC1(int num)// user defined one parameter constructor
	{
	c=num;
	//d=0; default
	}
	public CC1(int num1, int num2)// user defined two parameter constructor
	{
	c=num1;
	d=num2;
	}


	public static void main(String[] args) 
	
	{
		CC1 c1= new CC1();
		c1.demo();
		c1.add();
		CC1 c4= new CC1();
		c4.add();
		CC1 c2= new CC1(100);
		c2.add();
		CC1 c5= new CC1(999);
		c5.add();
		CC1 c3= new CC1(12,12);
		c3.add();

	}

	public void demo()
	{
	System.out.println("HI I AM DEMO METHOD");
	}
	public void add()
	{
	int sum=c+d;
	System.out.println("Sum is "+sum);
	}
}
