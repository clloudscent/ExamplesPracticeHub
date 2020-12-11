package class_review;
/*
 * 1. 정수형 배열 변수 a에 5개의 저장공간을 설정하고 4,2,1,7,10의 값을 저장함
 * 2. for을 활용해서 i에 배열변수 안에 들어있는 5개의 누적합을 구하고 sum을 출력
 */

public class ex05 {
	public static void main(String[] args) {
		int i;
		int sum=0;
		
		int []a= {4,2,1,7,10};
		for(i=0; i<5; i++) {
			sum+=a[i];}
			System.out.println(sum);
		}
		
		
		
	}


