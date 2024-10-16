package loops;

public class NumberTriangle {

	private int number;

	public NumberTriangle(int number) {
		// TODO Auto-generated constructor stub
		this.number=number;
	}


	public void numberTriangle() {
		// TODO Auto-generated method stub
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
