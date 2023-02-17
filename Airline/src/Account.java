
public class Account {

	public String id , password, name , email , phone ;
	public Passport passport;
	public AccountStatus status;
	public Account(String id, String password, String name, String email, String phone, Passport passport,
			AccountStatus status) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.passport = passport;
		this.status = AccountStatus.ACTIVE;
	}
	
	
}
