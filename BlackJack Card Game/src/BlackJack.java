
public class BlackJack {

	private Dealer dealer;
	private Player player;
	private Deck deck;
	private double betAmount;
	
	public BlackJack(Player player, double betAmount)
	{
		this.player = player;
		this.betAmount = betAmount;
		this.dealer = new Dealer();
		this.deck = new Deck();
	}
}
