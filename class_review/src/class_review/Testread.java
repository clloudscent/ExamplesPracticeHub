package class_review;

//파일명: Testread
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
