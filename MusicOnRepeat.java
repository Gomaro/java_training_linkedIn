import java.util.Scanner;

public class  MusicOnRepeat{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	boolean isOnRepeat = true;
	while(isOnRepeat){
	
		System.out.println("Playing current song");
		System.out.println("Would you like to take this song of repeat? if so, answer yes");
		String userInput = input.next();

		if(userInput.equals("yes")){
		
			isOnRepeat = false;
		}
	}
	System.out.println("Playing next song");

	}
}
