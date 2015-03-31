package puzzles;

public class EntranceChoice extends Puzzle {

	public EntranceChoice(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean solvingPuzzle(String userInput) {
		if(userInput.equalsIgnoreCase("right door"))
		{//proceede next room
			return true;
			}else{System.out.println("failed try again");
			return false;
		}
		
	}

}
