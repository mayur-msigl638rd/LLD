
public class Board {
private Block[][] blocks;

public Board()
{
	intializeBoard();
	
}

private void intializeBoard()
{
	blocks[0][0] = new Block(x:0, y:0 , new Rook(white:true));
	blocks[0][1] = new Block(x:0, y:1 , new Knight(white:true));
	blocks[0][2] = new Block(x:0, y:2 , new Bishop(white:true));
	blocks[0][3] = new Block(x:0, y:3 , new Queen(white:true));
	blocks[0][4] = new Block(x:0, y:4 , new King(white:true));
	blocks[0][5] = new Block(x:0, y:5 , new Bishop(white:true));
	blocks[0][6] = new Block(x:0, y:6 , new Knight(white:true));
	blocks[0][7] = new Block(x:0, y:7 , new Rook(white:true));
	
	for(int j =0; j<8 ; j++)
		blocks[1][j] = new Block(x:1 , j , new Pawn(white: true));
	
	blocks[7][0] = new Block(x:7, y:0 , new Rook(white:false));
	blocks[7][1] = new Block(x:7, y:1 , new Knight(white:false));
	blocks[7][2] = new Block(x:7, y:2 , new Bishop(white:false));
	blocks[7][3] = new Block(x:7, y:3 , new Queen(white:false));
	blocks[7][4] = new Block(x:7, y:4 , new King(white:false));
	blocks[7][5] = new Block(x:7, y:5 , new Bishop(white:false));
	blocks[7][6] = new Block(x:7, y:6 , new Knight(white:false));
	blocks[7][7] = new Block(x:7, y:7 , new Rook(white:false));
	
	for(int j =0 ; j<8 ; j++)
	blocks[6][j] = new Block(x:6,j,new Pawn(white:false));

	for(int i =2; i<6; i++)
		for(int j =0 ; j<8; j++)
		{
			blocks[i][j] = new Block(i,j,piece: null);
		}
}




}
