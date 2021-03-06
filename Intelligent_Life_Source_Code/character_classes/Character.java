/**
 * 
 */
package character_classes;

import java.util.Random;

/**
 * @author Alejandro Guzman
 *
 */
public abstract class Character {

	protected String name;
	protected int healthPoints;
	protected int attackPoints;

	/**
	 * 
	 * @param name
	 */
	public Character(String name) {
		this.name = name;
		healthPoints = 100; // set default health to 100
		Random r = new Random();
		int rand = r.nextInt((50 - 20) + 1) + 20; // random number for monster and player
										// may have to be within a certain range
										// of each other
		attackPoints = rand; // sets the attack to a pseudo-random number
								// between 20 and 50
	}

	/**
	 * 
	 * @param name
	 * @param healthPoints
	 * @param attackPoints
	 */
	public Character(String name, int healthPoints, int attackPoints) {
		this.name = name;
		this.healthPoints = healthPoints;
		this.attackPoints = attackPoints;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isAlive() {
		boolean isAlive = true;
		if (healthPoints <= 0) {
			isAlive = false;
		}
		return isAlive;
	}

	/**
	 * 
	 * @param c
	 */
	public void attack(Character c) {
		int damage = attackPoints; // plus the weapons points
		c.healthPoints = c.healthPoints - damage;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", healthPoints=" + healthPoints
				+ ", attackPoints=" + attackPoints + "]";
	}

	/**
	 * 
	 * @return
	 */
	public int getHealthPoints() {
		return healthPoints;
	}

	/**
	 * 
	 * @param healthPoints
	 */
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	/**
	 * 
	 * @return
	 */
	public int getAttackPoints() {
		return attackPoints;
	}

	/**
	 * 
	 * @param attackPoints
	 */
	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

}
