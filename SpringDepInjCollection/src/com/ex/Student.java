package com.ex;
import java.util.Set;

public class Student {

	private int studentId;
	private String studentName;
	//can be used with List and Map
	private Set courses;
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
	public Set getCourses() {
		return courses;
	}
	public void setCourse(Set courses) {
		this.courses = courses;
	}
	
	
	
}
