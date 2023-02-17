
public class Customer extends Account {

	public Boolean frequentFlyer;

	 public Customer(String id, String password, String name, String email, String phone, Passport passport,
			AccountStatus status) {
		super(id, password, name, email, phone, passport, status);
		// TODO Auto-generated constructor stub
	}
	 public Customer(String id, String password, String name, String email, String phone, Passport passport,
				AccountStatus status, Boolean frequentFlyer) {
			super(id, password, name, email, phone, passport, status);
this.frequentFlyer = frequentFlyer;

	 }	
	 }
	

