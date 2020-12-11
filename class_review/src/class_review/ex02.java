package class_review;
/*
 * 1.구구단 4단 (4*9까지)
 * 출력화면 예시) a * i = a 와 i의 곱한 결과 값
 */
public class ex02 {
	public static void main(String[] args) {
		int i = 1 ;
		int a = 4 ;
		while (i<=9) {
			System.out.println(a+ "*" +i +"=" +(a*i));
			i++;//왜 꼭 여기다가 넣어야할까?
		}
	}

}
