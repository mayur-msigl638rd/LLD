
public abstract class User {
	private static int idcounter =0;
	private int id;
	private String name;
	
	public User(int id, String name) {
		super();
		idcounter+=1;
		this.id = idcounter;
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	

}
