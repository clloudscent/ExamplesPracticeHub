package chap04;
//두자리합이 5이면 멈추는 코드
public class quiz01 {
	public static void main(String[] args) {    
    while(true) {
        int num1 = (int) (Math.random()*6) +1;//num1에는 1에서 6까지 랜덤을 얻은 것을 할당한다
        int num2 = (int) (Math.random()*6) +1;//num2에는 1부터 6까지 랜덤을 얻은 것을 할당한다
        System.out.println("(" + num1 + "," + num2 + ")");//출력결과와 일치하는 형태를 잡아줌
        if((num1 + num2) == 5) { //만약 num1과 num2가 합해서 5가되면 break가 작동
        	break;
         }
      }
    }
 }
