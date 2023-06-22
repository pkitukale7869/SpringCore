package com.sk.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Student student1 = (Student) context.getBean("student1");
    	Student student3 = (Student) context.getBean("student3");
    	System.out.println(student1);
    	System.out.println(student3);
    }
}
