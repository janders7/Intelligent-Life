package puzzle_classes;

import java.util.Scanner;


/**
 * Class: Riddle
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
public class Riddle extends Puzzle {

	Player user = new Player("John");

	public Riddle() {
		
		description = "Comes face to face with the light. The light shatters and the room begins to close in on the player. "
				+ "\nThe pieces of light surround the player and then move in front of the player. "
				+ "\nA message of light begins to appear and the message turns out to be a riddle. "
				+ "\nI'm light as a feather, yet the strongest man can't hold me for much more than a minute. What am I? "
				+ "\n1. Breath (moves on to the next riddle)"
				+ "\n2. Gravity (WRONG so you die)" 
				+ "\n3. Ant (WRONG so you die)"
				+ "\nenter 1,2, or3 for answer";
	}

	/**
	 * Method: solvingPuzzle 
	 * if the user enters the wrong answer he is being eaten by monster. 
	 * 
	 * @return boolean
	 **/
	public boolean solvingPuzzle(String userInput) {
		boolean solved=false;
		
	
		
			if (userInput.equalsIgnoreCase("1")) // 1 is for breath
			{
				System.out.println("Second: I am the black child of a white father, a wingless "
						+ "\nbird, flying even to the clouds of heaven. I give birth to tears "
						+ "\nof mourning in pupils that meet me, even though there is no "
						+ "\ncause for grief, and at once on my birth I am dissolved into air. What am I?"
						+ "\n1. Ghost (WRONG you die)"
						+ "\n2. Smoke (Right! Continue on)"
						+ "\n3. Dinornis robustus (WRONG you die)"
						+ "\nenter 1,2, or3 for answer");	
				
				Scanner input= new Scanner(System.in);
				userInput=input.next();
				if(userInput.equalsIgnoreCase("2"))
				{
					System.out.println("Well done! Puzzle solved.");
					solved= true;
				}else if(userInput.equalsIgnoreCase("1") || userInput.equalsIgnoreCase("3")) {

					System.out.println("Wrong Prepare to die!");

					user.setHealthpoints(0);
					solved= false;}

				
				
			}
			else if(userInput.equalsIgnoreCase("2") || userInput.equalsIgnoreCase("3")) {

				System.out.println("Wrong Prepare to die!");

				user.setHealthpoints(0);
				solved= false;}

		
		
			

		
		return solved;
	}
	


	/**
	 * Method: main 
	 * this main is for testing purpouses.
	 * 
	 * @return void
	 **/
public static void main(String[] args) {
	Riddle riddle = new Riddle();
	
	System.out.println(riddle.getDescription());
	
	Scanner userInput= new Scanner(System.in);
	String input=userInput.nextLine();
	while(!(input.equals("1")|| input.equals("2")|| input.equals("3")))
	{
		
		System.out.println("Incorrect entry. Please try again!");
		input=userInput.nextLine();
	}
	riddle.solvingPuzzle(input);
	
	
}
}

