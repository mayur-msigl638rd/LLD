
public class Player {

	private String name;
	private double amount;
	private Hand hand;
	public Player(String name, double amount) {
		super();
		this.name = name;
		this.amount = amount;
		this.hand = new Hand();
	}
	
	
}
