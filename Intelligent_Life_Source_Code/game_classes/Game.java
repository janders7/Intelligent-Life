/**
 * 
 */
package game_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import character_classes.Player;

/**
 * @author Alejandro Guzman
 *
 */
public class Game {

	/**
	 * 
	 */
	public Game() {
		// TODO Auto-generated constructor stub
	}

	public String saveGame() {
		File f = new File("game.txt");
		try {
			FileOutputStream output = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getHelp() {
		String help = "-----HELP MENU-----" + "\nEnter \'H\' for help."
				+ "\nEnter \'I\' for inventory" + "\nEnter \'M\' for map"
				+ "\nEnter \'S\' for player statistics"
				+ "\n-----HELP MENU-----";
		return help;
	}

	public String getMap(Room r) {
		return r.getDescription();
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	public String getInventory(Player p) {
		ArrayList<String> inventory = p.getInventory();
		String s = "";
		for (int i = 0; i < inventory.size(); i++) {
			s = s + inventory.get(i) + " ";
		}
		return s;
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	public String getStatistics(Player p) {
		return p.toString();
	}

}
