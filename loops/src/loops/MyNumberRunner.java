package loops;

import java.util.Scanner;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int userNumber=scanner.nextInt();
		MyNumber number=new MyNumber(userNumber);
		boolean isPrime=number.isPrime();
		System.out.println("The given number is prime "+isPrime);

	}

}
