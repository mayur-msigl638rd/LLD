
public class BalanceInquiry extends Transaction {
	
public String accountNumber;
public BalanceInquiry(String id , String Status , LocalDateTime date, String accountId)
{
	super(id , status , date);
	this.accountNumber = accountId;
}

public void getDetails()
{
	
}



}
