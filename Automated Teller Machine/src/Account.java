
public class Account {
public String accountNumber;
public int availableBalance;
public Bank bank;
public Status status = Status.ACTIVE;
public Account(String accountNumber, int availableBalance, Bank bank) {
	super();
	this.accountNumber = accountNumber;
	this.availableBalance = availableBalance;
	this.bank = bank;
}
public String getAccountNumber() {
	return accountNumber;
}

public int getAvailableBalance() {
	return availableBalance;
}




}
