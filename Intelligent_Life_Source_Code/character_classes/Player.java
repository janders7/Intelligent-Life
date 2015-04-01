/**
 * 
 */
package character_classes;

import java.util.ArrayList;

/**
 * @author Alejandro Guzman
 *
 */
public class Player extends Character {

	private ArrayList<String> inventory;

	/**
	 * @param name
	 */
	public Player(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param healthPoints
	 * @param attackPoints
	 */
	public Player(String name, int healthPoints, int attackPoints,
			ArrayList<String> inventory) {
		super(name, healthPoints, attackPoints);
		this.inventory = inventory;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<String> getInventory() {
		return inventory;
	}

	/**
	 * 
	 * @param inventory
	 */
	public void setInventory(ArrayList<String> inventory) {
		this.inventory = inventory;
	}

	// toString method basically acts like a getStatistics method.
	@Override
	public String toString() {
		return "Player " + super.toString() + "\nPlayer Inventory "
				+ getInventory();
	}

}
