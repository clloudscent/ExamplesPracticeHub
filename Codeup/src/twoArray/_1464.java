package twoArray;

import java.util.Scanner;

public class _1464 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [][] arr = new int[N][M]; // N = 3, M = 4
		int start = N*M;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = start--;
				// 전위연산자
				// y = ++x;	:   ① x = 4 + 1;
				//				② y = x;
				// 후위연산자
				// y = x++; :	① y = x;
				//				② x = x + 1;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
