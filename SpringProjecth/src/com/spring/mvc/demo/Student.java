package com.spring.mvc.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="studentId")
	private int studentId;
	
	@Pattern(regexp="[A-Z][a-z]{4,}",message="name should start with capital and should be greater than 5 char.")
	private String fname;

	
	
	@NotEmpty(message="last Name can not be blank ")
	@Size(max=20 ,min=5,message=" last name >=5 and <=20 chars ")
	
	private String lname;
	
	private String mobno;
	

	@Max(value=50,message="Age should be <=50 ")
	@Min(value=20,message="Age should be >=20 ")
	private int age;
	
	
	@NotNull(message="please select the gender")
	private String gender;
	@NotNull(message="please select the city")
	private String city;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fname=" + fname + ", lname=" + lname + ", mobno=" + mobno
				+ ", age=" + age + ", gender=" + gender + ", city=" + city + "]";
	}
	
	

}
