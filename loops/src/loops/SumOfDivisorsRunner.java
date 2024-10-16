package loops;

import java.util.Scanner;

public class SumOfDivisorsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		SumOfDivisors sum=new SumOfDivisors(number);
		System.out.println("The Sum of Divisors for the given number is "+sum.sumOfDivisors());

	}

}
