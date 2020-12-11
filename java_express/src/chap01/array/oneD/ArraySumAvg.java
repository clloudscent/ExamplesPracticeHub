package chap01.array.oneD;

import java.util.Scanner;

public class ArraySumAvg {
	public static void main(String[] args) {
		// 1학년 1반 학생 10명의 수학성적의 합계와 평균을 구하시오.
		// 학생들의 수학성적은 정수로 입력받으시오.
		Scanner sc = new Scanner(System.in);
		int math[] = new int[10];		// 10개의 배열요소를 갖는 배열 생성
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < math.length; i++) {
			math[i] = sc.nextInt();
		}
		
		for (int i = 0; i < math.length; i++) {
			System.out.print(math[i] + " ");
		}
		System.out.println();
		
		// 합계
		for (int i = 0; i < math.length; i++) {
			// (최종합계) = (현재합계) + (i번 점수)
			sum = sum + math[i];
		}
		
		// (정수)와 (정수)를 연산 : (정수)
		// (실수) = (정수) / (정수)
		// (실수) = (실수) / (정수)
		// (double) : 강제형변환 = 캐스팅
		avg = (double) sum / math.length;			
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
	}
}
