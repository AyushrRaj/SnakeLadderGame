package ParentPackage;

import java.util.ArrayList;

public class AllLadders{
	ArrayList<Ladder> mLadders = new ArrayList<Ladder>();
	public void addLadder(int bottom,int top){
		Ladder ladder = new Ladder(bottom,top);
		mLadders.add(ladder);
	}
	// pair of is Ladder Available and its top position if available
	Info getLadderInfo(int position){
		Info ladderInfo = new Info();
		for(Ladder ladder: mLadders){
			if(ladder.checkLadder(position)){
				ladderInfo.setAvailibility();
				ladderInfo.setFinalPosition(ladder.getFinalPosition());
				break;
			}
		}
		return ladderInfo;
	}
	
	public void initializeLadder(){
		System.out.print("Enter Number of Ladders");
		int ladderCnt = Input.getIntegerInput();
		System.out.println();
		for(int i=0;i<ladderCnt;i++){
			int bottom,top;
			System.out.print((i+1)+". Enter Ladder Bottom: ");
			bottom = Input.getIntegerInput();
			System.out.print("Enter Ladder Top: ");
			top = Input.getIntegerInput();
			System.out.println();
			addLadder(bottom,top);
		}
	}
	
}
