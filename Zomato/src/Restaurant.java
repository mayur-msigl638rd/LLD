import java.util.ArrayList;

public class Restaurant {

	public String name;
	public ArrayList<Branch>branches;
	public Restaurant(String name, Branch initialBranch) {
		super();
		this.name = name;
		this.branches = new ArrayList<Branch>();
		this.branches.add(initialBranch);
		
	}
	
	public void addBranch(Branch branch)
	{
		this.branches.add(branch);
		
	}
	
}
