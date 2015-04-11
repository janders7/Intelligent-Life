package game_classes;

import item_classes.Item;

import java.util.ArrayList;

import room_classes.Room;
import character_classes.Player;

public class Game2Tester {

	public Game2Tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a new Game instance.
		Game2 g = new Game2();

		// Create a new Player instance.
		Player p = new Player("John Doe");

		// Create an ArrayList<Item> called inventory.
		ArrayList<Item> inventory = new ArrayList<>();

		// Add Items to the ArrayList<Item>.
		inventory.add(new Item("Sword", 10));
		inventory.add(new Item("Potion", 20));
		inventory.add(new Item("Holy Water", 5));

		// Set the ArrayList to player inventory.
		p.setInventory(inventory);

		// Print the player inventory from the game class.
		System.out.println(g.getInventory(p));

		// Print the statistics of the player.
		System.out.println("\n" + g.getStatistics(p));

		// Print the help menu.
		System.out.println("\n" + g.getHelp());

		// Create new Room instance.
		Room r = new Room(10, 20, 20, 15);

		// Print the Room description.
		System.out.println("\nRoom desc " + g.getMap(r)); // NOTE: This will not
															// print
		// anything.

		// Set an existing username.
		g.getUsernameSet().add("JOHN");

		// Print the Set containing all the usernames.
		System.out.println("\n" + g.getUsernameSet());

		// Run the userLogin() method.
		g.userLogin();

		// Print the Set containing all the usernames.
		System.out.println(g.getUsernameSet());
	}

}
