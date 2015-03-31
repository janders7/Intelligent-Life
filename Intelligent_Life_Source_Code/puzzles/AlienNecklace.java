package puzzles;

public class AlienNecklace extends Puzzle {

	public AlienNecklace(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean solvingPuzzle(String userInput) {
		if(player.getInventory().has("neclace1,neclace2,neclace3 ") )
		{return true;
		}else{ System.out.println("you do not posses all the pieces keep saching.");
		return false;
	}

}
}