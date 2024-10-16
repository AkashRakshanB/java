package loops;

import java.util.Scanner;

public class DoWhileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter Number- ");
			number=scanner.nextInt();
			if(number>=0) {
				System.out.println("Cube is "+(number*number*number));
			}
			else {
				System.out.println("Thank You! Have Fun!");
			}
		}while(number>=0);

	}

}
