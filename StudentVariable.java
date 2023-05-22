import java.util.Scanner;

public class StudentVariable {

	public static void main(String[] args){
	
		int studentAge=15;
		double studentGPA=3.45;
		boolean hasPerfectAttendance = true;
		String studentFirstName = "Kaio";
		String studentLastName = "Carbonari";
		char studentLastInitial=studentLastName.charAt(0);
		char studentFirstInitial=studentFirstName.charAt(0);
		
		System.out.println(studentFirstName + ' ' + studentLastName + " has a GPA of " + studentGPA); 
		System.out.println("What do you want to update it to?");
		
		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();

		System.out.println(studentFirstName + ' ' + studentLastName + " now has GPA of " + studentGPA); 
  

	}
}
