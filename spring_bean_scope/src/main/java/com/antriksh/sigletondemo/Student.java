package com.antriksh.sigletondemo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Scope("prototype")
public class Student {

	public Student() {
		System.out.println("student object created");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
