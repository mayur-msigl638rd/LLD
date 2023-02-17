import java.util.ArrayList;

public class Customer extends Person{

	public ArrayList<Order>orders;

	public Customer(String name, String email, String phone, Address address) {
		super(name, email, phone, address);
		// TODO Auto-generated constructor stub
	}
	
	public void addOrders(Order order)
	{
		this.orders.add(order);
		
	}
	public Boolean receiveOrder(Order order)
	{
		if(!orders.contains(order))
			return false;
		
		this.orders.remove((order));
		return true;
		
	}
}
