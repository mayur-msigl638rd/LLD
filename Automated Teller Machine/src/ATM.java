
public class ATM {

	public String atmId;
	public Bank bank;
	public Address address;
	public ATM(String atmId, Bank bank, Address address) {
		super();
		this.atmId = atmId;
		this.bank = bank;
		this.address = address;
	}
	
	public Boolean authenticateUser(String id , String pass)
	{
		if(id == "id " && pass == "password")
			return true;
		else
			return false;
	}
	
	public Boolean makeTransaction(Account user , int amount)
	{
		if(user.availableBalance <amount)
			return false;
		else
		{
			user.availableBalance -=amount;
			return true;
		}
	}
	
}
