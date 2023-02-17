import java.util.ArrayList;

public class DeliveryPerson extends Person{
	public ArrayList<Order>deliveries;

	public DeliveryPerson(String name, String email, String phone, Address address) {
		super(name, email, phone, address);
		// TODO Auto-generated constructor stub
	}
	
	public void addDeliveries(Order order)
	{
		this.deliveries.add(order);
	}
	
	public Boolean deliverItem(Order order)
	{
		if(!deliveries.contains(order))
			return false;
		this.deliveries.remove(order);
		return true;
	}
	

}
