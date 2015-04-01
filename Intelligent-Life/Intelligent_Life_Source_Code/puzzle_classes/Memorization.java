package puzzle_classes;

public class Memorization extends Puzzle {

	public Memorization(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean solvingPuzzle(String userInput) {
		if (userInput.equalsIgnoreCase("Breath and Smoke")) {
			return true;
		} else {
			System.out.println("Jack grabs you and eats you.");
			// player.setHealth(0);
			return false;
		}

	}
}