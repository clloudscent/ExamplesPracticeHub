package chap05;

public class Excercise07 {
	public static void main(String[] args) {
//		int max = 0;
		int max = Integer.MIN_VALUE;
		
		int[] array = { 1, 5, 3, 8, 2 };
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);
		
		int min = Integer.MAX_VALUE;
		int [] array2 = { 1, 2, 3, 4, 5 };
		for (int k = 0; k <array2.length; k++) {
			if(min > array2[k]) {
				min = array2[k];
			}
		}
		System.out.println("min: " + min);
		
		
	}
	

}
	
