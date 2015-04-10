package puzzle_classes;

import java.util.Scanner;

/**
 * Class: Memorization
 * 
 * @author Valentin Meica
 * @version 1.0 
 * Course : Software Development I Section 01 Spring 2015 Written:
 *          April 10, 2015
 *
 *
 * This class – checks if the user enters the right combination that was the answers to the riddle puzzle.
 *
 * Purpose: – a puzzle for a text game.
 */
public class Memorization extends Puzzle {
	Player user = new Player("John");

	public Memorization() {
		description = "Remember what was the answers to the questions earlier and write them on the cage) "
				+ "\na.Dinornis robustus and Breath (WRONG you end up beingeaten by “Jack”)"
				+ "\nb.Smoke and Gravity (WRONG you end up being eaten by “Jack”)"
				+ "\nc.Breath and Smoke (Yay! The cage opens)";

	}

	/**
	 * Method: solvingPuzzle 
	 * if the user enters the right combination that was the answers to the riddle puzzle 
	 * 
	 * @return boolean
	 **/
	public boolean solvingPuzzle(String userInput) {
		boolean solved = false;
		if (userInput.equalsIgnoreCase("Breath and Smoke")) {
			System.out.println("That is correct; the cage opens!");
			solved = true;
		} else {
			System.out.println("Jack grabs you and eats you.");
			user.setHealthpoints(0);
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
		Memorization memorisation = new Memorization();

		System.out.println(memorisation.getDescription());

		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();

		memorisation.solvingPuzzle(input);

	}

}