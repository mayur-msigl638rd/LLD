import java.util.*;


public class System{
 HashMap<Customer,ArrayList<Order>>customerDB;
public HashMap<DeliveryPerson,ArrayList<Order>>deliveryDB;

public void addCustomerDetails(Customer user , Order order)
{
	customerDB.get(user).add(order);
}
	public ArrayList<Order>getCustomerDetails(Customer customer)
	{
		return customerDB.get(customer);
	}
	
	public void addDeliveryDetails(DeliveryPerson delivery, Order order)
	{
	deliveryDB.get(delivery).add(order);
	
	}

	public ArrayList<Order>getDeliveryDetails(DeliveryPerson delivery)
	{
		return deliveryDB.get(delivery);
		
	}
}
