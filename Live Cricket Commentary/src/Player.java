import java.util.Date;

public class Player {
	private String name;
	private Date dob;
	private PlayerRecord record;
	private Team team;
	public Player(String name, Date dob, Team team) {
		super();
		this.name = name;
		this.dob = dob;
		this.team = team;
		this.record = new PlayerRecord();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public PlayerRecord getRecord() {
		return record;
	}
	public void setRecord(PlayerRecord record) {
		this.record = record;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	
}
