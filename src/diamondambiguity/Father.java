package diamondambiguity;

public interface Father 

{

	void mind();
	void care();
	default void love()
	{
	System.out.println("Fathers Love");
	}
	static void test()
	{
	System.out.println("Fathers Test method");
	}
}
