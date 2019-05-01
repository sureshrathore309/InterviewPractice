package com.posidex.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persist {
	public static void main (String []args) throws Exception {
		Student s1 = new Student(10, "Ashutosh");
		FileOutputStream fout = new FileOutputStream(new File("1.txt"));
		ObjectOutputStream  objectOut = new ObjectOutputStream(fout);
		objectOut.writeObject(s1);
		objectOut.flush();
		System.out.println("Object is serialized");
		FileInputStream fInput = new FileInputStream(new File("1.txt"));
		ObjectInputStream in = new ObjectInputStream(fInput);
		Student s = (Student) in.readObject();
		System.out.println(s);
		System.out.println("Deserialized");
		

	}
}
