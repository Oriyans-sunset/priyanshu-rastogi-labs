package com.ibm.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import com.ibm.demo.model.Employee;

@ComponentScan
public class SpringAnnotationDemo {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAnnotationDemo.class);
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.toString());

		((AbstractApplicationContext) context).close();
		System.out.println("End");
	}
}
