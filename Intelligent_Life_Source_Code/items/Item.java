package items;

public class Item {

private	String type;
private	int effect;
	
	public Item(String type, int effect)
	{
		this.type=type;
		this.effect=effect;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEffect() {
		return effect;
	}

	public void setEffect(int effect) {
		this.effect = effect;
	}
	
	
}
