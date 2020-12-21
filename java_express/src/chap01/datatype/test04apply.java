package chap01.datatype;

import java.util.Scanner;

public class test04apply {
	
	public static void showMenu() {
		System.out.println("--------무인 초밥 메뉴--------");
		System.out.println("1.마구로(まぐろ)세트(10pc)");
		System.out.println("2. 아카미(赤身)세트(10pc)");
		System.out.println("3.붕장어(あなご)세트(8pc) ");
		System.out.println("0. (종료)");
		System.out.print("-----------번호입력 : ");		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0;
		String menu = "";
		
		do {
			showMenu();			
			num = sc.nextInt();
			
			if(num == 0)
				break;
			
			switch(num) {
			case 1:
				menu = "마구로(まぐろ)세트(10pc)";
				break;
				
			case 2:
				menu = "아카미(赤身)세트(10pc)";
				break;
				
			case 3:
				menu = "붕장어(あなご)세트(8pc)";
				break;
				
				default:
					break;
			}
			
			if(num <= 3)
				System.out.println("\'" + menu + "\'" + "이(/가) 주문되었습니다!!! \n");
			else
				System.out.println("메뉴번호를 입력해주세요 \n");
			
				
		} while(true);
	}

}
