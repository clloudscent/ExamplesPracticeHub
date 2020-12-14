package _december;
// 문자배열역순으로 출력하기

public class _dec04 {
	public static void main(String[] args) {
		String slist[] = { "Seoul","Busan","Tokyo","Osaka"};
		System.out.print("원래의배열:");
		int i;
		
		for(i=0; i<slist.length; i++) {
			System.out.print(slist[i]+" ");
		}		
				System.out.println();
				
								
		System.out.print("역순된배열:");
		for(i=slist.length-1; 0<=i; i--) {
			System.out.print(slist[i]+" ");
			
			
		}
								
	}

}
