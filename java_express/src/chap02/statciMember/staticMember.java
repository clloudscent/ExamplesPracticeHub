package chap02.statciMember;

public class staticMember {
	 static int a;
	 static int b;
	 int c;
	 static final double PI = 3.141592;
	 
	 public static int sum(int a, int b) {
		 int sum = a+b;
		 return sum;
	 }
	 
	 
	 public static void main(String[] args) {
		 int sum = sum(10, 20);
		 a = 100;
		 staticMember sM1 = new staticMember();
		 staticMember sM2 = new staticMember();
		 int a1 = sM1.a;
		 int c1 = sM1.c = 10;
		 
		 int a2 = sM2.a;
		 int c2 = sM2.c = 20;
		 
		 System.out.println(a1);		// 100
		 System.out.println(c1);		// 10
		 System.out.println(a2);		// 100
		 System.out.println(c2);		// 20
		 
	 }
}
