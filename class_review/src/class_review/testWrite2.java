package class_review;
import java.io.*;
class testWrite2 {
public static void main(String[] args) {
try {
FileWriter fw = new FileWriter("testdata.txt");
String news = "국내서도 확인된 영국발 '변이' 바이러스…"전염력 최대 70%↑"+"영국에서 유행하는 신종 코로나바이러스 감염증(코로나19) 변이 바이러스가 국내에도 유입된 것으로 28일 확인되면서 이 바이러스의 실체에도 관심이 쏠리고 있다.

아직 변이 바이러스에 대한 모든 사실이 규명되지 않았으나 기존 바이러스보다 전파 속도가 빠른 것으로 확인되고 있어 주의가 요구된다. 영국 현지에서는 최근의 코로나19 환자 폭증 원인으로 변이 바이러스가 지목되고 있다.

의료계에 따르면 영국에서 확산하기 시작해 국내에도 유입된 코로나19 변이 바이러스는 지난 9월 영국 잉글랜드 남동부에서 처음 출현했다.

이후 영국 정부가 지난 14일(현지시간) 세계보건기구(WHO)에 유전자 분석을 통해 확인한 변이 바이러스를 보고하면서 전 세계의 이목이 쏠렸다. 당시 영국 정부는 코로나19 환자의 급격한 증가세가 변이 바이러스의 출현에 영향을 받은 것으로 추정했다.";
   fw.write("news");
   fw.close();
      } catch (IOException e) {
         System.out.println(e);   }
   }   }
import java.io.*;
class Testread {
public static void main(String[] args) {      try {
FileReader fr = new FileReader("multiplicationTable.txt");
int i;
while ((i = fr.read()) != -1) {
char c = (char) i;   System.out.print(c);
         }   fr.close();
      } catch (IOException e) {
         System.out.println(e);      }
   }   }
