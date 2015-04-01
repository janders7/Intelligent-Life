package puzzle_classes;

public abstract class Puzzle {

	protected String description;

	public Puzzle(String description) {
		this.description = description;
	}

	public abstract boolean solvingPuzzle(String userInput);

	public String getDescription() {
		return description;
	}

}
