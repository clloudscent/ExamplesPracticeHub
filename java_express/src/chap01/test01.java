package chap01;

import java.util.Scanner;

public class test01 {
	// 클래스 : 객체를 정의하는 설계도
	
	// main :  ctrl + space 
	// 프로그램의 시작
	public static void main(String[] args) {
		// 입력문
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언 및 초기화
		// [자료형] [변수명] = [값];
		int num = sc.nextInt();
		
		
		// 조건문
		// 3의 배수인지 아닌지 확인하고 그 여부를 출력하시오.
		// if( [조건] ) {} else {}
		// 1 % 3 = 1
		// 2 % 3 = 2
		// 3 % 3 = 0
		// 4 % 3 = 1
		// 5 % 3 = 2
		// 6 % 3 = 0
		// 9 % 3 = 0
		// 출력문
		if( num % 3 == 0 ) {
			// sysout : ctrl + space
			System.out.println("3의 배수 입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		
	}

}
