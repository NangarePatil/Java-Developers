package methods;

public class PuneUniversity 

{

	public static void main(String[] args) 
	
	{
		PuneUniversity pu= new PuneUniversity();// created object of a class
		pu.studentInfo();
		pu.studentInfo();
		pu.studentInfo("Pune", 'F', "Art", 22.2f, 7890);
		pu.studentInfo("Katraj", 'M', "Commerce", 44f, 456544);
		//pu.studentInfo(null, 0, null, 0, 0);


	}

	//name, gender, dept, age, PRN
	public void studentInfo()
	{
	String studentName="Velocity";
	char studentGender='M';
	String studentDept="Engg";
	float studentAge=22.5f;
	int studentPRN=1234;
	System.out.println("===============================");
	System.out.println("Students name is "+studentName);
	System.out.println("Students gender is "+studentGender);
	System.out.println("Students dept is "+studentDept);
	System.out.println("Students age is "+studentAge);
	System.out.println("Students PRN num is "+studentPRN);
	System.out.println("===============================");
	}
	public void studentInfo(String studentName,char studentGender,String studentDept,float
	studentAge,int studentPRN)
	{
	System.out.println("===============================");
	System.out.println("Students name is "+studentName);
	System.out.println("Students gender is "+studentGender);
	System.out.println("Students dept is "+studentDept);
	System.out.println("Students age is "+studentAge);
	System.out.println("Students PRN num is "+studentPRN);
	System.out.println("===============================");
	}
}
