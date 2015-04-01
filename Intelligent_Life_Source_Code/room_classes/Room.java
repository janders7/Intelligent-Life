/**
 * 
 */
package room_classes;

import java.util.Random;

public class Room {
	private boolean hasMonster;
	private boolean hasPuzzle;
	private boolean hasItem;
	private String description;
	private int randomNumber;
	Random generator = new Random();

	public Room(int monsterChance, int puzzleChance, int itemChance,
			int roomNumber) {
		this.hasMonster = doesContain(monsterChance);
		this.hasPuzzle = doesContain(puzzleChance);
		this.hasItem = doesContain(itemChance);
		this.description = roomDescriptions(roomNumber);
	}

	/**
	 * @return the hasMonster
	 */
	public boolean isHasMonster() {
		return hasMonster;
	}

	/**
	 * @return the hasPuzzle
	 */
	public boolean isHasPuzzle() {
		return hasPuzzle;
	}

	/**
	 * @return the hasItem
	 */
	public boolean isHasItem() {
		return hasItem;
	}

	public String getDescription() {
		return description;
	}

	public boolean doesContain(int chance) {
		boolean contains = false;
		this.randomNumber = generator.nextInt(100) + 1;
		if (this.randomNumber <= chance) {
			contains = true;
		}
		return contains;
	}

	public String roomDescriptions(int roomNumber) {
		String description = "";
		if (roomNumber == 1) {
			description = "";
		} else if (roomNumber == 2) {
			description = "";
		} else if (roomNumber == 3) {
			description = "";
		} else if (roomNumber == 4) {
			description = "";
		} else if (roomNumber == 5) {
			description = "";
		} else if (roomNumber == 6) {
			description = "";
		} else if (roomNumber == 7) {
			description = "";
		} else if (roomNumber == 8) {
			description = "";
		} else if (roomNumber == 9) {
			description = "";
		} else if (roomNumber == 10) {
			description = "";
		} else if (roomNumber == 11) {
			description = "";
		} else if (roomNumber == 12) {
			description = "";
		} else if (roomNumber == 13) {
			description = "";
		} else if (roomNumber == 14) {
			description = "";
		} else if (roomNumber == 15) {
			description = "";
		} else if (roomNumber == 16) {
			description = "";
		} else if (roomNumber == 17) {
			description = "";
		} else if (roomNumber == 18) {
			description = "";
		} else if (roomNumber == 19) {
			description = "";
		} else if (roomNumber == 20) {
			description = "";
		} else if (roomNumber == 21) {
			description = "";
		} else if (roomNumber == 22) {
			description = "";
		} else if (roomNumber == 23) {
			description = "";
		} else if (roomNumber == 24) {
			description = "";
		} else if (roomNumber == 25) {
			description = "";
		} else if (roomNumber == 26) {
			description = "";
		} else if (roomNumber == 27) {
			description = "";
		} else if (roomNumber == 28) {
			description = "";
		} else if (roomNumber == 29) {
			description = "";
		} else if (roomNumber == 30) {
			description = "";
		} else {
			description = "You are lost";
		}
		return description;
	}

}