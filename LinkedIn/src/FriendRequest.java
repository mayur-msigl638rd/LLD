import java.time.LocalDateTime;

public class FriendRequest {
public Member requestFrom , requestTo;
public RequestStatus status;
public LocalDateTime created , updated;
public FriendRequest(Member user1 , Member user2) {
	super();
	this.requestFrom = user1;
	this.requestTo = user2;
	this.status = RequestStatus.PENDING;
	this.created = LocalDateTime.now();
	
}

public void accept()
{
	
}

public void reject()
{
	
}

}
