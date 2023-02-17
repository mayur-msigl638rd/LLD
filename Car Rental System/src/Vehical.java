import java.util.ArrayList;

public class Vehical {

	public int licenceNumber , capacity;
	public String model , brand;
	public LocalDateTime manufacturingYear;
	public ArrayList<String>logs = new ArrayList<String>();
	
	public VehicalCategory category;

	public Vehical(int licenceNumber, int capacity, String model, String brand, LocalDateTime manufacturingYear,
String logs,VehicalCategory category) {
		
		this.licenceNumber = licenceNumber;
		this.capacity = capacity;
		this.model = model;
		this.brand = brand;
		this.manufacturingYear = manufacturingYear;
		this.logs.add(logs);
		this.category = category;
		
		VehicalInventory.addVehicle(category, this);
	}
	
	public void addLogs(String log)
	{
		logs.add(log);
	}
	
	public ArrayList<String>getLogs()
	{
		return logs;
	}
	
	
}
