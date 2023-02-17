import java.util.*;
import java.io.*;
import java.time.LocalDateTime;

public class Transaction {
public String id;
public LocalDateTime date;
public TransactionStatus status;
public TransactionType type;
public Transaction(String id, LocalDateTime date, TransactionStatus status, TransactionType type) {
	super();
	this.id = id;
	this.date = date;
	this.status = status;
	this.type = type;
}

public Transaction(String id2 , String status2 , LocalDateTime date2)
{
	
}

public void makeTransaction() {
	
}

public void saveTransaction() {
	
}
}
