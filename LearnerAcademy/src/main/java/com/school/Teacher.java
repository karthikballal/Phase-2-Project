package com.school;

public class Teacher {

	private long TEACHER_ID;
	private String teachername;
	
	public Teacher() {
		
	}
	
	public Teacher(String teachername) {
		super();
		this.teachername = teachername;
	}

	public long getTEACHER_ID() {
		return TEACHER_ID;
	}

	public void setTEACHER_ID(long tEACHER_ID) {
		TEACHER_ID = tEACHER_ID;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	
	
}
