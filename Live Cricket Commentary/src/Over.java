import java.util.ArrayList;

public class Over {
	private int number;
	private ArrayList<Ball>balls;
	public Over(int number, ArrayList<Ball> balls) {
		super();
		this.number = number;
		this.balls = new ArrayList<>();
		
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public ArrayList<Ball> getBalls() {
		return balls;
	}
	public void setBalls(ArrayList<Ball> balls) {
		this.balls = balls;
	}
	
	
	
	
}
