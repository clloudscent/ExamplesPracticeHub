package chap04;

public class BreakOutterExample {
	public static void main(String[] args) {
		
		
		// break
		// 	: 현재 반복문 탈출
		// break width Label
		//	: 라벨을 지정한 위치의 반복문을 탈출
		Outter: 
		for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		
		System.out.println("프로그램 실행 종료");
	}
}
