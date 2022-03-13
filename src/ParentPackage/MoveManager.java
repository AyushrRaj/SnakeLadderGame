package ParentPackage;

public class MoveManager{
	private Board board;
	int currPlayerInd;
	int totalPlayers ;
	public MoveManager(Board mboard){
		board = mboard;
		currPlayerInd=-1;
		totalPlayers = board.getPlayerCount();
	}
	
	public void playGame(){
		while(true){
			// Print to notify that game is running
			if(makeMove(getNextPlayer())){
				break;
			}
		}
	}
	
	private int  getNextPlayer(){
		currPlayerInd=currPlayerInd+1;
		currPlayerInd=currPlayerInd%totalPlayers;
		return (currPlayerInd);
	}
	
	private boolean makeMove(int playerInd){
		int diceValue = Dice.rollDice();
		int initialPosition = board.getPlayerPosition(playerInd);
		int finalPositon = diceValue+initialPosition;
		String playerName = board.getPlayerName(playerInd);
		if(finalPositon>=100){
			System.out.println("!!!!  " + playerName + "  WIN ");
			return true;
		}
		finalPositon = board.calcSnakeLadder(finalPositon);
		board.updatePlayerPosition(playerInd,finalPositon);
		System.out.println(playerName+" got "+ diceValue + " Moved From: "+initialPosition+"  To:  "+finalPositon);
		return false;
	}
}
