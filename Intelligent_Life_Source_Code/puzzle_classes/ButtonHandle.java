package puzzle_classes;

public class ButtonHandle extends Puzzle {

	public ButtonHandle(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean solvingPuzzle(String userInput) {
		if (userInput.equalsIgnoreCase(" press Button")) { // go to the room
		} else {
			// go to the other room
		}

		return false;
	}

}
