
public class DebitCard {
public String name , cardNumber;
public int cvv ;
public LocalDateTime expiryDate;
public DebitCard(String name, String cardNumber, int cvv, LocalDateTime expiryDate) {
	super();
	this.name = name;
	this.cardNumber = cardNumber;
	this.cvv = cvv;
	this.expiryDate = expiryDate;
}


}
