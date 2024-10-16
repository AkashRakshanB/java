package loops;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stubwhile(number>0) {
		int a=123456789;
		int temp=0;
		while(a>0) {
			temp=(temp*10)+(a%10);
			a/=10;
		}
		
	
	System.out.println(temp);

	}

}
