package diamondambiguity;

public class Son implements Father,Mother

{

	public static void main(String[] args) 
	
	{
		Son s= new Son();
		s.love();
		Father.test();
		Mother.test();


	}

	@Override
	public void nature() 
	{
		System.out.println("Mothers Nature");
		
	}

	@Override
	public void look() 
	{
		System.out.println("Mothers look");
		
	}

	@Override
	public void mind() 
	{
		System.out.println("Fathers mind");

		
	}

	@Override
	public void care() 
	{
		System.out.println("fathers care");

		
	}

	@Override
	public void love() 
	{
		
		Father.super.love();
		Mother.super.love();
	}

}
