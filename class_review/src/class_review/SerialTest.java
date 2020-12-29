package class_review;
import java.io.*;
public class SerialTest {
	public static void main(String[] args) {
		try{ObjectOutputStream out =
				new ObjectOutputStream(new FileOutputStream("a.dat"));
		StuInfo s1 = new StuInfo("hin",27); StuInfo s2 = new StuInfo("John",25);
		out.writeObject(s1);
		out.writeObject(s2);
		out.close();
				} catch(Exception e) {
					System.out.println(e);
				}
	}

}
