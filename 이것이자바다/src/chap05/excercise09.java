package chap05;

import java.util.Scanner;

/*
 * 1번은 학생수를 입력받고 입력받은 숫자는 studentNum 저장
 * studentNum가 배열의 갯수가 됨
 * 2번은 점수입력, 점수 입력은 배열로 받으면 됨
 * int[] score 이걸로 점수 받으면 됨
 * 3번은 출력
 * 4번은 점수 분석:최고점수구하고 평균점수구하고, 
 * 최고점수출력, 평균점수 출력
 * 5번은 종료
 * */
public class excercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // 인원수
		int[] scores = null; // 점수가 저장될 배열 변수
		Scanner scanner = new Scanner(System.in); // 키보드 입력값을 객체생성 scanner객체변수에 저장
		// 아래 부터는 scanner객체 변수를 통해서 외부에 데이터 입력을 관리하게 된다.

		while (run) { // 메뉴 출력
			System.out.println("------------------------------------------");
			System.out.println("1.학생수  | 2.점수입력  | 3.점수리스트| 4.분석| 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt(); // 다음에 들어오는 정수형 데이터를 int selectNo변수에 저장한다

			if (selectNo == 1) { // if로 들어가서 1하고 같냐고 물어보는것임. selectNo에 저장된 수가 1이냐 하고 물어보는것.
				System.out.print("학생수> ");// 참이면 학생수라는 글자를 출력
				studentNum = scanner.nextInt(); // 학생수를 입력 받아야하니까 nextInt메소드가 나옴.이 메소드가 있어야 정수를 입력받음.학생수를 입력받음.
				// studentNum에 학생수가 저장됨.

				scores = new int[studentNum]; // scores변수에 배열을 저장하는데 new int[입력된수];입력된 수 가 배열의 갯수를 정하는 대괄호 안에 들어가서,
				// 외부에서 입력한 학생수가 곧 배열의 갯수가 된다. 그리고 만들어진 배열객체는 scores배열변수로 저장이된다.

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {// 입력을 위한 for이 시작됨. i는 배열의 0번 인덱스부터 입력을 시작.0이들어감
					// 총 길이는 배열의 양만큼 들어가야 하니까 scores.length 는 배열의 길이인데 배열은 0번부터 시작하니까
					// length 보다 1작게 반복이 되면 된다. 그리고 i++을 통한 인덱스 증가
					System.out.print("scores[" + i + "]> ");
				
				// 실행결과에 보면 scores[1]...이런식으로 나옴
				// scores[인덱스번호i]가 들어간다.

				
					scores[i] = scanner.nextInt(); 
				}
				// scanner.nextInt() <-이 메소드를 통해서 외부에서 키보드를 숫자로 입력
				// 그것이 해당 회차의 scores[i인덱스]에 점수로 들어간다.
				// 점수 저장 끝
			}
			 else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) { //i는 0번부터 인덱스번호가 됨. 이번 기능은 출력.
					//위와 똑같이 scores는 0번 인덱스부터 시작하니까. length의 길이보다 1이 작게 끝난다.그래서 <이러한 부호가 들어감.
					
					System.out.println("score[" + i + "] :" + scores[i]);
					//scores 인덱스 번호에 따라서 반복해서 출력한다.
					//3번의 내부for문은 이러한 scores점수를  전부 출력한다.
				}
				
				
				
			} else if (selectNo == 4) {
				int max = 0; //max최대값
				int sum = 0; //누적합
				double avg = 0; //avg평균
				for (int i = 0; i < scores.length; i++) { //for문이 최댓값을 구하고 누적합을 구하기 위해서 작동한다.
					//  ( [ 조건 ] ) ? [A] : [B] ;
					//  [조건]이 참일 때 A 실행, 거짓일 때 B 실행
					max = (max < scores[i]) ? scores[i] : max;
					//3항 연산식을 통해서 max와 scores[인덱스]를 비교해서 
					//max가 작은게 true가 되면 scores[i]를 선택해서 최좌측에 있는 max변수에 보낸다.
					
					sum += scores[i];
					// sum= sum+scpres[i]
					//scores[i]를  sum에 누적합 한다.
				}
				avg = (double) sum / studentNum;
				//전역변수인 studentNum에 저장된 학생수를 누적합인 sum을 더블형으로 캐스팅해서 서로 나눈다.
				//누적합/학생수 =>평균이 나옴
				
				System.out.println("최고점수 :" + max); //최고점수출력
				
				System.out.println("평균점수 :" + avg); //평균점수출력
				
			} else if (selectNo == 5) {
				run = false; //run에 false를 줘서 while이 반복을 못하게 막음.종료시킴.

			}
		}
		System.out.println("프로그램 종료"); //반복문이 끝나면 프로그램 종료
	}

}
