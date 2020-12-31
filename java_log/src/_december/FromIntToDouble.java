package _december;

public class FromIntToDouble {
	public static void main(String[] args){
		int num1 = 123456780;
		int num2 = 123456780;

		double num3 = num2;//num2는 값을 num3에 
		//넣어줌
		num2 = (int) num3; //num3 int로 캐스팅


		int result = num1 - num2;
		// num1도 num2도 원래 값이 같으니까 캐스팅이후에 값이 변하지않았다면 결과는 0
		System.out.println(result);
		}
		} //자바에서는 실수를 표현하거나 다룰때 
		//double형
