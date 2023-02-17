
public class Address {

	public String apartments , area, landmark , city , state, country;

	public Address(String apartments, String area, String landmark, String city, String state, String country) {
		super();
		this.apartments = apartments;
		this.area = area;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	// Constructor overloading
	public Address(String apartments, String area, String city, String state, String country) {
		super();
		this.apartments = apartments;
		this.area = area;
		this.landmark = "";
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
