package com.antriksh.sigletondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ScopeTest obj1=context.getBean("scopeTest",ScopeTest.class);
		System.out.println(obj1);
		
		
		
		/*
		 * ApplicationContext context2 = new
		 * ClassPathXmlApplicationContext("beans2.xml"); ScopeTest
		 * obj2=context2.getBean("scopeTest",ScopeTest.class); System.out.println(obj2);
		 */
		
		/*
		 * School sc=context.getBean("school",School.class); //School
		 * sc1=context.getBean("School",School.class);
		 * //context.getBean("student",Student.class);
		 * System.out.println(sc.getStudent()); System.out.println(sc.getStudent());
		 */
		
		/*
		 * Student stu= context.getBean("student", Student.class);
		 * stu.setName("Sandeep"); System.out.println(stu.getName()); Student stu2=
		 * context.getBean("student", Student.class);
		 * System.out.println(stu2.getName());
		 */
		
		
		/*
		 * PrototypeDemo obj1 = context.getBean("prototypeDemo",PrototypeDemo.class );
		 * PrototypeDemo obj2 = context.getBean("prototypeDemo",PrototypeDemo.class );
		 * System.out.println(obj1 +" "+ obj2); if(obj1==obj2) {
		 * System.out.println("same object created"); } else {
		 * System.out.println("both object not same"); }
		 */
		/*SingletonDemo obj1 = context.getBean("sigleton",SingletonDemo.class );
		SingletonDemo obj2 = context.getBean("sigleton",SingletonDemo.class );
		System.out.println(obj1 +" "+ obj2);
		if(obj1==obj2) {
			System.out.println("same object created");*/
		//}
	}

}
