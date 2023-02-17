
public class Comment {

public String commentId , text;
public int totalLikes;
public Member owner;
public Comment(String commentId, String text, Member owner) {
	super();
	this.commentId = commentId;
	this.text = text;
	this.owner = owner;
}

public void addLike()
{
	totalLikes++;
}

}
