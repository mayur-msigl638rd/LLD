import java.util.ArrayList;

public class Menu {
public String menuId;
public ArrayList<FoodItem>menu = new ArrayList<FoodItem>();

public void addFood(FoodItem dish)
{
	this.menu.add(dish);
	
}


}
