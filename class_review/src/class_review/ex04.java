package class_review;
/*
 * 1.만약 i가 3으로 완전히 나누어지면 출력하지 않고 다음 반복을 실행(100까지)
 * 2.매 반복문 실행시 i값 출력
 */
public class ex04 {
	public static void main(String[] args) {
		int i = 0;
		for(i=0; i<100; i++) {
			if(i%3==0)
				continue;
			System.out.print(i);
		}
	}

}
