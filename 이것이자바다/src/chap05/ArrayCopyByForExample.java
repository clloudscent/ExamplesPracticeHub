package chap05;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 }; //중괄호 숫자 3개가 int정수형 배열 oldIntArray 변수에 할당
		int[] newIntArray = new int[5]; // 방5개짜리 int정수형 배열객체를 생성

		for (int i = 0; i < oldIntArray.length; i++) { //old배열의 길이보다 작을때까지만 for문을 반복함.
			newIntArray[i] = oldIntArray[i];
		}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ",");
		}
	}

}
