package com.ex;

public class Student {

	private int studentId;
	private String studentName;
	private Course course;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Course getCourse() {
		return course;
	}
	public void Student(Course course) {
		this.course = course;
	}
	
	
}
