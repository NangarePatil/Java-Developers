package accessspecifiers;

public class Demo1 

{

	public static void main(String[] args) 
	
	{
		Demo d= new Demo();
		
		//d.test1();// cant access private method from another class
		d.test2();//calling default method in another class
		d.test3();//calling protected method in another class
		d.test4();//calling public method in another class

	}

}
