package com.antriksh.sigletondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class School {

	@Autowired
	private Student student;
	public School(Student student) {
		super();
		this.student = student;
	}
	public School() {
		// TODO Auto-generated constructor stub
		System.out.println("school object created");
	}
	public Student createStudentObject() {
		return null;
	}
	
	/*
	 * public Student createStudentObject() { return
	 * context.getBean("student",Student.class);; }
	 */
	@Lookup
	public Student getStudent() {
		Student student=createStudentObject();
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
