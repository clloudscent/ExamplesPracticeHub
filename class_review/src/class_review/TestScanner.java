package class_review;

import java.util.Scanner;
class TestScanner {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);    
//Scanner클래스타입을 받은 sc객체변수에다가 Scanner클래스에 외부로부터 입력받는 상태(System.in)를 매개변수파라메터로 받고 이것을 객체로 만들어 저장한다. 
System.out.print("name:");
//name이라는 글씨를 찍어준다
String name = sc.nextLine();
//외부로 입력을 받을 수 있는 sc객체변수에서 nextLine메서드를 작동시킨다
//그러면 입력을 할 수있는데 이것을 받아다가 name변수에 저장함
System.out.print("age: ");
//age이라는 글씨를 찍어준다
int age = sc.nextInt();
//외부로부터 입력을 받을 수 있는 sc객체변수에서 nextInt메서드를 작동시킨다
//이번에는 정수를 입력받음
//정수를 받아서 int정수형 age변수에 저장함 
System.out.println("********회원정보********");
//회원정보를 저장
System.out.println("name:" + name);
//name의 변수에 들어있는 내용을 출력한다
System.out.println("age:" + age);
//age의 변수에 들어있는 내용을 출력한다
System.out.println("**********************");
    }
}