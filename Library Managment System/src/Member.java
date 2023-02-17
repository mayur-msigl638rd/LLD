import java.time.LocalDateTime;

public class Member extends Account {
	public int totalBook=0;

	 Member(String id, String pass, User person) {
		super(id, pass, person);
		
	}
	
	public void issueBook(Book book)
	{
		
	}
	
	public void renew(LocalDateTime today)
	{
		
	}
	
	public int getTotalBooks()
	{
		return totalBook;
	}
	
	

}
