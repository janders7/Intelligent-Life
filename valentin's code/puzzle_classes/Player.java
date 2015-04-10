package puzzle_classes;

import item_classes.Item;

import java.util.ArrayList;

/**
 * Class: Memorization
 * 
 * @author Valentin Meica
 * @version 1.0 
 * 
 * Course : Software Development I Section 01 Spring 2015 Written:
 *          April 10, 2015
 *
 *
 * This class – This class is a class stub of Player for testing the
 *          puzzle classes to manipulate the player's health as a punishment for
 *          failing to solve the puzzle.
 *
 *       Purpose: – a player for a text game.
 */

public class Player {

	String name;
	int healthpoints;

	public Player(String name) {
		this.name = name;
		healthpoints = 100;
	}

	/**
	 * @param healthpoints
	 *            the healthpoints to set
	 */
	public void setHealthpoints(int healthpoints) {
		this.healthpoints = healthpoints;

		System.out.println("You failed Game over");
	}

}
