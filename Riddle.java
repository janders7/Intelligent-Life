package InteligentLife;

public class Riddle extends Puzzle {

	public Riddle(String description) {
		super(description);
		description="comes face to face with the light. The light shatters and the room begins to close in on the player. "
				+ "The pieces of light surround the player and then move in front of the player. "
				+ "A message of light begins to appear and the message turns out to be a riddle. "
				+ "I'm light as a feather, yet the strongest man can't hold me for much more than a minute. What am I? "
				+ "1. Breath (moves on to the next riddle)"
				+ "2. Gravity (WRONG so you die)"
				+ "3. Ant (WRONG so you die)";
	}

	@Override
	public boolean solvingPuzzle(String userInput) {
		
		
		if(userInput.equalsIgnoreCase("1")) //1 is for breath
		{
			return true;
		}else if(userInput.equalsIgnoreCase("2")) //2 is for gravity
		{
			return false;
			//player.setHealth(0);
		}else if(userInput.equalsIgnoreCase("3")) // 3 is for ant
		{
			return false;
			//player.setHealth(0);
		} else System.out.println("Incorect entry. Please try again!");	
		return false;
		
		
	}

}
