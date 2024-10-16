package loops;

import java.util.Scanner;

public class NumberTriangleRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		NumberTriangle triangle=new NumberTriangle(number);
		triangle.numberTriangle();
		
	}

}
