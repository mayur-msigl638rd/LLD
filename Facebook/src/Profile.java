import java.util.ArrayList;

public class Profile {

	public String ProfilePic , coverPic, gender;
	public ArrayList<String> experiences;
	public String place;
	public Profile(String profilePic, String coverPic, String gender, ArrayList<String> experiences, String place) {
		super();
		ProfilePic = profilePic;
		this.coverPic = coverPic;
		this.gender = gender;
		this.experiences = new ArrayList<String>();
		this.place = place;
	}
	
	
}
