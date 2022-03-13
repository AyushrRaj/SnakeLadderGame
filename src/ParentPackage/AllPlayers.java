package ParentPackage;

import java.util.ArrayList;
import java.util.HashMap;

public class AllPlayers{
	HashMap<Player,Integer> playerPositionMap = new HashMap<Player, Integer>();
	ArrayList<Player>  mAllPlayers = new ArrayList<Player>();
	
	public void addPlayer(String playerName){
		Player player = new Player(playerName);
		playerPositionMap.put(player,0);
		mAllPlayers.add(player);
	}
	
	public String getPlayerName(int playerInd){
		return mAllPlayers.get(playerInd).getPlayerName();	
	}
	
	public int getPlayerPosition(int playerInd){
		Player player = mAllPlayers.get(playerInd);
		return playerPositionMap.get(player);
	}
	
	public int getPlayerCount(){
		return mAllPlayers.size();
	}
	
	public void updatePlayerPosition(int playerInd,int position){
		Player player = mAllPlayers.get(playerInd);
		playerPositionMap.put(player,position);
	}
	
	public void initializePlayer(){
		System.out.print("Enter Number of Players");
		int playerCnt = Input.getIntegerInput();
		System.out.println();
		for(int i=0;i<playerCnt;i++){
			String playerName;
			System.out.print((i+1)+". Enter Player Name: ");
			playerName = Input.getStringInput();
			addPlayer(playerName);
			System.out.println();
		}
	}
}

