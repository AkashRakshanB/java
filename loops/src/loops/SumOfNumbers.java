package loops;

public class SumOfNumbers {

	private int number;

	public SumOfNumbers(int number) {
		// TODO Auto-generated constructor stub
		this.number=number;
	}

	public int sumUptoN() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=number;i++) {
			sum+=i;
		}
		return sum;
	}
	

}
