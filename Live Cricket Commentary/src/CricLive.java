import java.util.ArrayList;

public class CricLive {
	private Admin admin;
	private ArrayList<Tournament> tournaments;
	private ArrayList<Commentator> commentators;
	public CricLive(Admin admin) {
		super();
		this.admin = admin;
		this.tournaments = new ArrayList<>();
		this.commentators = new ArrayList<>();
		
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public ArrayList<Tournament> getTournaments() {
		return tournaments;
	}
	public void setTournaments(ArrayList<Tournament> tournaments) {
		this.tournaments = tournaments;
	}
	public ArrayList<Commentator> getCommentators() {
		return commentators;
	}
	public void setCommentators(ArrayList<Commentator> commentators) {
		this.commentators = commentators;
	}
   
	
}
