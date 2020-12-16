package chap04;

import java.util.Scanner;

public class SwitchStringExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("직급(부장,과장,그외): ");
		String n =sc.next();
		String position =n;
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
		System.out.println("500만원");
		break;
		default:
			System.out.println("300만원");
		}
	}
}
