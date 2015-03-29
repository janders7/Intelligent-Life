/**
 * 
 */
package character_classes;

import game_classes.Game;

import java.util.ArrayList;

/**
 * @author Alejandro Guzman
 *
 */
public class CharacterTester {

	/**
	 * 
	 */
	public CharacterTester() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Monster m = new Monster("Giant Catepiller");
		Player p = new Player("John");

		ArrayList<String> inv = new ArrayList<>();
		inv.add("Sword");
		inv.add("Shield");
		inv.add("Potion");
		p.setInventory(inv);

		System.out.println(m);
		System.out.println(p);
		
		Game g = new Game();
		System.out.println(g.getInventory(p));
		System.out.println(g.getStatistics(p));
	}

}
