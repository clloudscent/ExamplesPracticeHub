package twoArray;

import java.util.Scanner;

public class _1461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] arr = new int [N][N];
		int cnt =N;
		
		int[] a = new int[N];
		
		for(int i=0; i < arr.length; i++) {
			for (int j=0; j < arr[0].length; j++) {
				arr[i][j] = cnt--;
			}
		}
		
		for(int i=0; i < arr.length; i++) {
			for (int j=arr[0].length-1; j<=0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}								
	  }
	}
   
  
