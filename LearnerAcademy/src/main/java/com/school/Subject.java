package com.school;

public class Subject {

	private long SUBJECT_ID;
	private String subjectname;
	
	public Subject() {
		
	}
	
	public Subject(String subjectname) {
		super();
		this.subjectname = subjectname;
		
	}

	public long getSUBJECT_ID() {
		return SUBJECT_ID;
	}

	public void setSUBJECT_ID(long sUBJECT_ID) {
		SUBJECT_ID = sUBJECT_ID;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	
}
