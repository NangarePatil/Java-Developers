package accessspecifiers1;

import accessspecifiers.Demo;

public class Demo2 extends Demo
{

	public static void main(String[] args) 
	
	{
		Demo d= new Demo();
		// d.test1(); private member is accessible only within class
		// d.test2(); default member is accessible only within package
		// d.test3(); protected member is accessible only within package and using inheritance concept
		
		d.test4();//public member is accessible within project
		
		//if you want to use protected members after inheritance then
		// create object of sub class
		
		Demo2 d2= new Demo2();// creating object of subclass
		
		d2.test3();//calling protected method from another class using inheritance
		d2.test4();//calling public method form another class

	}

}
