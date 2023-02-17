
public class Post {
public Member owner;
public String postId , text;
public int totalLikes, totalShares;
public Post(Member owner, String postId, String text, int totalLikes, int totalShares) {
	super();
	this.owner = owner;
	this.postId = postId;
	this.text = text;
	this.totalLikes = 0;
	this.totalShares = 0;
}

public void addLike()
{
	totalLikes++;
}


}
