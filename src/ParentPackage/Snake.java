package ParentPackage;

public class Snake{
	int mHead;
	int mtail;
	public Snake(int head,int tail){
		mHead=head;
		mtail=tail;
	}
	
	boolean checkSnake(int position){
		return mHead==position;
	}
	
	int getFinalPosition(){
		return mtail;
	}
}