package chap01.array.oneD;

public class ArraySearch {
	public static void main(String[] args) {
//		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int b[] = {2,4,6,8,10,12,14,18,20};
		int cnt = 0;
		
		// 이중 반복문
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if( a[i] == b[j] ) {
					int temp = a[i];
					cnt = cnt + 1;
					System.out.println("일치 : " + temp);
					System.out.println("개수 : " + cnt);
					System.out.println();
				}
			}
		}
	}
}
