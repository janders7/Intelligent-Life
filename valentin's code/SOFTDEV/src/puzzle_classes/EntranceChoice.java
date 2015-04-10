package puzzle_classes;

import java.util.Scanner;

/**
 * Class: EntranceChoice
 * 
 * @author Valentin Meica
 * @version 1.0 
 * Course : Software Development I Section 01 Spring 2015 Written:
 *          April 10, 2015
 *
 *
 * This class – checks if the user enters the right door puzzle solved otherwise try again.
 *
 * Purpose: – a puzzle for a text game.
 */
public class EntranceChoice extends Puzzle {

	public EntranceChoice() {

		description = "You are facing 4 doors choose an entrance , beware only one door leads to the next chamber.";
	}

	/**
	 * Method: solvingPuzzle 
	 * if the user enters the right door puzzle solved otherwise try again
	 * 
	 * @return boolean
	 **/
	public boolean solvingPuzzle(String userInput) {
		boolean solved = false;

		if (userInput.equalsIgnoreCase("door 1")) {
			System.out.println("Puzzle solved!");
			solved = true;
		} else {
			System.out.println("failed try again");
			solved = false;
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
		EntranceChoice entrance = new EntranceChoice();

		System.out.println(entrance.getDescription());

		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();

		while (!(input.equalsIgnoreCase("door 1")
				|| input.equalsIgnoreCase("door 2")
				|| input.equalsIgnoreCase("door 3") || input
					.equalsIgnoreCase("door 4")))
			;
		{

			System.out.println("Incorrect entry. Please try again!");
			input = userInput.nextLine();
		}
		entrance.solvingPuzzle(input);

	}

}
