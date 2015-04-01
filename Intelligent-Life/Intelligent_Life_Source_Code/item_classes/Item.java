package item_classes;

public abstract class Item {

	protected String description;
	protected int effect;

	public Item(String description, int effect) {
		this.description = description;
		this.effect = effect;
	}

	public String getType() {
		return description;
	}

	public void setType(String description) {
		this.description = description;
	}

	public int getEffect() {
		return effect;
	}

	public void setEffect(int effect) {
		this.effect = effect;
	}

}
