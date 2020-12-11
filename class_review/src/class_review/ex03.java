package class_review;
//if문으로 i변수가 5를 넘게 되면 순환문이 중단되게 하기

public class ex03 {
	public static void main(String[] args) {
		int i = 0;
		
		while(true) {
			System.out.println(i);
			i++;
			if(i>=5) {break;}
		}
	}
}
