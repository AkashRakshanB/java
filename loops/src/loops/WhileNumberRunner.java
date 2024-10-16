package loops;

import java.util.Scanner;

public class WhileNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int limit=scanner.nextInt();
		WhileNumber number=new WhileNumber(limit);
		number.squareUptoLimit();
		number.cubeUptoLimit();

	}

}
