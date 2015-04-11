/**
 * 
 */
package character_classes;

import item_classes.Item;

import java.util.ArrayList;

/**
 * class: CharacterTester
 * 
 * course: ITEC 3150 Spring 2015
 * 
 * written: April 1, 2015
 * 
 * @author Alejandro Guzman
 * @version 1.0
 * 
 * 
 *          This is a tester class for the character, monster, and player class
 * 
 *
 */
public class CharacterTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create monster and player, child classes of character
		Monster m = new Monster("Giant Catepiller");
		Player p = new Player("John");

		// prints using the toString method for monster and player
		System.out.println(m.toString());
		System.out.println(p.toString());

		// prints the health and attack points of the monster and player
		System.out.println("\nmonster getHealth: " + m.getHealthPoints());
		System.out.println("monster getAttack: " + m.getAttackPoints());
		System.out.println("\nplayer getHealth: " + p.getHealthPoints());
		System.out.println("player getAttack: " + p.getAttackPoints());

		// sets the monster and player health and attack points to 3
		System.out
				.println("\nSetting the monster and player health and attack points to 3");
		m.setHealthPoints(3);
		m.setAttackPoints(3);
		p.setHealthPoints(3);
		p.setAttackPoints(3);

		// prints the health and attack points of the monster and player
		System.out.println("\nmonster getHealth: " + m.getHealthPoints());
		System.out.println("monster getAttack: " + m.getAttackPoints());
		System.out.println("\nplayer getHealth: " + p.getHealthPoints());
		System.out.println("player getAttack: " + p.getAttackPoints());

		// prints if the monster and player are alive at their current health
		System.out.println("\nmonster isAlive: " + m.isAlive());
		System.out.println("player isAlive: " + p.isAlive());

		// sets the health points of the monster and player to 0
		System.out
				.println("\nSetting the monster and player health points to 0");
		m.setHealthPoints(0);
		p.setHealthPoints(0);

		// prints if the monster and player are alive at their current health
		System.out.println("\nmonster isAlive: " + m.isAlive());
		System.out.println("player isAlive: " + p.isAlive());

		// creates an array list of type item
		ArrayList<Item> inv = new ArrayList<>();

		// adds strings representing items and weapons to the array list
		inv.add(new Item("LASER GUN", 5));
		inv.add(new Item("HEALING FLOWER", 7));
		inv.add(new Item("POSION", 8));

		// sets the players inventory to the list
		System.out
				.println("\nAdding an inventory with items to the players inventory");
		p.setInventory(inv);

		// prints using the toString method for monster and player
		System.out.println("\n" + m.toString());
		System.out.println(p.toString());
		System.out.println(p.getInventory());

		System.out.println("\nCreating a new monster and player");

		// create monster and player, child classes of character
		Monster m2 = new Monster("Skeleton");
		Player p2 = new Player("Jordan");

		// prints using the toString method for monster and player
		System.out.println("\n" + m2.toString());
		System.out.println(p2.toString());

		// player attacks the monster
		System.out.println("\nplayer attacks monster");
		p2.attack(m2);

		// prints using the toString method for monster and player
		System.out.println("\n" + m2.toString());
		System.out.println(p2.toString());

		// player attacks the monster
		System.out.println("\nmonster attacks player");
		m2.attack(p2);

		// prints using the toString method for monster and player
		System.out.println("\n" + m2.toString());
		System.out.println(p2.toString());

	}
}
