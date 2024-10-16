package loops;

public class WhileNumber {

	private int limit;

	public WhileNumber(int limit) {
		// TODO Auto-generated constructor stub
		this.limit=limit;
	}

	public void squareUptoLimit() {
		// TODO Auto-generated method stub
		int i=1;
		while(i*i<limit) {
			System.out.print(i*i+" ");
			i++;
		}
		System.out.println();
		
	}

	public void cubeUptoLimit() {
		// TODO Auto-generated method stub
		int i=1;
		while(i*i*i < limit) {
			System.out.print(i*i*i+" ");
			i++;
		}
		
	}
	

}
