
public class King extends Piece{

	private boolean castlingDone = false;
	
	public King(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	public boolean isCastlingDone() {
		return castlingDone;
	}

	public void setCastlingDone(boolean castlingDone) {
		this.castlingDone = castlingDone;
	}
	

}
