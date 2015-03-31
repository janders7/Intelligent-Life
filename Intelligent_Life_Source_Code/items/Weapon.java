package items;

public class Weapon extends Item {

private int attack=20;
	
	public Weapon(String type, int effect) {
		super(type, effect);
		effect=attack;
		
	}

}
