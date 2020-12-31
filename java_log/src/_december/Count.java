package _december;

public class Count {
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9,10};
		int count =0;
		
		for(int i=0; i<data.length; i++) {
			if(data[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
