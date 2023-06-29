package com.sk.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ciApplicationContext.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
	}

}
