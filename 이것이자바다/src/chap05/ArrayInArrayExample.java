package chap05;

public class ArrayInArrayExample {
	public static void main(String[] args) {

		int[][] mathScores = new int[2][3];
		//배열 2행 3열짜리 생성하고 mathScores 2차원배열타입이 적용된 배열변수에 저장이됨
		for (int i = 0; i < mathScores.length; i++) { //2보다 작을 떄 까지//행에 대한 것
			for (int k = 0; k < mathScores[i].length; k++) {//열에 대한것
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		System.out.println();

		int[][] englishScores = new int[2][];
		//2행의 배열 객체를 생성해서 2차원 배열 객체 자료형이 적용된 englishScores변수에 저장한다.
		englishScores[0] = new int[2];
		//2칸의 배열객체를 0번 인덱스에 할당한다. 이로서 0번행은 2열이 됨.
		englishScores[1] = new int[3];
		//3칸의 배열객체를 1번 인덱스에 할당한다. 이로서 1번행은 3열이 됨.
		for (int i = 0; i < englishScores.length; i++) { //행에 대한 for문
			for (int k = 0; k < englishScores[i].length; k++) { //열에 대한 for문 
 				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}
		System.out.println();

		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } }; //2차원배열 int형 javaScores 배열변수에 숫자데이터를 넣음
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
			}
		}
	}
}
