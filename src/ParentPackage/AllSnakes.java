package ParentPackage;

import java.util.ArrayList;
public class  AllSnakes{
	ArrayList<Snake> mSnakes = new ArrayList<Snake>();
	
	public void addSnake(int head,int tail){
		Snake snake = new Snake(head,tail);
		mSnakes.add(snake);
	}
	// pair of is Snake Available and its final position if available
	Info getSnakeInfo(int position){
		Info snakeInfo=new Info();
		for(Snake snake: mSnakes){
			if(snake.checkSnake(position)){
				snakeInfo.setAvailibility();
				snakeInfo.setFinalPosition(snake.getFinalPosition());
				break;
			}
		}
		return snakeInfo;
	}
	
	public void initializeSnake(){
		System.out.print("Enter Number of Snakes");
		int snakeCnt = Input.getIntegerInput();
		System.out.println();
		for(int i=0;i<snakeCnt;i++){
			int head,tail;
			System.out.print((i+1)+". Enter Snake Head: ");
			head = Input.getIntegerInput();
			System.out.print("Enter Snake Tail: ");
			tail = Input.getIntegerInput();
			System.out.println();
			addSnake(head,tail);
		}
	}
	
}

