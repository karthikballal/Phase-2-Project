package com.school;

public class Classroom {

	private long CLASS_ID;
	private String classname;
	
	public Classroom() {
		
	}
	
	public Classroom(String classname) {
		super();
		this.classname=classname;
	}

	public long getCLASS_ID() {
		return CLASS_ID;
	}

	public void setCLASS_ID(long cLASS_ID) {
		CLASS_ID = cLASS_ID;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	
	
	
}
