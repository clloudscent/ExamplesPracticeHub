package oneArray;

import java.util.Scanner;

/*
 * 입력

첫째 줄에 데이터의 개수 n이 입력된다. ( n <= 1,000 )둘째 줄에 공백을 기준으로 n개 데이터가 입력된다.n개의 데이터를 입력의 역순으로 출력한다.

<입력 예시>                 <출력 예시>
5
1 3 5 6 8               8 6 5 3 1
 */

public class _1402 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		for(int i=n-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}		
		
	}

}
