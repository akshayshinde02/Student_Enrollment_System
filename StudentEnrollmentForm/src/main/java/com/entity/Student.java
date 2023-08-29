package com.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

@Entity
@Table(name = "student_table")
public class Student {


    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    

    private String fullName;
    
  
    private String className;
    

    private String birthDate;
    

    private String address;
    
  
    private String enrollmentDate;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNo, String fullName, String className, String birthDate, String address,
			String enrollmentDate) {
		super();
		this.rollNo = rollNo;
		this.fullName = fullName;
		this.className = className;
		this.birthDate = birthDate;
		this.address = address;
		this.enrollmentDate = enrollmentDate;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fullName=" + fullName + ", className=" + className + ", birthDate="
				+ birthDate + ", address=" + address + ", enrollmentDate=" + enrollmentDate + "]";
	}

	
    
   
}
