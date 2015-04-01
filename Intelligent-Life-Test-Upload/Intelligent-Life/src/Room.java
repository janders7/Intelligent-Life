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
		this.hasMonster = containsMonster(monsterChance);
		this.hasPuzzle = containsPuzzle(puzzleChance);
		this.hasItem = containsItem(itemChance);
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

	public boolean containsMonster(int monsterChance) {
		boolean result = false;
		this.randomNumber = generator.nextInt(100) + 1;

		if (this.randomNumber <= monsterChance)
			result = true;

		return result;
	}

	public boolean containsPuzzle(int puzzleChance) {
		boolean result = false;
		this.randomNumber = generator.nextInt(100) + 1;

		if (this.randomNumber <= puzzleChance)
			result = true;

		return result;
	}

	public boolean containsItem(int itemChance) {
		boolean result = false;
		this.randomNumber = generator.nextInt(100) + 1;

		if (this.randomNumber <= itemChance)
			result = true;

		return result;
	}

	public String roomDescriptions(int roomNumber) {
		if (roomNumber == 1) {
			return "";
		} else if (roomNumber == 2) {
			return "";
		} else if (roomNumber == 3) {
			return "";
		} else if (roomNumber == 4) {
			return "";
		} else if (roomNumber == 5) {
			return "";
		} else if (roomNumber == 6) {
			return "";
		} else if (roomNumber == 7) {
			return "";
		} else if (roomNumber == 8) {
			return "";
		} else if (roomNumber == 9) {
			return "";
		} else if (roomNumber == 10) {
			return "";
		} else if (roomNumber == 11) {
			return "";
		} else if (roomNumber == 12) {
			return "";
		} else if (roomNumber == 13) {
			return "";
		} else if (roomNumber == 14) {
			return "";
		} else if (roomNumber == 15) {
			return "";
		} else if (roomNumber == 16) {
			return "";
		} else if (roomNumber == 17) {
			return "";
		} else if (roomNumber == 18) {
			return "";
		} else if (roomNumber == 19) {
			return "";
		} else if (roomNumber == 20) {
			return "";
		} else if (roomNumber == 21) {
			return "";
		} else if (roomNumber == 22) {
			return "";
		} else if (roomNumber == 23) {
			return "";
		} else if (roomNumber == 24) {
			return "";
		} else if (roomNumber == 25) {
			return "";
		} else if (roomNumber == 26) {
			return "";
		} else if (roomNumber == 27) {
			return "";
		} else if (roomNumber == 28) {
			return "";
		} else if (roomNumber == 29) {
			return "";
		} else if (roomNumber == 30) {
			return "";
		} else {
			return "You are lost.";
		}
	}

}
