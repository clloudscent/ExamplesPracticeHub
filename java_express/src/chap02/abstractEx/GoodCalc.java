package chap02.abstractEx;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double avg = 0.0;
		int sum = 0;
		
		for (int i : a) {
			sum += i;
		}
		avg = sum / a.length;
		return avg;
	}
	
}
