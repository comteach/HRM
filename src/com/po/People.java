package com.po;

import java.io.Serializable;

public class People implements Serializable{
	
	//避免对象不一致
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int age;
	private String sex;
	private String phone;
	private String email;
	private String school;
	private String post;
	private String salary;
	private String resume;
	private String date;
	
	public People() {
		
	}

	public People(int id, String name, int age, String sex, String phone, String email, String school, String post,
			String salary, String resume, String date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
		this.school = school;
		this.post = post;
		this.salary = salary;
		this.resume = resume;
		this.date = date;
	}

	public People(String name, int age, String sex, String phone, String email, String school, String post,
			String salary, String resume, String date) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
		this.school = school;
		this.post = post;
		this.salary = salary;
		this.resume = resume;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", phone=" + phone + ", email="
				+ email + ", school=" + school + ", post=" + post + ", salary=" + salary + ", resume=" + resume
				+ ", date=" + date + "]";
	}
	
	
	
}
