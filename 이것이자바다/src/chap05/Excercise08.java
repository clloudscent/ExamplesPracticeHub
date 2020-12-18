package chap05;

public class Excercise08 {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		int count = 0;

		for (int i = 0; i < array.length; i++) { //행에 대한 for
			for (int k = 0; k < array[i].length; k++) { //열에 대한 for
				sum += array[i][k]; //누적합 sum을 위한 계산식
				count++; // ? //계싼을 할때 for문을 돌때마다 count가 증가함
				avg = (double) sum / count; //? //for문 끝나면 sum을 더블형으로 캐스팅(강제타입변환)하고 

			}

		}

		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);

	}

}
