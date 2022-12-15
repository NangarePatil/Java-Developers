package variabletypes;

public class HR 

{

	public static void main(String[] args) 
	
	{
		Employees.Team="RCB";
		Employees.Team="IND";
		Employees.Team="Delhi";
		Employees SachinT= new Employees();
		SachinT.emp_name="Sachin T";
		SachinT.emp_age=43.5f;
		SachinT.emp_gender='M';
		SachinT.emp_sal=12345;
		SachinT.emp_info();
		Employees viru= new Employees();
		viru.emp_name="Virendra";
		viru.emp_gender='M';
		viru.emp_age=46;
		viru.emp_sal=54333;
		viru.emp_info();

	}

}
