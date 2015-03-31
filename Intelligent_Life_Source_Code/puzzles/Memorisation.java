package puzzles;

public class Memorisation extends Puzzle {

	public Memorisation(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean solvingPuzzle(String userInput) {
		if(userInput.equalsIgnoreCase("Breath and Smoke"))
		{return true;
		}else{
			System.out.println("Jack grabs you and eats you.");
			// player.setHealth(0);
		return false;
	}

}
}