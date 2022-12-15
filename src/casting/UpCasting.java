package casting;

public class UpCasting 

{

	public static void main(String[] args) 
	
	{
		Father f= new Father();// created object of superclass
		Son s= new Son();// created object of subclass
		f.bike();
		f.car();
		s.bike();
		s.car();
		s.degree();
		System.out.println("================");
		Father fs=new Son();
		fs.bike();
		fs.car();
		// fs.degree();

	}

}
