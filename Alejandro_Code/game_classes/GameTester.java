/**
 * 
 */
package game_classes;

import java.util.ArrayList;
import java.util.HashMap;

import character_classes.Monster;
import character_classes.Player;

/**
 * @author student
 *
 */
public class GameTester {

	/**
	 * 
	 */
	public GameTester() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game g = new Game();
		Player p = new Player("Tim");
		ArrayList<String> inv = new ArrayList<>();
		inv.add("Knife");
		inv.add("Sword");
		p.setInventory(inv);

		System.out.println("game for player getInventory\n" + g.getInventory(p));
		System.out.println("\ngame for player getStatistics\n"
				+ g.getStatistics(p));
		System.out.println("\ngame getHelp\n" + g.getHelp());

		HashMap<String, String> map = new HashMap<>();
		map.put("ale", "12345");
		g.setUsernamePasswordMap(map);
		System.out.println("\n" + map);

		System.out.println("\nnewUserLogin()\n");
		g.newUserLogin();
		System.out.println("\nexistingUserLogin()\n");
		g.existingUserLogin();

	}

}
