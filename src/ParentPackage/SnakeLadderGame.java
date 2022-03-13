package ParentPackage;

public class SnakeLadderGame extends BoardGame{
	Board board ;
	MoveManager moveManager;
	public void initializeBoard(){
		board = new Board();
		board.initializeBoard();
	};
	
	public void playGame(){
		moveManager = new MoveManager(board);
		moveManager.playGame();
	}
}