import java.util.ArrayList;

public class Airport {
public String name;
public Address address;
public int uniqueId;
public ArrayList<Aircraft>flights = new ArrayList<Aircraft>();
public Airport(String name, Address address, int uniqueId) {
	super();
	this.name = name;
	this.address = address;
	this.uniqueId = uniqueId;
	
}
public void addFlight(Aircraft flight)
{
	flights.add(flight);
}

public ArrayList<Aircraft>getFlights()
{
	return flights;
}

}
