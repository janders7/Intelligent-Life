package item_classes;

import java.util.Random;

public class Weapon extends Item {

	private int attack;

	public Weapon(String description, int effect) {
		super(description, effect);
		Random r = new Random();
		int rand = r.nextInt((0 + 20) + 1) - 20;
		attack = rand;
		effect = attack;

	}

}
