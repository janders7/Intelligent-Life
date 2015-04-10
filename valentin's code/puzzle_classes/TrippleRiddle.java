package puzzle_classes;

import java.util.Scanner;

/**
 * Class: TrippleRiddle
 * 
 * @author Valentin Meica
 * @version 1.0 
 * Course : Software Development I Section 01 Spring 2015 Written:
 *          April 10, 2015
 *
 *
 * This class – if the user enters the wrong answer he is being eaten by monster.
 *
 * Purpose: – a puzzle for a text game.
 */
public class TrippleRiddle extends Puzzle {

	Player user = new Player("John");

	public TrippleRiddle() {
		description = "The alien informs the player that he is not there to eat him "
				+ "\nbut will whenever the player gets a wrong answer.  "
				+ "\nWhat lives in winter, dies in summer, and grows with its root upward? "
				+ "\n1	Ice (WRONG) "
				+ "\n2	An icicle (RIGHT) "
				+ "\n3	A snowman (WRONG)";

	}
	/**
	 * Method: solvingPuzzle 
	 * if the user enters the wrong answe he is being eaten by monster.  
	 * 
	 * @return boolean
	 **/
	public boolean solvingPuzzle(String userInput) {
		boolean solved = false;
		Scanner input = new Scanner(System.in);

		if (userInput.equalsIgnoreCase("2")) {
			//second riddle
			System.out.println("	What three letters mean 'stiff water'? "
					+ "\n1	Ice (RIGHT)" 
					+ "\n2	Frozen (WRONG)" 
					+ "\n3	I.C.E (WRONG)");

			userInput = input.next();

			if (userInput.equalsIgnoreCase("1")) {
				//third riddle
				System.out.println("	What runs but never gets tired?"
						+ "\n1	The roadrunner (WRONG)"
						+ "\n2	An intergalactic space devil (WRONG)"
						+ "\n3	Water (RIGHT)");
				userInput = input.next();

				if (userInput.equalsIgnoreCase("3")) {
					System.out.println("Well done! Puzzle solved.");
					solved = true;
				} else if (userInput.equalsIgnoreCase("1")
						|| userInput.equalsIgnoreCase("2")) {

					System.out.println("Wrong Prepare to die!");

					user.setHealthpoints(0);
					solved = false;
				}
			} else if (userInput.equalsIgnoreCase("2")
					|| userInput.equalsIgnoreCase("3")) {

				System.out.println("Wrong Prepare to die!");

				user.setHealthpoints(0);
				solved = false;
			}

		} else if (userInput.equalsIgnoreCase("1")
				|| userInput.equalsIgnoreCase("3")) {

			System.out.println("Wrong Prepare to die!");

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
		TrippleRiddle riddle = new TrippleRiddle();

		System.out.println(riddle.getDescription());

		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();
		while (!(input.equals("1") || input.equals("2") || input.equals("3"))) {

			System.out.println("Incorrect entry. Please try again!");
			input = userInput.nextLine();
		}
		riddle.solvingPuzzle(input);

	}
}
