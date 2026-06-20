package com.ibm.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ibm.demo.config.AppConfig;
import com.ibm.demo.model.Employee;

public class SpringJavaConfigDemo {
	public static void main(String[] args) {
		System.out.println("Start");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.toString());

		((AbstractApplicationContext) context).close();
		System.out.println("End");
	}
}
