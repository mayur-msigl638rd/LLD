import java.util.ArrayList;

public class Page {

	public String name , description , id;
	public ArrayList<Member>members;
	public Page(String name, String description, String id, ArrayList<Member> members) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
		this.members = new ArrayList<Member>();
	}
	
	public int getTotalMeber() 
	{
		return members.size();
	}
}
