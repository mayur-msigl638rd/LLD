
public class Account {
public String id;
public String password;
public Person person;
public AccountStatus status;

public Account(String id, String password, Person person, AccountStatus status) {
	
	this.id = id;
	this.password = password;
	this.person = person;
	this.status = status;
}

public void resetPassword()
{
	this.password = " ";
}

}
