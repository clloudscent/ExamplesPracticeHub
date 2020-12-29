package class_review;
import java.io.*;
public class StuInfo implements java.io.Serializable{
	String name; int age;
	StuInfo(String name, int age){
		this.name = name; this.age = age; 
	}
	void printInfo() {System.out.println("name:" +  name); System.out.println("age:" + age);
	}
	}
	



