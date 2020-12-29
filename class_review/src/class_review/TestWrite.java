package class_review;


	import java.io.*;
	class Testwrite {
	public static void main(String[] args) {
	try {
	FileWriter fw = new FileWriter("multiplicationTable.txt");
	//멀티플리케이션테이블.txt를 파라메터매개변수로 받은 FIleWriter클래스의 객체를 
	//새로 만들어서 FileWriter클래스타입을 받은 fw객체변수에 저장함
	for (int i = 5; i < 10; i++) {
	//i는 5부터 10보다 작을때까지만 반복
	for (int j = 5; j < 10; j++) {
	//j는 5부터 10보다 작을때까지만 반복
	fw.write(i + "x" + j + "=" + (i * j) + "  ");
	//FileWriter객체변수에서 write메서드가 작동을 해서 i와 j가 서로 곱하는 식을 반복함
	            }
	    fw.write("\n");
	//한회차의 반복이 종료가 되면 한줄을 개행해준다
	    }
	    fw.close();
	//모든 반복이 끝나면 FileWriter객체변수 fw를 닫아준다
	        } catch (IOException e) {
	//입출력에서 문제가 생기면 입출력예외처리를 해준다
	//이경우 어디에서 문제가 생겼다는 에러메시지를 출력해줌
	            System.out.println(e);    }
	    }   }


