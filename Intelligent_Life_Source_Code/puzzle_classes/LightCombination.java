package puzzle_classes;

public class LightCombination extends Puzzle {

	public LightCombination(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean solvingPuzzle(String userInput) {
		if (userInput.equalsIgnoreCase("blue, aqua, green, purple")) {
			return true;
		} else {
			System.out.println("Wrong combination please try again.");
			return false;
		}

	}

}
