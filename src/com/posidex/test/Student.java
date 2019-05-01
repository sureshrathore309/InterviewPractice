package com.posidex.test;

import java.io.Serializable;

public class Student implements Serializable{
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	private transient int id;
	private transient String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
