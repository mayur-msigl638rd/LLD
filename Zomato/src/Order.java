import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
public String orderId;
public Customer customer;
public DeliveryPerson delivery;
public LocalDateTime creationOrder;
public PaymentMethod billingMode;
public ArrayList<FoodItem>meal;
public Order(String orderId, Customer customer, DeliveryPerson delivery, LocalDateTime creationOrder,
		PaymentMethod billingMode, ArrayList<FoodItem> meal) {
	super();
	this.orderId = orderId;
	this.customer = customer;
	this.delivery = delivery;
	this.creationOrder = creationOrder;
	this.billingMode = billingMode;
	this.meal = new ArrayList<FoodItem>();
}
public void addMeal(FoodItem dish)
{
	meal.add(dish);
	
}

}
