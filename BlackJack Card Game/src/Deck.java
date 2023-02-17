import java.util.ArrayList;

public class Deck {
private ArrayList<Card>cards;
private int nextCardIndex;

public Deck()
{
	cards = new ArrayList<>();
	createDeck();
	nextCardIndex = 0;
	
}

private void createDeck()
{
	for(Suit s : Suit.values())
	{
		for(Rank r: Rank.values())
		{
			Card c = new Card(s,r);
			cards.add(c);
		}
	}
}
}
