package class_review;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insert QUIT..");
		while(!(sc.nextLine()).contentEquals("QUIT")) {
			System.out.println("Not Match");
		}
	}

}
