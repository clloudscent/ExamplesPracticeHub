package chap04;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		for(int i =0; i<3;i++) {
			sum1 += scores[i];
		}
		System.out.println("총합:" + sum1);
		
		// 메소드 호출 : 메소드를 실행
		// [메소드명]( 인자1, 인자2 );		-> 메소드명(매개변수1, 매개변수2)
		int sum2 = add(new int[] {83,90,87});
		System.out.println("총합 : " + sum2);
		System.out.println();
		
		int sum3 = add(new int[] {11,22,33});
		System.out.println("총합 : " + sum3);
		System.out.println();
	}
	 
	// 메소드 정의 : add
	// [접근지정자] (static) [리턴타입] [메소드명] ( [매개변수] ) {}
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
			// sum = sum + scores[i];
			//        0  + 83
			//		  83 + 90
			//		  83 + 90 + 87
		}
		
		// i				0			1			2
		// scores[i]		83			90			87	
		// sum				83			83+90		83+90+87
		
		
		return sum;
	}

}



