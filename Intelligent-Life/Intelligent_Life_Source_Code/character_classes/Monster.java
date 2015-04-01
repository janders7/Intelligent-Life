/**
 * 
 */
package character_classes;

/**
 * @author Alejandro Guzman
 *
 */
public class Monster extends Character {

	/**
	 * @param name
	 */
	public Monster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param healthPoints
	 * @param attackPoints
	 */
	public Monster(String name, int healthPoints, int attackPoints) {
		super(name, healthPoints, attackPoints);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Monster " + super.toString();
	}

}
