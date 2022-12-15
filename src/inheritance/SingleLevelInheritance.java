package inheritance;

public class SingleLevelInheritance 

{

	public static void main(String[] args) 
	
	{
		Mother m= new Mother();//created object of mother class
		m.look();//using object of mother class, calling Mothers property
		Daughter d= new Daughter();//created object of daughter class
		d.mobile();//using object of Daughter class, calling Daughters property
		d.look();//using object of Daughter class, calling Mothers property
		Mother.receipe();//mothers class calling its own static method
		Daughter.scooty();//Daughters class calling its own static method
		Daughter.receipe();//Daughters class calling Mothers static method


	}

}
