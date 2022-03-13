package ParentPackage;

import java.util.Random;

public class Dice{
	static Random random = new Random();
	static int rollDice(){
		return random.nextInt(6)+1;
	}
}
