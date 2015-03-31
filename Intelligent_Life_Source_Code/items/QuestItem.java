package items;

public class QuestItem extends Item {
String description;
	public QuestItem(String type, int effect, String description) {
		super(type, effect);
	this.description=description;
	}

}
