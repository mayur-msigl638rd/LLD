
public class User {
private String name , address, email ,phone;
private Integer userId;
static Integer  userCount =1;

public User(String name, String address, String email, String phone, Integer userId) {
	super();
	this.name = name;
	this.address = address;
	this.email = email;
	this.phone = phone;
	this.userId = userId;
}

}
