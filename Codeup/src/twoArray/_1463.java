package twoArray;

import java.util.Scanner;

public class _1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int [][] arr = new int [N][N];
		int cnt =1;
		
		for (int j =0; j<arr.length; j++) {
			for(int i=arr[0].length-1; i>=0; i--) {
				arr[i][j] =cnt++;
			}
		}
		
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
