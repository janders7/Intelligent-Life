/**
 * 
 */
package character_classes;

import game_classes.Game;

import java.util.ArrayList;
import java.util.HashMap;

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
		System.out.println("\n" + p);

		Game g = new Game();

		System.out.println("\n" + g.getInventory(p));
		System.out.println("\n" + g.getStatistics(p));
		System.out.println("\n" + g.getHelp());

		HashMap<String, String> map = new HashMap<>();
		map.put("ale", "12345");
		g.setUsernamePasswordMap(map);
		System.out.println("\n" + map);

		System.out.println("\nnewUserLogin()...");
		g.newUserLogin();
		System.out.println("\nexistingUserLogin()...");
		g.existingUserLogin();
	}
}
