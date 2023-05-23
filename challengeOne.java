import java.util.Scanner;

public class challengeOne{

	public static void main(String args[]){
	
		String question = "what is the result of the sum of 4 + 2?";
		String choiceOne = "4";
		String choiceTwo = "6";
		String choiceThree = "42";

		String correctAnswer = choiceTwo;

		System.out.println(question);
		System.out.println("choose one of the choices:");
		System.out.println( choiceOne + " or " + choiceTwo + " or " +choiceThree);

		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		if(correctAnswer.equals(input.toLowerCase())){
		
			System.out.println("Congratulations, it is right");

		} else {
		
			System.out.println("That is not correct, the correct is 6");
		}
	}
}
