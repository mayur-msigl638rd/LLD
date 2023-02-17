
public class Librarian extends Account {
	
	Librarian(String id , String pass , User person)
	{
		super(id , pass , person);
	}

	public  void addBook(Book book)
	{
		System.out.println("Book added");
		
	}
	
	public void registerUser()
	{
		
	}
}
