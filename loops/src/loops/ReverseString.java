package loops;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="dinesh";
		int i=0;
		int j=name.length()-1;
		char[] ch=name.toCharArray();
		while(i<j&&i!=j){
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		System.out.println(ch);

	}

}
