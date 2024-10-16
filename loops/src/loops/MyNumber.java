package loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		// TODO Auto-generated constructor stub
		this.number=number;
	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
		if(number<2) {
			return false;
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}

}
