package com.jd.gson.practice;

import java.util.List;

public class Student {

	private Integer id;
	private String name;
	private List<Address> addresses;

	public Student(Integer id, String name, List<Address> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
