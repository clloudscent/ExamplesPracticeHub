package chap01.datatype;

public class intEx {
	public static void main(String[] args) {
		int max = 2147483647;
		int min = -2147483648;
		long lmax = 9223372036854775807L;
		long lmin = -9223372036854775808L;
		
		System.out.println("int 표현 범위");
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		System.out.println();
		
		System.out.println("long 표현 범위");
		System.out.println("lmax : " + lmax);
		System.out.println("lmin : " + lmin);
	}
}
