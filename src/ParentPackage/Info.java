package ParentPackage;

public class Info{
	boolean mIsAvailable=false;
	int mFinalPosition =-1;
	public void setAvailibility(){
		mIsAvailable=true;
	}
	
	public void setFinalPosition(int position){
		mFinalPosition=position;
	}
	
	public boolean checkAvailibility(){
		return mIsAvailable;
	}
	
	public int getFinalPosition(){
		return mFinalPosition;
	}
}