import java.util.ArrayList;

public class Member extends Account{

	public int id;
	public ArrayList<Member>following, followers;
	public ArrayList<Job>pageFollow;
	public Member(String id, String password, Person person, AccountStatus status, int id2, ArrayList<Member> following,
			ArrayList<Member> followers, ArrayList<Job> pageFollow) {
		super(id, password, person, status);
		this.id = id2;
		this.following = following;
		this.followers = followers;
		this.pageFollow = new ArrayList<Job>();
		
	}
	
	public void sendMessage(String msg)
	{
		
	}
	
	public void createPost()
	{
		
	}
	
	public void sendRequest(Member name)
	{
		
	}
	
	
	
}
