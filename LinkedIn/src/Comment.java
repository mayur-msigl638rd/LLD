
public class Comment {
public String commentId, text;
public int totalLikes;
public Member owner;
public Comment(String commentId, String text, int totalLikes, Member owner) {
	super();
	this.commentId = commentId;
	this.text = text;
	this.totalLikes = totalLikes;
	this.owner = owner;
}

public void addLike()
{
	totalLikes++;
	
}


}
