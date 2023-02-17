import java.util.ArrayList;

public class Game {
private Board board;
private Player player1;
private Player player2;

private boolean whiteTurn ;
private ArrayList<Move>gameLog;
private Status status;

public Game(Player player1 , Player player2)
{
	this.player1 = player1;
	this.player2 = player2;
	this.board = new Board();
	this.whiteTurn = true;
	this.status = Status.ACTIVE;
	this.gameLog = new ArrayList<>();
	
}
}
