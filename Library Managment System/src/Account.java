
public class Account {

	private String id , password ,name;
	private boolean status = true;
	private Credentials credentials;
	private User person;
	public Account(String id, String password, String name, boolean status, Credentials credentials, User person) {
		
		this.id = id;
		this.password = password;
		this.name = name;
		this.status = status;
		this.credentials = credentials;
		this.person = person;
	}
	
	public void resetPassword()
	{
		this.password = "";
	}
}
