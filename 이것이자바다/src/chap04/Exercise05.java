package chap04;
//for 문을 이용해 방정식 4x+5y=60의 모든 해를 구해서 (x,y)형태로 출력
//x,y는 자연수
public class Exercise05 {
	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x + 5*y) ==60){
					System.out.println("(" + x + "." + y + ")");
					
				}
			}
		}		
	}
}
