package loops;

public class SumOfDivisors {

	private int number;

	public SumOfDivisors(int number) {
		// TODO Auto-generated constructor stub
		this.number=number;
	}

	public int sumOfDivisors() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	
	}

}
