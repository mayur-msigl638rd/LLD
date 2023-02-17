import java.time.LocalDateTime;

public class Deposite extends Transaction{
	
	public int amount;

	public Deposite(String id, LocalDateTime date, int amount ,String status) {
		super(id, date, status);
		this.amount = amount;
		
	}

	public void getTotalBalance() {
		
	}
	
	

}
