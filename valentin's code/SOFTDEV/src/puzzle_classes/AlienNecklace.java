package puzzle_classes;

import item_classes.Item;

import java.util.ArrayList;

import character_classes.Player;

/**
 * Class: AlienNecklace
 * 
 * @author Valentin Meica
 * @version 1.0 
 * Course : Software Development I Section 01 Spring 2015 Written:
 *          April 10, 2015
 *
 *
 * This class – contains the solving method for the puzzle that counts
 *          if the player has the 3 pieces o a necklace required by the Alien
 *          npc.
 *
 * Purpose: – a puzzle for a text game.
 */
public class AlienNecklace extends Puzzle {

	Player player = new Player("John Dow");
	static Item necklace1 = new Item("piece 1", 0);
	static Item necklace2 = new Item("piece 2", 0);
	static Item necklace3 = new Item("piece 3", 0);
	static ArrayList<Item> inventory = new ArrayList<Item>();

	public AlienNecklace() {
		description = "Your task is to find all 3 pieces of a necklace.";

	}

	/**
	 * Method: hasPiece1 checks if the arraylist of items 'inventory' has the
	 * item nr. 1.
	 * 
	 * @return boolean
	 **/
	public boolean hasPiece1() {
		boolean hasPiece = false;
		for (int x = 0; x < inventory.size(); x++) {
			if (inventory.get(x) == necklace1) {
				hasPiece = true;
			}
		}
		return hasPiece;
	}

	/**
	 * Method: hasPiece2 checks if the arraylist of items 'inventory' has the
	 * item nr. 2.
	 * 
	 * @return boolean
	 **/
	public boolean hasPiece2() {
		boolean hasPiece = false;
		for (int x = 0; x < inventory.size(); x++) {
			if (inventory.get(x) == necklace2) {
				hasPiece = true;
			}
		}
		return hasPiece;
	}

	/**
	 * Method: hasPiece3 checks if the arraylist of items 'inventory' has the
	 * item nr. 3.
	 * 
	 * @return boolean
	 **/
	public boolean hasPiece3() {
		boolean hasPiece = false;
		for (int x = 0; x < inventory.size(); x++) {
			if (inventory.get(x) == necklace3) {
				hasPiece = true;
			}
		}
		return hasPiece;
	}

	/**
	 * Method: solvingPuzzle checks if all three methods are true and solves the
	 * puzzle
	 * 
	 * @return boolean
	 **/
	public boolean solvingPuzzle() {

		boolean solved = false;

		if (hasPiece1() == true && hasPiece2() == true && hasPiece3() == true) {
			System.out.println("Hail you have all the pieces");
			solved = true;
		} else
			System.out
					.println("You do not posses all the pieces; keep searching");

		return solved;
	}

	/**
	 * Method: main 
	 * this main is for testing purpouses.
	 * 
	 * @return void
	 **/

	public static void main(String[] args) {

		AlienNecklace puzzle = new AlienNecklace();
		System.out.println(puzzle.getDescription());

		inventory.add(necklace1);
		inventory.add(necklace2);
		inventory.add(necklace3);

		for (Item item : inventory) {
			System.out.println(item.toString());
		}

		puzzle.solvingPuzzle();
	}

}
