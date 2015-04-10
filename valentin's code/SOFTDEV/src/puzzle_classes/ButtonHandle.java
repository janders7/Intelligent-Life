package puzzle_classes;

import java.util.Scanner;
/**
 * Class: ButtonHandle
 * 
 * @author Valentin Meica
 * @version 1.0 
 * Course : Software Development I Section 01 Spring 2015 Written:
 *          April 10, 2015
 *
 *
 * This class – checks the user choice and provides an output.
 *
 * Purpose: – a puzzle for a text game.
 */
public class ButtonHandle extends Puzzle {

	public ButtonHandle() {
		
		description="You have a coice to push a button or to pull the handle.";
		
	}

	/**
	 * Method: solvingPuzzle 
	 * checks what choice the user makes and provides an output
	 * 
	 * @return boolean
	 **/
	public boolean solvingPuzzle(String userInput) {
		boolean solved=false;
		if (userInput.equalsIgnoreCase("press Button"))
		{ // go to the room
			solved=true;
			System.out.println("procede to the room");
		} else if(userInput.equalsIgnoreCase("pull handle"))
		{
			
			// go to the other room
			System.out.println("procede to the other room");
		solved=true;
		}
		return solved;

		
	}
	
	/**
	 * Method: main 
	 * this main is for testing purpouses.
	 * 
	 * @return void
	 **/
	public static void main(String[] args) {
		ButtonHandle puzzle = new ButtonHandle();
		
		
		System.out.println(puzzle.getDescription());
		
		Scanner userInput= new Scanner(System.in);
		String input=userInput.nextLine();
		while(!(input.equalsIgnoreCase("press Button")||input.equalsIgnoreCase("pull handle")))
		{
			
			System.out.println("Incorrect entry. Please try again!");
			input=userInput.nextLine();
		}
		puzzle.solvingPuzzle(input);
		
		
	}
	
}
