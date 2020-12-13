package chap01.array.twoD;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[3][5];
		
		// [][][][][]
		// [][][][][]
		// [][][][][]
		
		// 배열 크기 : 행
		System.out.println("배열 행 크기: " + arr.length );
		
		// 배열 크기 : 열
		System.out.println("배열 열 크기: " + arr[0].length);
		
		
		System.out.println("배열 입력 : ");
		// 바깥쪽 for -> 행 (i)
		for (int i = 0; i < arr.length; i++) {
			// 안쪽 for -> 열 (j)
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print( arr[i][j] + " " );
			}
			System.out.println();
		}
		
		
		
	}
}









