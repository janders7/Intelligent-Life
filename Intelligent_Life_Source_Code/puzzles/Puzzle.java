package puzzles;

public abstract class Puzzle {

	private String description;
	
	public Puzzle(String description)
	{this.description=description;}
	
	public abstract boolean solvingPuzzle(String userInput);

	public String getDescription() {
		return null;
	}
	
}
