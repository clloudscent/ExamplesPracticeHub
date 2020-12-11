package _december;

public class _dec02 {
	public static void main(String[] args) {
		int age = 22;
		String addr ="한국";
		
		// %n지시자를 사용안했을 경우
		System.out.printf("줄바꿈기능 ");
		System.out.printf("없음.");
		
		//%n지시자를 사용한 경우
		System.out.printf("줄바꾸기%n"); //%n:줄바꿈기능
		System.out.printf("성공%n");
		
		System.out.printf("내 나이는 %d살 입니다 %n", age); //%d:정수형식으로 출력
		System.out.printf("내 나이는 %d살 이고 %s에 살고 있습니다.%n", age, addr);
		
		
	}

}
