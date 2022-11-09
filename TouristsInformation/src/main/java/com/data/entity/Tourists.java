package com.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Tourists {
	@Id
	private int id;
	private String fname;
	private String lname;
	private String gender;
	private int age;
	private String fromplace;
	private int noofdays;
	public Tourists() {
		super();
	}
	public Tourists(int id, String fname, String lname, String gender, int age, String fromplace, int noofdays) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.fromplace = fromplace;
		this.noofdays = noofdays;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFromplace() {
		return fromplace;
	}
	public void setFromplace(String fromplace) {
		this.fromplace = fromplace;
	}
	public int getNoofdays() {
		return noofdays;
	}
	public void setNoofdays(int noofdays) {
		this.noofdays = noofdays;
	}

}
