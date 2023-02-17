
public class CarRentalSystem {
public String name;
public Address location;

public CarRentalSystem(String name, Address location) {
	
	this.name = name;
	this.location = location;
}

public Address getLocation()
{
	return location;
}

}
