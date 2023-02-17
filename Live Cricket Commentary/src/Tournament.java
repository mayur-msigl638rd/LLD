import java.util.ArrayList;
import java.util.HashMap;

public class Tournament {
	private String title;
	private String host;
	private String year;
	private Team winner;
	private TournamentType type = TournamentType.UPCOMING;
	private ArrayList<Match> matches;
	
	private HashMap<String , Match> schedule;
	private HashMap<String, Integer> teamPoints;
	public Tournament(String title, String host, String year) {
		super();
		this.title = title;
		this.host = host;
		this.year = year;
		this.matches = new ArrayList<>();
		this.schedule = new HashMap<>();
		this.teamPoints = new HashMap<>();
		
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Team getWinner() {
		return winner;
	}
	public void setWinner(Team winner) {
		this.winner = winner;
	}
	public TournamentType getType() {
		return type;
	}
	public void setType(TournamentType type) {
		this.type = type;
	}
	public ArrayList<Match> getMatches() {
		return matches;
	}
	public void setMatches(ArrayList<Match> matches) {
		this.matches = matches;
	}
	public HashMap<String, Match> getSchedule() {
		return schedule;
	}
	public void setSchedule(HashMap<String, Match> schedule) {
		this.schedule = schedule;
	}
	public HashMap<String, Integer> getTeamPoints() {
		return teamPoints;
	}
	public void setTeamPoints(HashMap<String, Integer> teamPoints) {
		this.teamPoints = teamPoints;
	}
	
	
	
	
}
