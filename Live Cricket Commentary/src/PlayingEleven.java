import java.util.ArrayList;

public class PlayingEleven {
	private ArrayList<Player>players;
	private Player twelfthMan;
	
	public PlayingEleven() {
		this.players = new ArrayList<>();
		
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public Player getTwelfthMan() {
		return twelfthMan;
	}

	public void setTwelfthMan(Player twelfthMan) {
		this.twelfthMan = twelfthMan;
	}
	
	
	
}
