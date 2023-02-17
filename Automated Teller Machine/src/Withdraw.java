import java.time.LocalDateTime;

public class withdraw extends Transaction{
	
	public int amount;
	public String accountNumber;
	
	public withdraw(String id , String status , LocalDateTime date , int amount , String accountNumber )
	{
		super(id , status ,date);
		this.amount = amount;
		this.accountNumber = accountNumber;
	}
	
	public int getAmount()
	{
		return amount;
	}

}
