
public class FoodItem {
public String name , id, description;
public int cost;
public FoodItem(String name, String id, String description, int cost) {
	super();
	this.name = name;
	this.id = id;
	this.description = description;
	this.cost = cost;
}

public void updatePrice(int cost)
{
	this.cost = cost;
}
}
