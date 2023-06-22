package com.sk.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phone;
	private Set<String> address;
	private Map<String, String> course;
	private Properties props;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, List<String> phone, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.course = course;
	}

	public void setName(String name) {
		System.out.println("Inside Name Setting");
		this.name = name;
	}

	public void setPhone(List<String> phone) {
		System.out.println("Inside Phone Setting");
		this.phone = phone;
	}

	public void setAddress(Set<String> address) {
		System.out.println("Inside Address Setting");
		this.address = address;
	}

	public void setCourse(Map<String, String> course) {
		System.out.println("Inside Course Setting");
		this.course = course;
	}

	public String getName() {
		System.out.println("Inside Get Method of NAME");
		return name;
	}

	public List<String> getPhone() {
		System.out.println("Inside Get Method of PHONE");
		return phone;
	}

	public Set<String> getAddress() {
		System.out.println("Inside Get Method of ADDRESS");
		return address;
	}

	public Map<String, String> getCourse() {
		System.out.println("Inside Get Method of COURSE");
		return course;
	}

}
