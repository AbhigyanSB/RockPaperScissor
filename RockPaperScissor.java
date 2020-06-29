/* This program will let the user
 * play Rock, Paper, Scissor with
 * the computer. */

//Import the Scanner class of Java.
import java.util.Scanner;

//Class containing the Rock, Paper, Scissor game.
public class RockPaperScissor {
	
	//Main method.
	public static void main(String[] args) {
		
		//Create a Scanner object.
		Scanner input = new Scanner(System.in);
		
		//Ask for the user input.
		System.out.println("Please enter '0' for 'Rock', '1' for 'Paper' and '2' for 'Scissor': "); /* asking for the user input between the number 0 to 2 to represent either rock or paper or scissor */
		
		//Store the user input.
		int userInput = input.nextInt();
		
		//Generate a random number between 0 to 2, with upper limit 3.
		int compInput = (int)(Math.random() * 3);
		
		//Compare and indicate the result if the user inputs 0 for the rock.
		if (compInput == 0) { 
			switch (userInput) {
			case 0: System.out.println("It's a draw, as both you and the Computer selected Rock"); break;
			case 1: System.out.println("You win as you selected Paper and the Computer selected Rock"); break;
			case 2: System.out.println("The Computer wins asyou selected Scissor and the Computer selected a Rock"); break;
			default: System.exit(0); break;
			}
		}
		
		//Compare and indicate the result if the user inputs 1 for the paper.
		else if (compInput == 1) { 
			switch (userInput) {
			case 0: System.out.println("The Computer wins as you selected Rock and the Computer selected a Paper"); break;
			case 1: System.out.println("It's a draw, as both you and the Computer selected Paper"); break;
			case 2: System.out.println("You win as tou selected Scissor and the Computer selected Paper"); break;
			default: System.exit(0); break;
			}
		}
		
		//Compare and indicate the result if the user inputs 2 for the scissor.
		else {
			switch (userInput) { 
			case 0: System.out.println("You win as you selected Rock and the Computer selected Scissor"); break;
			case 1: System.out.println("The Computer wins as you selected Paper and the Computer selected Scissor"); break;
			case 2: System.out.println("It's a draw, as you have selected Scissor and the Computer also selected Scissor"); break;
			default: System.exit(0); break;
			}
		}
		
		//Close the input.
		input.close();
	}
}