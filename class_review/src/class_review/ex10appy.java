package class_review;

public class ex10appy { 
	public static void main(String[] args) {
	  
	  // 로또 예제(1~45) 번호 중 6개 출력(중복 X)
	  
	  int[] lotto = new int[45];
	  
	  for(int i=0; i<lotto.length; i++) {
	   lotto[i] = (i + 1);
	   System.out.print(lotto[i] +", "); // 1부터 45의 숫자 출력
	  }
	  System.out.println();
	  
	  
	  int temp = 0;
	  // lotto = {1, 2, 3, 4, 5, 6, ... 44, 45}
	  for(int i =0; i<100; i++) {
	   int idx = (int)(Math.random() * lotto.length); // 임의의 인덱스 번호
	   
	   // 정렬
	   temp = lotto[0]; // temp에 원래 lotto[0] 의 값을 담아준다.
	   lotto[0] = lotto[idx];
	   lotto[idx] = temp;
	  }


	  System.out.println("====== 금주의 로또 당첨 번호 ======");
	  for(int i = 0; i<6; i++) {
	  
	   System.out.print(lotto[i] + "  ");
	  }
   }
}

	
