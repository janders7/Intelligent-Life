package item_classes;

import java.util.Random;

public class MedicalPack extends Item {

	private int restore = 50;

	public MedicalPack(String description, int effect) {
		super(description, effect);
		Random r = new Random();
		int rand = r.nextInt((30 - 20) + 1) + 20;
		restore = rand;
		effect = restore;
	}

}
