public class StudentYear {


	public static void main(String[] args){
	
		StudentProfile studentA = new StudentProfile("Kaio", "Carbonari",2014,3.0,"Engineer");
		StudentProfile studentB = new StudentProfile("Beto", "Alves", 2013,1.5,"IT");

		System.out.println(studentA.FirstName);
		System.out.println(studentB.FirstName);

		System.out.println(studentB.ExpectedYearOfGraduate);
		studentB.incrementExpectedYear();
		System.out.println(studentB.ExpectedYearOfGraduate);
	}
}
