package com.school;

import java.util.Set;

public class Student {

	private long STUDENT_ID;
	private String firstname;
	private String lastname;
	private Set<Classroom> classroom;
	private Set<Teacher> teacher;
	private Set<Subject> subject;

	
	public Student() {
		
	}


	public long getSTUDENT_ID() {
		return STUDENT_ID;
	}


	public void setSTUDENT_ID(long sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Set<Classroom> getClassroom() {
		return classroom;
	}


	public void setClassroom(Set<Classroom> classroom) {
		this.classroom = classroom;
	}


	public Set<Teacher> getTeacher() {
		return teacher;
	}


	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}


	public Set<Subject> getSubject() {
		return subject;
	}


	public void setSubject(Set<Subject> subject) {
		this.subject = subject;
	}

	

}
