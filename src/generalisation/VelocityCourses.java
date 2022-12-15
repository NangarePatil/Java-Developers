package generalisation;

public class VelocityCourses 

{

	public static void main(String[] args) 
	
	{
		SoftwareTesting st= new SoftwareTesting();
		Python pd= new Python();
		st.admissionProcess();
		st.dailyMock();
		st.weekEndmock();
		st.fees();
		System.out.println("=======================");
		pd.admissionProcess();
		pd.dailyMock();
		pd.weekEndmock();
		pd.fees();


	}

}
