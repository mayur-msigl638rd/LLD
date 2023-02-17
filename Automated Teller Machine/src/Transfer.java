import java.time.LocalDateTime;

public class Transfer extends Transaction {

	public String sourceAccountNumber , destAccountNumber;
	public Transfer(String id, LocalDateTime date, String sourceAccountNumber,String destAccountNumber) {
		
		super(id, date , status);
		this.sourceAccountNumber = sourceAccountNumber;
		this.destAccountNumber = destAccountNumber;
		
		// TODO Auto-generated constructor stub
	}

	public void send(int amount)
	{
		
	}
		
	
	

}
