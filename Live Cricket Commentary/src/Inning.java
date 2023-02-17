import java.util.ArrayList;

public class Inning {

	private int number;
	private ArrayList<Over>overs;
	public Inning(int number, ArrayList<Over> overs) {
		super();
		this.number = number;
		this.overs = new ArrayList<>();
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public ArrayList<Over> getOvers() {
		return overs;
	}
	public void setOvers(ArrayList<Over> overs) {
		this.overs = overs;
	}
	

	
}
