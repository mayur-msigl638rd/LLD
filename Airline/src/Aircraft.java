
public class Aircraft {

	public String name , model , manufacturingYear;
	public int Seats;
	public Aircraft(String name, String model, String manufacturingYear, int seats) {
		super();
		this.name = name;
		this.model = model;
		this.manufacturingYear = manufacturingYear;
		Seats = seats;
	}
	
	
	public String getFlightName()
	{
		return name;
		
	}
}
