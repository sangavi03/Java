package com.ex;
import java.util.Set;

public class Student {

	private int studentId;
	private String studentName;
	private int marks;
	public Student(int studentId, String studentName, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	void display() {
		System.out.println(studentId+ " "+studentName+" "+marks);
	}
	
	
}
