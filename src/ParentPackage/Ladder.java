package ParentPackage;

public class Ladder{
	int mBottom;
	int mTop;
	public Ladder(int bottom,int top){
		mBottom=bottom;
		mTop=top;
	}
	
	boolean checkLadder(int position){
		return mBottom==position;
	}
	
	int getFinalPosition(){
		return mTop;
	}
}

