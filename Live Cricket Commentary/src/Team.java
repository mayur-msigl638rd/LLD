import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player>players;
	public Team(String name) {
		super();
		this.name = name;
		this.players = new ArrayList<>();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	

}
