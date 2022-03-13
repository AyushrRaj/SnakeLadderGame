package ParentPackage;

import java.util.Scanner;

public class Input{
	public static int getIntegerInput(){
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static String getStringInput(){
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
}
