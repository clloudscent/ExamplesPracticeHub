package chap04;
//홀수나오게하기
public class ContinueExampleapply {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2==0) { //즉 (i%2==0 은 2로 나눈 나머지가 0일경우)(i%2!=0은 2로 나눈 나머지가 0이 아닐경우)
				continue;
			}
			System.out.println(i);
		}
	}
}
