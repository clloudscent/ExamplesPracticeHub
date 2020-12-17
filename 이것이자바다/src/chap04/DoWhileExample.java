package chap04;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		
		// do~while {} ();
		// 무조건 1회 실행 후 조건 검사
		do {
			System.out.print(">");
			inputString = scanner.nextLine();		// 입력 -> inputString
			System.out.println(inputString);		// 출력
		} while( !inputString.equals("q") );		// inputString == "q" 검사
													// ! : NOT 연산 : true면 false ,  false면 true
		
		
		System.out.println();
		System.out.println("프로그램 종료");
	}		
}


