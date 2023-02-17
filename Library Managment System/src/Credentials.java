import java.util.HashMap;

public class Credentials {

	
	private HashMap<String ,String> loginPass = new HashMap<>();
	Credentials(String username ,String password)
	{
		if(loginPass.containsKey(username))
		{
			System.out.println("Invalid username already exist");
			
		}
		else
			loginPass.put(username , password);
	}
	
	public boolean login (String username , String password)
	{
		if(loginPass.get(username) ==password)
		{
			System.out.println("loggd in suuccesfully");
			return true;
		}
		
		return false;
	}
}
