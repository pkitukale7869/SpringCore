package com.sk.ref;

public class Person {
	private String name;
	private int personId;
	private Certi certi;

	public Person(String name, int personId, Certi cert) {
		this.name = name;
		this.personId = personId;
		this.certi=cert;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + "]";
	}

}
