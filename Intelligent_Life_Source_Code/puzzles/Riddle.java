package puzzles;

public class Riddle extends Puzzle {

	public Riddle(String description) {
		super(description);
		description = "comes face to face with the light. The light shatters and the room begins to close in on the player. "
				+ "The pieces of light surround the player and then move in front of the player. "
				+ "A message of light begins to appear and the message turns out to be a riddle. "
				+ "I'm light as a feather, yet the strongest man can't hold me for much more than a minute. What am I? "
				+ "1. Breath (moves on to the next riddle)"
				+ "2. Gravity (WRONG so you die)" 
				+ "3. Ant (WRONG so you die)";
	}

	@Override
	public boolean solvingPuzzle(String userInput) {

		if (userInput.equalsIgnoreCase("1")) // 1 is for breath
		{
			System.out.println("Second: I am the black child of a white father, a wingless "
					+ "bird, flying even to the clouds of heaven. I give birth to tears "
					+ "of mourning in pupils that meet me, even though there is no "
					+ "cause for grief, and at once on my birth I am dissolved into air. What am I?"
					+ "1. Ghost (WRONG you die)"
					+ "2. Smoke (Right! Continue on)"
					+ "3. Dinornis robustus (WRONG you die)");	
			if(userInput.equalsIgnoreCase("2"))
			{
				System.out.println("Well done!");
				return true;
			}
		}
		if(userInput.equalsIgnoreCase("2") || userInput.equalsIgnoreCase("3")) {
		
		System.out.println("Wrong Prepare to die!");
		// player.setHealth(0);
		return false;}
	 else{
	System.out.println("Incorect entry. Please try again!");
	return false;
	}
}
	




}

