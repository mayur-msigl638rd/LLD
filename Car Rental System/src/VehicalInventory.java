import java.util.ArrayList;

public class VehicalInventory { // databse of vehicals
	
public static HashMap<VehicalCategory , ArrayList<vehicle>>inventory = new HashMap<VehicalCategory, ArrayList<vehicle>>();

public static ArrayList<Vehicle>database = new ArrayList<>();

public static void addVehical(VehicalCategory category , Vehicle Vehical)
{
	inventory.putIfAbsent(category ,  new ArrayList<Vehicle>());
	inventory.get(category).add(Vehical);
	database.add(Vehical);
}

public static ArrayList<Vehicle>getVehicalByCategory(VehicalCategory category)
{
	return inventory.get(category);
}

public static ArrayList<Vehicle>getAllVehical()
{
	return database;
}
}
