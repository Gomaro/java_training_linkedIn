public class StudentProfile{

	String FirstName;
	String LastName;
	int ExpectedYearOfGraduate;
	double GPA;
	String DeclaredMajor;


	public  StudentProfile(String FirstName, String LastName,
		       	int ExpectedYearOfGraduate,double GPA, String DeclaredMajor){

		this.FirstName = FirstName;
		this.LastName = LastName;
		this.ExpectedYearOfGraduate = ExpectedYearOfGraduate;
		this.GPA = GPA;
		this.DeclaredMajor = DeclaredMajor;

	}

	public int incrementExpectedYear(){
		this.ExpectedYearOfGraduate = this.ExpectedYearOfGraduate + 1;
	    return this.ExpectedYearOfGraduate;
	}


}
