package com.sk.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sk/collections/collectionapplicationContext.xml");
		Emp emp1 = (Emp) context.getBean("person1");
//		System.out.println(emp1);
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourse());

	}
}
