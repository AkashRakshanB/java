package loops;

import java.util.Scanner;

public class SumOfNumbersRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		SumOfNumbers sum=new SumOfNumbers(number);
		System.out.println("Sum of N numbers are "+sum.sumUptoN());

	}

}
