
public class Move {
private Block startBlock;
private Block endBlock;

public Move(Block startBlock , Block endBlock)
{
this.startBlock = startBlock;
this.endBlock = endBlock;
}

public Block getStartBlock() {
	return startBlock;
}

public void setStartBlock(Block startBlock) {
	this.startBlock = startBlock;
}

public Block getEndBlock() {
	return endBlock;
}

public void setEndBlock(Block endBlock) {
	this.endBlock = endBlock;
}


}