
public class Member extends Account{

	public int totalVehicals = 0;
	public Member(String id, String password, Person person, AccountStatus status , int totalVehicals) {
		super(id, password, person, status);
		this.totalVehicals = totalVehicals;
		
	}
	

}
