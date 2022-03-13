package ParentPackage;

public class Board{
	AllLadders mAllLadders = new AllLadders();
	AllSnakes mAllSnakes = new AllSnakes();
	AllPlayers mAllPlayers = new AllPlayers();
	
	public void initializeBoard(){
		System.out.println("!!!Lets Play Snake Ladder Game!!!");
		mAllSnakes.initializeSnake();
		mAllLadders.initializeLadder();
		mAllPlayers.initializePlayer();
	}
	
	public void addLadder(int bottom,int top){
		mAllLadders.addLadder(bottom,top);
	}
	
	public void addSnake(int head,int tail){
		mAllSnakes.addSnake(head,tail);
	}
	
	public void addPlayer(String playerNamer){
		mAllPlayers.addPlayer(playerNamer);
	}
	
	public int getPlayerCount(){
		return mAllPlayers.getPlayerCount();	
	}
	
	public String getPlayerName(int playerInd){
		return mAllPlayers.getPlayerName(playerInd);
	}
	
	public int getPlayerPosition(int playerInd){
		return mAllPlayers.getPlayerPosition(playerInd);
	}
	
	public void updatePlayerPosition(int playerInd,int position){
		mAllPlayers.updatePlayerPosition(playerInd,position);
	}
	
	public int calcSnakeLadder(int position){
		Info snakeInfo  = mAllSnakes.getSnakeInfo(position);
		int finalPositon=position;
		if(snakeInfo.checkAvailibility()){
			finalPositon = snakeInfo.getFinalPosition();
			return calcSnakeLadder(finalPositon);
		}
		Info ladderInfo = mAllLadders.getLadderInfo(position);
		if(ladderInfo.checkAvailibility()){
			finalPositon = ladderInfo.getFinalPosition();
			return calcSnakeLadder(finalPositon);
		}
		return finalPositon;
	}
}
