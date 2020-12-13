package twoArray;

import java.util.Scanner;

public class _1460 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] arr = new int[N][N];
		int cnt = 1;
		
		int [] a = new int[N];
		
		// 값을 1 부터 시작해서 NxN 까지 입력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = cnt++; 
			}
		}
		
		// 배열의 값을 공백을 한칸씩 두고 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");//한칸씩 띄고
			}
			System.out.println();//한줄씩 띄고
		}
		
		
		
	}
}
