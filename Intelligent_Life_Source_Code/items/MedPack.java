package items;

public class MedPack extends Item {

	private int restore=50;
	
	public MedPack(String type, int effect) {
		super(type, effect);
		
		effect=restore;
	}

}
