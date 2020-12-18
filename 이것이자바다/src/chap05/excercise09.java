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
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수  | 2.점수입력  | 3.점수리스트| 4.분석| 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("score[" + i + "] :" + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고점수 :" + max);
				System.out.println("평균점수 :" + avg);
			} else if (selectNo == 5) {
				run = false;

			}
		}
		System.out.println("프로그램 종료");
	}

}
