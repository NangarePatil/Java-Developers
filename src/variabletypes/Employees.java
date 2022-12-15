package variabletypes;

public class Employees 

{

	//name, age, gender, sal
	String emp_name;
	float emp_age;
	char emp_gender;
	int emp_sal;
	static String Team;
	public void emp_info()
	{
	System.out.println("Employee name is "+emp_name);
	System.out.println("Employee age is "+emp_age);
	System.out.println("Employee gender is "+emp_gender);
	System.out.println("Employee salary is "+emp_sal);
	System.out.println("Employee team is "+Team);
	System.out.println("======================================");
	}
}
