package chap02.inheritance;

public class jiwoo {
	public static void main(String[] args) {
		// 객체 생성
		// [클래스타입] [객체명] = new [클래스타입]();
		Pikachu pikachu = new Pikachu();
		
		System.out.println("########## 피카츄 ##########");
		System.out.println("에너지 : " + pikachu.energy);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("공격 A : " + pikachu.aAttack());
		System.out.println("공격 B : " + pikachu.bAttack());
		
		System.out.println();
		
		Pikachu pikachu20 = new Pikachu(150, "adv");
		
		System.out.println("########## 피카츄(Lv.20) ##########");
		System.out.println("에너지 : " + pikachu20.energy);
		System.out.println("타입 : " + pikachu20.type);
		System.out.println("공격 A : " + pikachu20.aAttack());
		System.out.println("공격 B : " + pikachu20.bAttack());
		
		System.out.println();
		
		
		
		Raichu raichu = new Raichu();
		
		System.out.println("########## 라이츄 ##########");
		System.out.println("에너지 : " + raichu.energy);
		System.out.println("타입 : " + raichu.type);
		System.out.println("공격 A : " + raichu.aAttack());
		System.out.println("공격 B : " + raichu.bAttack());
		
		System.out.println();
		
		Raichu raichu40 = new Raichu(400, "super-thunder");
		
		System.out.println("########## 라이츄(Lv.40) ##########");
		System.out.println("에너지 : " + raichu40.energy);
		System.out.println("타입 : " + raichu40.type);
		System.out.println("공격 A : " + raichu40.aAttack());
		System.out.println("공격 B : " + raichu40.bAttack());
		
		
		
		
	}
}
