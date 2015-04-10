package puzzle_classes;

import java.util.Scanner;
/**
 * Class: LightCombination
 * 
 * @author Valentin Meica
 * @version 1.0 
 * Course : Software Development I Section 01 Spring 2015 Written:
 *          April 10, 2015
 *
 *
 * This class – checks if the user enters the right combination of colors, otherwise try again.
 *
 * Purpose: – a puzzle for a text game.
 */
public class LightCombination extends Puzzle {

	public LightCombination() {
		description = "match the color scheme straight on and then match the colors backwards."
				+ "\nPlease separate your answers by comma";

	}

	/**
	 * Method: solvingPuzzle 
	 * if the user enters the right combination of colors, otherwise try again
	 * 
	 * @return boolean
	 **/
	public boolean solvingPuzzle(String userInput) {
		boolean solved = false;

		if (userInput.equalsIgnoreCase("blue, aqua, green, purple")) {
			System.out.println("The door opens. Well Done!");
			solved = true;
		} else {
			System.out.println("Wrong combination please try again.");
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
		LightCombination combination = new LightCombination();

		System.out.println(combination.getDescription());

		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();
		while (!input.equalsIgnoreCase("blue, aqua, green, purple")) {

			System.out.println("Incorrect entry. Please try again!");
			input = userInput.nextLine();
		}
		combination.solvingPuzzle(input);

	}

}
